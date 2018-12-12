package com.charles.action;

import com.opensymphony.xwork2.ActionSupport;

public class UserAction extends ActionSupport {
    private String info;

    public void setInfo(String info) {
        this.info = info;
    }

    public String getInfo() {
        return this.info;
    }

    public String add() {
        info = "添加用户信息";
        return "add";
    }

    public String update() {
        info = "更新用户信息";
        return "update";
    }
}
