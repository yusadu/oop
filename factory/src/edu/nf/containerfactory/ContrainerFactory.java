package edu.nf.containerfactory;

import com.sun.xml.internal.fastinfoset.tools.StAX2SAXReader;

import java.lang.reflect.Method;
import java.sql.Connection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class ContrainerFactory {
    /**
     * 创建一个核心容器，用于存放已经创建的实例
     */
    private static Map<String,Object> container=new HashMap<>();

    public ContrainerFactory(){
        //执行类扫描
        Set<String> classesName=ScanUtils.scanPackage();
        //执行类解析，将带有注解的Class进行初始化并保存到容器中
        resolveClass(classesName);
    }

    /**
     * 解析Class，找到@Bean注解的类，并创建实例保存到map集合中
     * @param classesName
     */
    private void resolveClass(Set<String> classesName){
        for (String className:classesName) {
            //执行类加载，得到Class对象
            try {
                //类加载
                Class<?> clazz = Class.forName(className);
                //解析注解
                if(clazz.isAnnotationPresent(Bean.class)){
                    //获取注解的value属性的值，也就是别名
                    String clazzName = clazz.getAnnotation(Bean.class).value();
                    //将注解的value作为key，类的实例作为value缓存到map集合中
                    container.put(clazzName, clazz.newInstance());
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    /**
     * 提供一个从容器获取bean对象的方法
     * @param name 对应容器中的key
     * @param <T>
     * @return
     */
    public <T> T getContainerBean(String name){
        return (T)container.get(name);
    }
}
