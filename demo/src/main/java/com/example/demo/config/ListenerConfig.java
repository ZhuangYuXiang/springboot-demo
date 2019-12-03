package com.example.demo.config;

import org.springframework.boot.web.servlet.ServletListenerRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 *  监听器注册配置
 */
@Configuration
public class ListenerConfig {
    /**
     *  session监听注册
     * @return
     */
    @Bean
    public ServletListenerRegistrationBean sessionListenerRegistrationBean() {
        ServletListenerRegistrationBean slrBean = new ServletListenerRegistrationBean();
        slrBean.setListener(new SessionListener());
        return slrBean;
    }
}
