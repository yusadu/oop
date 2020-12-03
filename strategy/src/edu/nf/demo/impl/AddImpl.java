package edu.nf.demo.impl;

import edu.nf.demo.Calculator;

import java.math.BigDecimal;

public class AddImpl implements Calculator {
    @Override
    public BigDecimal cal(BigDecimal numA, BigDecimal numB) {
        //加法运算
        return numA.add(numB);
    }
}
