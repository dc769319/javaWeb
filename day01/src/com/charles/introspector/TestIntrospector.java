package com.charles.introspector;

import org.junit.Test;

import java.beans.BeanInfo;
import java.beans.IntrospectionException;
import java.beans.Introspector;
import java.beans.PropertyDescriptor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * 测试内省的使用方法
 */
public class TestIntrospector {

    @Test
    public void testPds(){
        try {
            //得到bean信息
            //BeanInfo info = Introspector.getBeanInfo(Student.class);
            //添加第二个参数，可去除从Object基类继承的属性
            BeanInfo info = Introspector.getBeanInfo(Student.class,Object.class);
            //得到属性的描述信息
            PropertyDescriptor[] pds = info.getPropertyDescriptors();
            for(PropertyDescriptor pd:pds){
                //循环出ab/age/class/name属性名称，属性个数不由字段决定，而是由getter方法决定。class属性由Object父类继承而来
                System.out.println(pd.getName());
            }
        } catch (IntrospectionException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void testPd(){
        Student stu = new Student();
        try {
            //直接new PropertyDecsriptor，传入属性名称、Class，可直接得到属性描述对象
            PropertyDescriptor pd = new PropertyDescriptor("name",Student.class);
            //得到属性数据类型
            System.out.println(pd.getPropertyType());
            //得到name属性的set方法
            Method m = pd.getWriteMethod();
            //将name属性设置为Charles
            m.invoke(stu,"Charles");
            //得到name属性的get方法
            Method rm = pd.getReadMethod();
            //执行name属性的get方法
            String name = (String) rm.invoke(stu);
            //输出name属性的值
            System.out.println(name);
        } catch (IntrospectionException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }

    }
}
