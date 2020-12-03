package edu.nf.homework;

import java.sql.Connection;

public class Main {

    public static void main(String[] args) throws Exception{
        ConnectionPool pool=new ConnectionPool(5);
        System.out.println("连接池大小："+pool.size());
        Connection conn=pool.getConnection();
        System.out.println("连接池大小："+pool.size());
        //注意：调用conn的close方法时，将连接放回连接池
        conn.close();
        System.out.println("连接池大小："+pool.size());
    }
}
