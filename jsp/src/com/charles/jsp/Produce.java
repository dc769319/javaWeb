package com.charles.jsp;

import java.io.Serializable;

public class Produce implements Serializable {
    private String name = "电吉他";
    private double price = 180.02;
    private int count = 100;
    private String factoryAdd = "广州市";

    public Produce() {
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public String getFactoryAdd() {
        return factoryAdd;
    }

    public void setFactoryAdd(String factoryAdd) {
        this.factoryAdd = factoryAdd;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getName() {
        return this.name;
    }

    public double getPrice() {
        return this.price;
    }
}
