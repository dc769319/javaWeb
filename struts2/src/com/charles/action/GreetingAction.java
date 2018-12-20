package com.charles.action;

import com.opensymphony.xwork2.ActionSupport;

public class GreetingAction extends ActionSupport {

    private String username = null;

    @Override
    public String execute() throws Exception {
        if(username == null || username.equals("")){
            return ERROR;
        }
        return SUCCESS;
    }

    public String getUsername(){
        return this.username;
    }

    public void setUsername(String username){
        this.username = username;
    }
}
