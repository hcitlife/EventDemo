package com.hc.demo1;

import org.springframework.context.ApplicationEvent;

/**
 * 自定义事件：模拟发送邮件
 */
public class EmailEvent1 extends ApplicationEvent {

    public EmailEvent1(Object source) {
        super(source);
    }

}