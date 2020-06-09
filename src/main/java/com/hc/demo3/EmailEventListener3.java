package com.hc.demo3;

import org.springframework.context.ApplicationListener;

/**
 * 自定义事件监听器
 */
public class EmailEventListener3 implements ApplicationListener<EmailEvent3> {

    @Override
    public void onApplicationEvent(EmailEvent3 event) {
        System.out.printf("监听到 %s : 事件-%s", event.getClass().getName(), event.getSource());
    }

}