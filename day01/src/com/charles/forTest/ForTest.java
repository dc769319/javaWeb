package com.charles.forTest;

import org.junit.Test;

import java.util.*;

public class ForTest {

    @Test
    public void test1(){
        //传统循环
        Map<String,Integer> m = new HashMap<>();
        m.put("key1",1);
        m.put("key2",3);
        m.put("key3",5);

        Set set = m.entrySet();
        Iterator iterator = set.iterator();
        while(iterator.hasNext()){
            Map.Entry entry = (Map.Entry) iterator.next();
            System.out.println(entry.getKey()+"=>"+entry.getValue());
        }
    }

    @Test
    public void test2(){
        //HashMap无法保证顺序，如果需要保证顺序可以使用LinkedHashMap
        Map<String,String> m = new LinkedHashMap<>();
        m.put("age","12");
        m.put("name","Charles");
        m.put("height","181cm");
        m.put("sex","male");
        m.put("color","yellow");
        m.put("github","dc769319");
        //使用keySet循环
        System.out.println("=================================keySet循环=============================");
        for(String key:m.keySet()){
            System.out.println(key+"=>"+m.get(key));
        }
        //使用entrySet
        System.out.println("=================================entrySet循环=============================");
        for(Map.Entry entry:m.entrySet()){
            System.out.println(entry.getKey()+"=>"+entry.getValue());
        }

    }

}
