package com.charles.beanUtils;

import org.apache.commons.beanutils.BeanUtils;
import org.apache.commons.beanutils.ConversionException;
import org.apache.commons.beanutils.ConvertUtils;
import org.apache.commons.beanutils.Converter;
import org.apache.commons.beanutils.locale.converters.DateLocaleConverter;
import org.junit.Test;

import java.lang.reflect.InvocationTargetException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

public class TestBeanUtils {

    /**
     * 测试BeanUtils的基本用法
     */
    @Test
    public void testBu(){
        Person p = new Person();
        try {
            //使用BeanUtils内置转换器
            ConvertUtils.register(new DateLocaleConverter(),Date.class);
            //使用自己编写的转换器（匿名内部类）
            /*ConvertUtils.register(new Converter(){

                @Override
                public <Date> Date convert(Class<Date> type, Object value) {
                    if(null == value){
                        return null;
                    }
                    if(!(value instanceof String)){
                        throw new ConversionException("The value to be converted must be a String!");
                    }
                    if(((String)value).trim().equals("")){
                        return null;
                    }
                    DateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
                    try {
                        return (Date)sdf.parse((String) value);
                    } catch (ParseException e) {
                        //这里不能直接打印异常，而应该抛出异常给上层处理，否则上层不知道是不是出现了异常
                        //保持异常链不能断掉
                        throw new RuntimeException(e);
                    }
                }
            }, Date.class);*/

            //BeanUtils只能转换基本数据类型
            BeanUtils.setProperty(p,"name","Charles");
            BeanUtils.setProperty(p,"age",24);
            BeanUtils.setProperty(p,"birthday","1992-02-11");
            //打印生日
            Date d = p.getBirthday();
            DateFormat df = new SimpleDateFormat("yyyy-MM-dd");
            System.out.println(df.format(d));
        } catch (IllegalAccessException|InvocationTargetException e) {
            e.printStackTrace();
        }
    }

    /**
     * 记住BeanUtils、hashMap填充javaBean数据
     */
    @Test
    public void testPopulate(){
        Map<String,String> m = new HashMap<>();
        m.put("name","Chales");
        m.put("age","24");
        m.put("birthday","1993-03-11");

        Person p = new Person();
        try {
            //注册转换器
            ConvertUtils.register(new DateLocaleConverter(),Date.class);
            BeanUtils.populate(p,m);
            System.out.println(p.getName());
            System.out.println(p.getAge());
            Date d = p.getBirthday();
            DateFormat df = new SimpleDateFormat("yyyy-MM-dd");
            System.out.println(df.format(d));
        } catch (IllegalAccessException|InvocationTargetException e) {
            e.printStackTrace();
        }
    }
}
