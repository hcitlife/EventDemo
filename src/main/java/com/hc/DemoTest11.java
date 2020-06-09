package com.hc;

import com.hc.demo1.EmailEventListener1;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class DemoTest11 {//对应com.hc.demo1包

    public static void main(String[] args) {
        ConfigurableApplicationContext cat = SpringApplication.run(DemoTest11.class, args);
        cat.addApplicationListener(new EmailEventListener1());//手动添加监听
    }
}
