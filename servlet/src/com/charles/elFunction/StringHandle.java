package com.charles.elFunction;

/**
 * 定义可在el中调用的函数
 */
public class StringHandle {
    /**
     * 定义静态函数
     * @param str 输入
     * @return 替换后的内容
     */
    public static String shiftEnter(String str) {
        return str.replaceAll("\r\n", "<br>").replaceAll(" ", "&nbsp;");
    }
}
