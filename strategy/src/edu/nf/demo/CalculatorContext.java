package edu.nf.demo;

import edu.nf.demo.impl.AddImpl;
import edu.nf.demo.impl.DivImpl;
import edu.nf.demo.impl.MultiImpl;
import edu.nf.demo.impl.SubImpl;

import java.io.IOException;
import java.math.BigDecimal;
import java.util.Properties;

/**
 * 策略上下文
 * 核心作用就是根据客户端的需求，来创建和调用具体的策略实现类
 */
public class CalculatorContext {
    /**
     * 计算器接口
     */
    private Calculator calculator;

    /**
     * 构造方法
     * @param option 选择参数，由客户端提供
     *               例如当option的值为add时，表示要执行加法计算
     */
    public CalculatorContext(String option){

//        if("add".equals(option)){
//            calculator=new AddImpl();
//        }else if("sub".equals(option)){
//            calculator=new SubImpl();
//        }else if("multi".equals(option)){
//            calculator=new MultiImpl();
//        }else if("div".equals(option)){
//            calculator=new DivImpl();
//        }else {
//            throw new RuntimeException("暂不支持此计算");
//        }

        //创建Properties对象
        Properties prop=new Properties();
        //加载资源文件
       try{
           prop.load(CalculatorContext.class.getClassLoader().getResourceAsStream("calculator.properties"));
           //根据传入的参数获取对应的值
           String className=prop.getProperty(option);
           //根据完整类名创建实例
           calculator=(Calculator)Class.forName(className).newInstance();
       }catch (Exception e){
           e.printStackTrace();
       }
    }

    /**
     * 封装了实现类方法的调用
     * @param numA
     * @param numB
     * @return
     */
    public BigDecimal cal(BigDecimal numA,BigDecimal numB){
        return calculator.cal(numA,numB);
    }


}
