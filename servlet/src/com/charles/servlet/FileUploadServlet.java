package com.charles.servlet;

import com.charles.tools.FileTool;
import com.charles.tools.Log2File;
import org.apache.commons.lang3.RandomStringUtils;

import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.http.Part;

@MultipartConfig(maxFileSize = 5 * 1024 * 1024)
@WebServlet(name = "FileUploadServlet", urlPatterns = "/fileUpload")
public class FileUploadServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html");
        PrintWriter out = resp.getWriter();
        String realPath = this.getServletContext().getRealPath("/");//获取服务器上应用根目录绝对路径
        //获取上传的文件
        Part p = req.getPart("cover"); //文件上传控件的name属性值
        String logPath = realPath + "logs/" + "fileUpload.log";
        if (p.getContentType().matches("^image/.+")) {
            String fileName = p.getSubmittedFileName(); //获取上传的文件的原始名称
            Log2File.write(logPath, "fileName", fileName);
            String ext = FileTool.extensionName(fileName);
            //生成新文件名（字母+数字）
            String newName = RandomStringUtils.randomAlphabetic(6) + "." + ext;
            String savePath = realPath + "upload/" + newName;
            //将上传的文件内容写到服务器指定路径
            p.write(savePath);
            //将日志文件路径写入日志中
            Log2File.write(logPath, "save path", savePath);
            out.print("File upload success");
            out.flush();
            out.close();
        } else {
            //只处理图片
            out.print("Only handle image upload request");
            out.flush();
            out.close();
        }
    }
}
