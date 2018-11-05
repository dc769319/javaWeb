package com.charles.tools;

import java.io.*;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * 将日志写入到文件中
 */
public class Log2File {

    /**
     * 写日志到指定文件
     * @param filePath 日志文件路径
     * @param title 日志标题
     * @param content 日志内容
     * @return boolean
     * @throws IOException 文件IO异常
     */
    public static boolean write(String filePath, String title, String content) throws IOException {
        //File对象
        File file = new File(filePath);
        //获取当前日期
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String curDate = format.format(new Date());
        //检查上级目录是否存在，不存在则创建
        if (!file.getParentFile().exists()) {
            if (!file.getParentFile().mkdirs()) {
                return false;
            }
        }
        //创建日志文件
        if (!file.exists()) {
            if (!file.createNewFile()) {
                return false;
            }
        }
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(file, true)));
        bw.write("[" + curDate + "] " + title + " | " + content + "\r\n");
        bw.flush();
        bw.close();
        return true;
    }
}
