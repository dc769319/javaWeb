package com.charles.generic;

import org.junit.Test;

import java.util.*;

public class TestGeneric {

    @Test
    public void testList(){
        List<String> list = new ArrayList<>();
        list.add("maomao");
        list.add("jianli");
        list.add("zongsh");
        Iterator<String> iterator = list.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }

        for(String item:list){
            System.out.println(item);
        }
    }

    @Test
    public void testMap(){
        Map<String,String> map = new HashMap<>();
        map.put("name","charles");
        map.put("age","23");
        map.put("classNo","C");
        Set<Map.Entry<String,String>> entrySet = map.entrySet();
        Iterator<Map.Entry<String,String>> iterator = entrySet.iterator();
        while(iterator.hasNext()){
            Map.Entry<String,String> entry = iterator.next();
            System.out.println(entry.getKey()+"=>"+entry.getValue());
        }
        System.out.println("=======================分割线=====================");
        for(Map.Entry<String,String> entry1:entrySet){
            System.out.println(entry1.getKey()+"-->"+entry1.getValue());
        }
    }
}
