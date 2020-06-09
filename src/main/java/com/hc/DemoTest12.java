package com.hc;

import com.hc.demo1.EmailEvent1;
import com.hc.demo1.EmailEventListener1;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class DemoTest12 {

	public static void main(String[] args) {
		SpringApplication application = new SpringApplication(DemoTest12.class);
        //添加Listener
		application.addListeners(new EmailEventListener1());
		ConfigurableApplicationContext context = application.run(args);
        //发布事件，调用就是AbstractApplicationContext的publishEvent()方法
		//context.publishEvent(new EmailEvent1("CustomEvent事件"));
		//context.close();
	}

}