package com.boot.springbootdemo.utils;


import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Base64;

public class String2File {
    public static void main(String[] args) {

        String line = "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";
        String filePath = "/Users/mac/Desktop/file/test.xlsx";
        stirng2File(line, filePath);

    }

    public static void stirng2File(String base64Code, String targetPath) {
        System.out.println("20个字符" + base64Code.substring(0, 50));
        System.out.println("BASE64转译String333:" + base64Code.length());
        byte[] buffer;
        FileOutputStream out = null;
        FileOutputStream out2 = null;
        try {
            //解码
            buffer = Base64.getDecoder().decode(base64Code);
            //buffer = new BASE64Decoder().decodeBuffer(base64Code);
            System.out.println("BASE64转译byte111:" + buffer.length);
            //System.out.println("数据为"+temp);
            //System.out.println("buffer长度"+buffer.length);
            out = new FileOutputStream(targetPath);
//            out2 = new FileOutputStream("D:\\test\\1.txt");
            out.write(buffer);
//            out2.write(buffer);
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } finally {
            if (out != null) {
                try {
                    out.close();
                } catch (IOException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }
            }
            if (out2 != null) {
                try {
                    out2.close();
                } catch (IOException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }
            }

        }

    }
}