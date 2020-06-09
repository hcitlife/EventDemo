package com.hc.demo;

import org.springframework.context.ApplicationEvent;

/**
 * 自定义事件：模拟发送邮件
 */
public class EmailEvent extends ApplicationEvent {

    public EmailEvent(Object source) {
        super(source);
    }

}