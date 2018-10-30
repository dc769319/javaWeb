package com.charles.beanUtils;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Date2String {

    public static void main(String[] args){
        //将字符串转换为对象
        String dateStr = "1992-02-11 12:30:00";
        //大写的H代表24小时制计时，小写的h代表12小时计时
        DateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        try {
            Date d = df.parse(dateStr);
            System.out.println(d);
            //自动调用Date对象toString方法，输出Tue Feb 11 00:30:00 CST 1992
        } catch (ParseException e) {
            e.printStackTrace();
        }

        //将对象转换为字符串
        Date date = new Date();
        DateFormat dfn = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String dateSt = dfn.format(date);
        System.out.println(dateSt);
        //2017-12-26 21:59:42
    }
}
