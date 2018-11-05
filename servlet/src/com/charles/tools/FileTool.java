package com.charles.tools;

public class FileTool {

    /**
     * 获取文件扩展名
     * @param fileName 文件名
     * @return String 文件扩展名
     */
    public static String extName(String fileName) {
        int index = fileName.lastIndexOf(".");
        if (-1 == index) {
            return fileName;
        }
        return fileName.substring(index + 1);
    }
}
