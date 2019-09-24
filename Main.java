package com.company;
import java.util.*;

public class Main {
    int id;
    String name;
    int age;
    long ph_no;
    public Main(int id, String name, int age, long ph_no){
        this.id = id;
        this.name = name;
        this.age = age;
        this.ph_no = ph_no;

    }
    public static void main(String[] args){
        HashMap<Integer,Main> hm = new HashMap<Integer,Main>();
        Main p1 = new Main(1001,"ABC",18,9876543210l);
        Main p2 = new Main(1002,"JKL",18,9876543210l);
        Main p3 = new Main(1003,"GHI",18,9876543210l);
        Main p4 = new Main(1004,"DEF",18,9876543210l);
        hm.put(1,p1);
        hm.put(2,p2);
        hm.put(3,p3);
        hm.put(4,p4);

        for(Map.Entry<Integer,Main> map: hm.entrySet())
        {
           int k = map.getKey();
            Main p = map.getValue();
            System.out.println(k+"   "+p.id+"   "+p.name+"   "+p.age+"   "+p.ph_no);
            }
    }
}