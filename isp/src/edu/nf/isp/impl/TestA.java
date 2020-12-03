package edu.nf.isp.impl;

import edu.nf.isp.TestAInf;
import edu.nf.isp.TestBInf;

/**
 * 接口污染
 */
public class TestA implements TestAInf {
    @Override
    public void methodA() {
        System.out.println("test a...");
    }

}
