package edu.nf.compare;

import edu.nf.demo2.Filter;
import edu.nf.demo2.FilterA;
import edu.nf.demo2.FilterB;
import edu.nf.demo2.FilterC;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortTest {
    public static void main(String[] args) {
        List<Integer> list=new ArrayList<>();
        list.add(10);
        list.add(8);
        list.add(5);
        list.add(9);
        list.add(6);
        list.add(7);
        list.forEach(integer -> System.out.println(integer));
        System.out.println("-----------------------");
        Collections.sort(list);
        list.forEach(integer -> System.out.println(integer));

    }
}
