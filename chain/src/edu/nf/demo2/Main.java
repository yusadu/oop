package edu.nf.demo2;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        HttpServletRequest request=new HttpServletRequest();
        HttpServletResponse response=new HttpServletResponse();
        //创建FilterChain
        FilterChain chain=new FilterChain();
        chain.doExecute(request,response);
    }
}
