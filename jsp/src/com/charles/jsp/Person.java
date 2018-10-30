package com.charles.jsp;

import java.io.Serializable;

public class Person implements Serializable{
    private String name;
    private short age;
    private int classNo;
    private String address;

    public Person() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public short getAge() {
        return age;
    }

    public void setAge(short age) {
        this.age = age;
    }

    public int getClassNo() {
        return classNo;
    }

    public void setClassNo(int classNo) {
        this.classNo = classNo;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
