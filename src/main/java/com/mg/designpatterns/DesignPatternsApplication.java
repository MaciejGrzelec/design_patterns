package com.mg.designpatterns;

import com.mg.designpatterns.strategy.ChatClient;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class DesignPatternsApplication {

    public static void main(String[] args) {

        ConfigurableApplicationContext run = SpringApplication.run(DesignPatternsApplication.class, args);
        ChatClient bean = run.getBean(ChatClient.class);
        bean.send("check it");
    }

}
