package edu.nf.demo;

import java.math.BigDecimal;

public interface Calculator {

    /**
     * 数据库类型: decimal
     * 抽象的计算方法
     * @param numA
     * @param numB
     * @return
     */
    BigDecimal cal(BigDecimal numA,BigDecimal numB);
}
