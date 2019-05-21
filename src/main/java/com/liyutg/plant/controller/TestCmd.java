package com.liyutg.plant.controller;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

/**
 * @author xgs
 * @Date 2019/5/11 14:47
 * @description
 */
public class TestCmd {


    public static void main(String[] args) {

        Process p;
        //利用CMD命令调用python，包含两个参数
        String cmd = "python D:\\bishe\\py36-l\\image_classification\\infer-my.py";
        try {
            p = Runtime.getRuntime().exec(cmd);
            InputStream fis = p.getInputStream();
            InputStreamReader isr = new InputStreamReader(fis);
            BufferedReader br = new BufferedReader(isr);
            String line = null;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            e.printStackTrace();

        }
    }
}
