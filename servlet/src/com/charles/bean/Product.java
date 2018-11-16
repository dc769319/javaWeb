package com.charles.bean;

public class Product {
    /**
     * 每一页显示的产品条数
     */
    public static final int PAGE_SIZE = 2;

    /**
     * 编号
     */
    private int id;

    /**
     * 价格
     */
    private double price;

    /**
     * 数量
     */
    private int num;

    /**
     * 单位
     */
    private String unit;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }
}
