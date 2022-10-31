package com.example.demo.component;

import javax.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import com.example.demo.bean.DemoBean;

// A component is a bean managed by the application context

@Component
public class DemoComponent {

    @Autowired
    private DemoBean demoBean;

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
    }

}
