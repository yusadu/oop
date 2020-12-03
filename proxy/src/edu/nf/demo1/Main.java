package edu.nf.demo1;

public class Main {

    public static void main(String[] args) {
        PcFactory proxy=new AcerProxy(new AcerFactory());
        proxy.sell(2500);
    }
}
