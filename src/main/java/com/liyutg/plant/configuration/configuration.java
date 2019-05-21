package com.liyutg.plant.configuration;

import org.springframework.boot.web.servlet.MultipartConfigFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.servlet.MultipartConfigElement;

/**
 * @author xgs
 * @Date 2019/5/20 13:49
 * @description
 */
@Configuration
public class configuration {
    @Bean
    MultipartConfigElement multipartConfigElement() {
        MultipartConfigFactory factory = new MultipartConfigFactory();
        factory.setLocation("d:/tmp");
        return factory.createMultipartConfig();
    }

}
