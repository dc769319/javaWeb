package com.charles.enumration;

import org.junit.Test;

public class EnumTest {
    @Test
    public void read(){
        System.out.println(Grade.A.getValue());
    }

    @Test
    public void score(){
        System.out.println(Grade.A.name());
        System.out.println(Grade.C.ordinal());
        System.out.println(Grade.C.toString());
        //返回一个Grade对象，将输入的字符串转换成Grade对象
        Grade g = Grade.valueOf("C");
        Grade[] grades = Grade.values();
        for(Grade gr:grades){
            System.out.println(gr);
        }
    }

    @Test
    public void weekDay(){
        System.out.println(WeekDay.MONDAY.otherName());
    }
}

/**
 * 定义枚举构造方法、字段，封装更多信息
 */
enum Grade{

    A("90-100"),B("89-80"),C("79-70"),D("69-60"),E("59-0");

    private String value;

    private Grade(String value){
        this.value = value;
    }

    public String getValue(){
        return value;
    }
}

enum WeekDay{
    MONDAY("周一"),
    TUESDAY("周二"),
    WEDNESDAY("周三"),
    THURSDAY("周四"),
    FRIDAY("周五"),
    SATURDAY("周六"),
    SUNDAY("周日");

    private String otherName;
    private WeekDay(String otherName){
        this.otherName = otherName;
    }

    public String otherName(){
        return otherName;
    }
}

