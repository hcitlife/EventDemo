package com.hc.demo2;

import org.springframework.context.ApplicationEvent;

/**
 * 自定义事件：模拟发送邮件
 */
public class EmailEvent2 extends ApplicationEvent {

    public EmailEvent2(Object source) {
        super(source);
    }

}