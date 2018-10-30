package com.charles.reflect;

import org.junit.Test;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * 测试反射的构造函数、方法
 */
public class ReflectTest {

    @Test
    public void testField(){
        try {
            Person p = new Person("Lily",12);
            Class clazz = Class.forName("com.charles.reflect.Person");
            //共有属性
            Field f = clazz.getField("age");
            System.out.println(f.get(p));
            //静态属性
            Field f1 = clazz.getField("sex");
            System.out.println(f1.get(null));

            //私有属性
            Field f2 = clazz.getDeclaredField("name");
            f2.setAccessible(true);
            System.out.println(f2.get(p));

        } catch (ClassNotFoundException|NoSuchFieldException|IllegalAccessException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void testMethod(){
        try {
            Class clazz = Class.forName("com.charles.reflect.Person");
            //得到带参构造器
            Constructor c = clazz.getConstructor(String.class,int.class);
            Person p = (Person) c.newInstance("Maomao",12);
            System.out.println(p.getPerson());

            //调用Person的main方法
            Method main = clazz.getMethod("main",String[].class);
            //第一种方式
            main.invoke(null,(Object)(new String[]{""}));
            //第二种方式
            main.invoke(null,new Object[]{new String[]{""}});

            //得到public 带一个字符串类型参数的say方法
            Method m1 = clazz.getMethod("say",String.class);
            //静态方法无需传对象
            m1.invoke(null,"hello");

            Method m2 = clazz.getMethod("say",String.class,int.class);
            m2.invoke(new Person(),"John",2);

            Method m3 = clazz.getMethod("say",int[].class);
            m3.invoke(new Person(),new int[]{1,6,8});

            Method m4 = clazz.getDeclaredMethod("say",String.class,String[].class);
            m4.setAccessible(true);
            m4.invoke(new Person(),"Micro",new String[]{"lili","maomao"});

        } catch (InstantiationException|ClassNotFoundException|NoSuchMethodException|IllegalAccessException|InvocationTargetException e) {
            e.printStackTrace();
        }
    }
}
