package com.enjoy.video.ms;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class EnjoyVideoMsDemoApp {

    public static void main(String[] args){
        ApplicationContext app = SpringApplication.run(EnjoyVideoMsDemoApp.class, args);
    }
}
