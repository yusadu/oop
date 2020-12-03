package edu.nf.demo;

import edu.nf.demo.impl.AddImpl;

import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) {
        Calculator calculator=new AddImpl();
        BigDecimal numA=new BigDecimal("89.3");
        BigDecimal numB=new BigDecimal("27.4");
        //可以将BigDecimal转换为其他的基本数据类型，例如double类型
        System.out.println(calculator.cal(numA,numB).doubleValue());
        System.out.println(calculator.cal(numA,numB).longValue());

        //
        CalculatorContext context=new CalculatorContext("sub");
        System.out.println(context.cal(numA,numB));
    }
}
