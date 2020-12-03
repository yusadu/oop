package edu.nf.demo.impl;

import edu.nf.demo.Calculator;

import java.math.BigDecimal;

public class DivImpl implements Calculator {
    @Override
    public BigDecimal cal(BigDecimal numA, BigDecimal numB) {
        //除法运算
        return numA.divide(numB);
    }
}
