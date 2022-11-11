package com.example.demo.component;

import com.example.demo.properties.DemoProperties;
import javax.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import com.example.demo.bean.DemoBean;

// A component is a bean managed by the application context

@Component
public class DemoComponent {

    // The @Value annotation can be used to bind a single value from the properties file
    @Value("${demo.value}")
    private String demoValue;

    @Autowired
    private DemoBean demoBean;

    @Autowired
    private DemoProperties demoProperties;

    // Spring cannot inject dependencies into a bean before the bean's initialization
    //@Autowired
    public DemoComponent(/*DemoBean demoBean*/){
        System.out.println("DemoComponent instantiated.");
        //demoBean.getAge();
        //demoBean.getName();
    }

    // PostConstruct runs after all dependencies have been injected
    @PostConstruct
    private void checkDependencies(){
        demoBean.getName();
        demoBean.getAge();
        demoProperties.getUsername();
        demoProperties.getPassword();
    }

}
