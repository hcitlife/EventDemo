package com.hc.demo3;

import org.springframework.context.ApplicationEvent;

/**
 * 自定义事件：模拟发送邮件
 */
public class EmailEvent3 extends ApplicationEvent {

    public EmailEvent3(Object source) {
        super(source);
    }

}