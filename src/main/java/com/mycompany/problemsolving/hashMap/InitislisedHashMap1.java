package com.mycompany.problemsolving.hashMap;

import java.util.HashMap;
import java.util.Map;

public class InitislisedHashMap1 {
    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<Integer, String>();
        map.put(1, "one");
        map.put(2, "two");
        map.put(3, "three");
        map.put(4, "four");
        map.put(5, "five");
        System.out.println(map);
    }
}