package edu.nf.demo.impl;

import edu.nf.demo.Calculator;

import java.math.BigDecimal;

public class MultiImpl implements Calculator {
    @Override
    public BigDecimal cal(BigDecimal numA, BigDecimal numB) {
        //乘法运算
        return numA.multiply(numB);
    }
}
