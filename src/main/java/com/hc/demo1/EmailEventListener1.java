package com.hc.demo1;

import org.springframework.context.ApplicationListener;

/**
 * 自定义事件监听器
 */
//@Component //手动注册，不需要该注解
public class EmailEventListener1 implements ApplicationListener<EmailEvent1> {

    @Override
    public void onApplicationEvent(EmailEvent1 event) {//参数表示监听的事件的类型
        System.out.printf("监听到 %s : 事件-%s", event.getClass().getName(), event.getSource());
    }

}