package com.litmus;

import java.util.HashMap;
import java.util.Map;

public class WorkingWithMaps {
    public static  void main(String [] args){
        Map<Integer, Person> map = new HashMap<>();
        map.put(1, new Person("Aang"));
        map.put(2, new Person("Alex"));
        map.put(3, new Person("Zainab"));
        map.put(3, new Person("Zainab"));
        System.out.println(map);
        System.out.println(map.size());
        System.out.println(map.get(1));
        System.out.println(map.containsKey(4));
        System.out.println(map.keySet());
        System.out.println(map.entrySet());
        map.entrySet().forEach(x -> System.out.println(x.getKey() + " " + x.getValue()));


    }
    record Person(String name){}
}
