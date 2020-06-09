package com.hc.controller;

import com.hc.demo.EmailEvent;
import com.hc.demo1.EmailEvent1;
import com.hc.demo2.EmailEvent2;
import com.hc.demo3.EmailEvent3;
import org.springframework.context.ApplicationContext;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
public class DemoController {
    @Resource
    private ApplicationContext act;

    //发布事件
    @RequestMapping("/pubEvnet")
    public void pubEvnet() {
        //TODO:业务处理
        System.out.println("发布事件");
        act.publishEvent(new EmailEvent("发送邮件"));
        //TODO:业务处理
    }

    //发布事件
    @RequestMapping("/pubEvnet1")
    public void pubEvnet1() {
        //TODO:业务处理
        System.out.println("发布事件1");
        act.publishEvent(new EmailEvent1("发送邮件1"));
        //TODO:业务处理
    }

    //发布事件
    @RequestMapping("/pubEvnet2")
    public void pubEvnet2() {
        //TODO:业务处理
        System.out.println("发布事件2");
        act.publishEvent(new EmailEvent2("发送邮件2"));
        //TODO:业务处理
    }

    //发布事件
    @RequestMapping("/pubEvnet3")
    public void pubEvnet3() {
        //TODO:业务处理
        System.out.println("发布事件3");
        act.publishEvent(new EmailEvent3("发送邮件3"));
        //TODO:业务处理
    }
}
