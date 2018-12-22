package com.charles.action;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

import java.util.Map;

public class MapTestAction extends ActionSupport {

    private Map<String, Object> request;

    private Map<String, Object> session;

    private Map<String, Object> application;

    public MapTestAction(){
        //获取ActionContext对象
        ActionContext context = ActionContext.getContext();
        this.session = context.getSession();
        this.application = context.getApplication();
        this.request = (Map<String, Object>)context.get("request");
    }

    @Override
    public String execute() throws Exception {
        this.session.put("company", "Charles.inc");
        this.request.put("address", "ZhongShan street 101");
        this.application.put("time", "2018-12-22 12:00:00");
        return SUCCESS;
    }
}
