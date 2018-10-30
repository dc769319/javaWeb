package com.charles.reflect;

public class Person {

    public static String sex = "male";

    private String name;

    public int age;

    public Person(String name, int age){
        this.name = name;
        this.age = age;
    }

    public String getPerson(){
        return this.name + this.age;
    }

    public Person(){}

    public static void say(String str){
        System.out.println(str);
    }

    public void say(String str, int age){
        System.out.println(str+"=>"+age);
    }

    public void say(int[] nums){
        int sum = 0;
        for(int i:nums){
            sum+=i;
        }
        System.out.println("sum:"+sum);
    }

    private void say(String name, String[] po){
        System.out.print(name+" told ");
        for(String p:po){
            System.out.print(p+" and ");
        }
    }

    public static void main(String[] args){
        System.out.println("main method");
    }
}
