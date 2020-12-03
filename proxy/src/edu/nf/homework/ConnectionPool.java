package edu.nf.homework;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.LinkedList;

public class ConnectionPool {
    /**
     * 连接池
     */
    private LinkedList<Connection> pool=new LinkedList();

    /**
     * 在构造方法中处世话连接池大小（从数据库初获取5个Connection放到pool中）
     */
    public ConnectionPool(int size){
        String url="jdbc:mysql://localhost:3306/demo?useSSL=false&useUnicode=true&characterEncoding=utf-8";
        try {
            Class.forName("com.mysql.jdbc.Driver");
            for (int i=0;i<size;i++){
                Connection connection= DriverManager.getConnection(url,"root","root");
                connection = (Connection)Proxy.newProxyInstance(
                        ConnectionPool.class.getClassLoader(),
                        new Class[]{Connection.class},
                        creactHandler(connection)
                );
                pool.add(connection);
            }
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }

    /**
     * 创建回调处理器
     */
    private InvocationHandler creactHandler(Connection connection){
        return (proxy, method, args) -> {
            if("close".equals(method.getName())){
                if(pool.size()==0 || pool.getLast()!=proxy){
                    //不能关闭连接，将连接还到连接池
                    pool.addLast((Connection)proxy);
                }
                return null;
            }else {
                return method.invoke(connection, args);
            }
        };
    }

    /**
     * 获取连接的方法
     * @return
     */
    public Connection getConnection(){
        if(pool.size()>0){
            return pool.removeFirst();
        }else{
            throw new RuntimeException("连接池无可用连接");
        }
    }

    public int size(){
        return pool.size();
    }
}
