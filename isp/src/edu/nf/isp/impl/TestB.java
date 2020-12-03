package edu.nf.isp.impl;

import edu.nf.isp.TestBInf;

public class TestB implements TestBInf {

    @Override
    public void methodB() {
        System.out.println("test b...");
    }

    @Override
    public void methodC() {
        System.out.println("test c...");
    }
}
