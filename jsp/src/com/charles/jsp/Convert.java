package com.charles.jsp;

import java.io.Serializable;

public class Convert implements Serializable {

    public Convert() {
    }

    /**
     * 将字符串数组，转换为,连接的字符串
     * @param arr 字符串数组
     * @param delimiter 连接符
     * @return 转换后的字符串
     */
    public String arr2Str(String[] arr, String delimiter) {
        if (null == arr || arr.length == 0) {
            return "";
        }
        StringBuffer buffer = new StringBuffer();
        for (String item : arr) {
            buffer.append(item);
            buffer.append(delimiter);
        }
        if (buffer.length() > 0) {
            buffer = buffer.deleteCharAt(buffer.lastIndexOf(","));
        }
        return buffer.toString();
    }

    /**
     * 将字符串数组，转换为,连接的字符串
     * @param arr 字符串数组
     * @return 转换后的字符串
     */
    public String arr2Str(String[] arr) {
        if (null == arr || arr.length == 0) {
            return "";
        }
        StringBuffer buffer = new StringBuffer();
        for (String item : arr) {
            buffer.append(item);
            buffer.append(',');
        }
        if (buffer.length() > 0) {
            buffer = buffer.deleteCharAt(buffer.lastIndexOf(","));
        }
        return buffer.toString();
    }
}
