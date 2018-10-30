package com.charles.hello;

import java.util.ArrayList;
import java.util.List;

public class Hello {
    public static void main(String[] args){
        int a = 11;
        int b = 12;
        int c = plus(a,b);
        List<String> li = new ArrayList<String>();
        System.out.print(c);
    }

    private static int plus(int a, int b){
        return a+b;
    }
}
