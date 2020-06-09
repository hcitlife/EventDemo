package com.hc.demo2;

import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

/**
 * 自定义事件监听器
 */
@Component
public class EmailEventListener2 { //不需要继承任何接口
    /**
     * 参数为Object类型时，所有事件都会监听到
     * 参数为指定类型事件时，该参数类型事件或者其子事件（子类）都可以接收到
     */
    @EventListener
    public void onApplicationEvent(EmailEvent2 event) {//参数表示监听的事件的类型
        System.out.printf("监听到 %s : 事件-%s", event.getClass().getName(), event.getSource());
    }

}