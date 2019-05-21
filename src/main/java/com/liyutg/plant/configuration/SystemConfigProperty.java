package com.liyutg.plant.configuration;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * @author xgs
 * @Date 2018/9/26 21:06
 * @description
 */

@Component
@Data
public class SystemConfigProperty {
    /**
     * OSS存储设置，endpoint
     */
    @Value("${oss.endpoint}")
    private String endpoint;

    /**
     * OSS存储设置，accessId
     */
    @Value("${oss.accessId}")
    private String accessId;

    /**
     * OSS存储设置，accessKey
     */
    @Value("${oss.accessKey}")
    private String accessKey;

    /**
     * OSS存储设置，bucket
     */
    @Value("${oss.bucket}")
    private String bucket;

    /**
     * OSS存储设置，dir
     */
    @Value("${oss.dir}")
    private String dir;

    /**
     * 设置微信小程序的appid
     */
    @Value("${wechat.miniapp.appid}")
    private String appid;

    /**
     * 设置微信小程序的Secret
     */
    @Value("${wechat.miniapp.secret}")
    private String secret;

    /**
     * 设置微信小程序的token
     */
    @Value("${wechat.miniapp.token}")
    private String token;

    /**
     * 设置微信小程序的EncodingAESKey
     */
    @Value("${wechat.miniapp.aesKey}")
    private String aesKey;

    /**
     * 消息格式，XML或者JSON
     */
    @Value("${wechat.miniapp.msgDataFormat}")
    private String msgDataFormat;


}
