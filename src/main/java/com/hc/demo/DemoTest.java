package com.hc.demo;

import com.hc.demo.EmailEvent;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;

import javax.annotation.Resource;

@SpringBootTest
public class DemoTest {
    @Resource
    private ApplicationContext act;
    @Test
    public void fun(){
        System.out.println("发布事件");
        act.publishEvent(new EmailEvent("发送邮件1"));
    }
}
