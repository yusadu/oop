package edu.nf.ocp;

public class Calculator {
    /**
     * 定义一个计算的方法
     * @param a
     * @param b
     * @param option
     * @return
     */
    public double cal(double a,double b,String option){
        if("+".equals(option)){
            return a+b;
        }else if("-".equals(option)){
            return a-b;
        }else {
            return 0;
        }
    }

    /**
     * 加法
     * @param a
     * @param b
     * @return
     */
    public double add(double a,double b){
        return a+b;
    }

    /**
     * 减法
     * @param a
     * @param b
     * @return
     */
    public double sub(double a,double b){
        return a-b;
    }
}
