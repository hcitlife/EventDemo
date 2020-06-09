package com.hc.demo;

import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

/**
 * 自定义事件监听器
 */
@Component
public class EmailEventListener implements ApplicationListener<EmailEvent> {

    @Override
    public void onApplicationEvent(EmailEvent event) {//参数表示监听的事件的类型
        System.out.printf("监听到事件 %s ：开始-%s \n" ,event.getClass().getName(),event.getSource());
    }

}