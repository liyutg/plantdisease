package com.liyutg.plant.utils;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.UUID;


/**
 * <p>
 * Title: BussinessNoUtil
 * </p>
 * <p>
 * Description:
 * </p>
 * <p>
 * Copyright: openlo.cn Copyright (C) 2017
 * </p>
 *
 * @author wwl
 * @version
 * @since 2017年1月4日
 */
public class UUIDUtil {


    private static Logger logger = LoggerFactory.getLogger(UUIDUtil.class);


    /**
     * 获取现在时间
     * @return 返回字符串格式yyyyMMddHHmmssSSS（17位）
     */
    public static String getStringDate() {
        Date currentTime = new Date();
        SimpleDateFormat formatter = new SimpleDateFormat("yyyyMMddHHmmssSSS");
        String dateString = formatter.format(currentTime);
        logger.info("dateString", dateString);
        return dateString;
    }
    /**
     * 获取32位UUID字符串
     */
    public static String get32UUIDString(){
        String uuidStr = UUID.randomUUID().toString().replaceAll("-", "");
//        logger.info("uuidStr", uuidStr);
        return uuidStr;
    }

    /**
     * 返回64位业务流水号
     * @return
     */
    public static String generateBusNo() {
        // 15位数字数组
        int[] number = new int[15];
        // 循环变量
        int i = 0;
        StringBuffer bussinessNo = new StringBuffer(64);
        bussinessNo.append(getStringDate());
        bussinessNo.append(get32UUIDString());
        // 生成15位随机数算法
        for (i = 0; i < number.length; i++) {
            if (number[i] == 0) {
                // 产生0-10之间的随机小数，强制转换成正数
                number[i] = (int) (Math.random() * 10);
            }
            bussinessNo.append(number[i]);
        }

        logger.info("bussinessNo", bussinessNo.toString());
        System.out.println(bussinessNo.toString());
        return bussinessNo.toString();
    }


    // 主方法测试
    public static void main(String[] args) {
       for(int i=0;i<10;i++){
           System.out.println( generateBusNo());
       }
    }
}