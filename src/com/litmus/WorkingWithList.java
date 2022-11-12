package com.litmus;

import java.util.ArrayList;
import java.util.List;

public class WorkingWithList {
    public  static void main(String[] args){
        List<String> colors = new ArrayList<>();
        colors.add("blue");
        colors.add("green");
        colors.add("yellow");

        System.out.println( colors.size());
        System.out.println( colors.contains("blue"));
        System.out.println( colors.contains("pink"));
        System.out.println( colors);

        for(String color : colors){
            System.out.println("----normal loop----");
            System.out.println(color);
        }
        colors.forEach(System.out::println);
        for (int i = 0; i < colors.size(); i++) {
            System.out.println(colors.get(i));

        }
    }
}
