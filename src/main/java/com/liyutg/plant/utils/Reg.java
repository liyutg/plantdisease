package com.liyutg.plant.utils;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static java.util.regex.Pattern.*;

/**
 * @author xgs
 * @Date 2019/5/21 1:20
 * @description
 */
public class Reg {

    public static void main(String[] args) {
        regs();
    }

    private static void regs() {
        // TODO Auto-generated method stub

        String line = "[\"http://yjj-img-main.oss-cn-hangzhou.aliyuncs.com/1440227044447Capture One Session5324.jpg\","
                + "\"http://yjj-img-main.oss-cn-hangzhou.aliyuncs.com/1440227044463网漏肩中长上衣.png\","
                + "\"http://yjj-img-main.oss-cn-hangzhou.aliyuncs.com/1440227044451Capture One Session5322.jpg\","
                + "\"http://yjj-img-main.oss-cn-hangzhou.aliyuncs.com/1440227044427Capture One Session5326.jpg\"]";

        Pattern pattern = compile("http://(?!(\\.jpg|\\.png)).+?(\\.jpg|\\.png)");
        Matcher matcher = pattern.matcher(line);
        while (matcher.find()) {
            System.out.println(matcher.group(0));
            System.out.println();
        }
    }

}
