package com.charles.elFunction;

public class StringHandle {
    public static String shiftEnter(String str) {
        return str.replaceAll("\r\n", "<br />").replaceAll(" ", "&nbsp;");
    }
}
