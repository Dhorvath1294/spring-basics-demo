package com.example.demo.config;

import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import com.example.demo.bean.DemoBean;

// Configuration classes are used to configure beans via the @Bean annotation

@Configuration
public class DemoConfiguration {

    public DemoConfiguration(){
        System.out.println("DemoConfiguration created.");
    }

    @Bean
    public DemoBean demoBean(){
        return new DemoBean("demoBean", 35);
    }

    @Bean
    @ConditionalOnProperty(value = "demo.condition")
    public DemoBean conditionalDemoBean(){
        return new DemoBean("conditionalDemoBean", 45);
    }
}
