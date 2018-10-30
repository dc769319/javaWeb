package com.charles.generic;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

/**
 * 类上面声明泛型
 * @param <P>
 * @param <Q>
 * @param <R>
 */
public class Generic<P,Q,R> {
    /**
     * 类中非静态字段以及非静态方法可使用类上面声明的泛型
     */
    public P per;

    public <T,K> void testFun(T pa,K lo){
        List<T> li = new ArrayList<>();
        li.add(pa);
        System.out.println(lo);
        for(T t:li){
            System.out.println(t);
        }
    }

    /**
     * 静态方法的泛型声明必须放在static后面，且不能使用类声明的泛型
     * @param t
     * @param s
     * @param <T>
     * @param <S>
     */
    public static <T,S> void testSta(T t, S s){
        System.out.println(t);
        System.out.println(s);
    }

    public void printText(Q q, R r){
        System.out.println(q);
        System.out.println(r);
    }

    public void serPer(P p){
        this.per = p;
    }

    public P getPer(){
        return per;
    }

    @Test
    public void testT(){
        testFun("haha",1);
    }

    public static void main(String[] args){
        Generic<String,Integer,Long> g = new Generic<>();
        g.serPer("sd");
        System.out.println(g.getPer());

        g.printText(12,154L);
        g.revArr(new String[]{"ss","dd","qq","rr","uu","pp"});

        Generic.testSta("sd",123);

    }

    /**
     * 反转数组元素
     * @param arr
     * @param <T>
     */
    public <T> void revArr(T[] arr){
        int start = 0;
        int end = arr.length - 1;
        while (end > start){
            T tmp = arr[end];
            arr[end] = arr[start];
            arr[start] = tmp;
            start++;
            end--;
        }
        for(T item:arr){
            System.out.println(item);
        }
    }
}
