package com.charles.tools;

public class FileTool {
    public static String extensionName(String fileName) {
        return fileName.substring(fileName.lastIndexOf(".") + 1);
    }
}
