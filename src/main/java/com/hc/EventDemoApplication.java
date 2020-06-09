package com.hc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationListener;
import org.springframework.context.ConfigurableApplicationContext;

import java.util.Set;

@SpringBootApplication
public class EventDemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(EventDemoApplication.class, args);
    }

}
