package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.demo.entity.DemoEntity;
import com.example.demo.repository.DemoRepository;

// Service classes are components that contain the business logic of our application

@Service
public class DemoService {

    @Autowired
    private DemoRepository demoRepository;

    public DemoEntity insertDemoEntity(String name){
        return demoRepository.save(new DemoEntity(name));
    }
}
