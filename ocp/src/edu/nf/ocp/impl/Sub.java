package edu.nf.ocp.impl;

import edu.nf.ocp.CalInf;

public class Sub implements CalInf {

    @Override
    public double calculator(double a, double b) {
        return a-b;
    }
}
