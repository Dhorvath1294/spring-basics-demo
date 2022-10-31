package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.example.demo.entity.DemoEntity;
import com.example.demo.service.DemoService;

// A controller is used to define endpoints through which others can communicate with our application

@RestController
public class DemoController {

    @Autowired
    private DemoService demoService;

    @GetMapping(path = "/demo")
    public ResponseEntity<String> demoEndpoint(){
        return ResponseEntity.ok("Demo endpoint called.");
    }

    @PostMapping(path = "/demo/insert")
    public ResponseEntity<DemoEntity> insert(@RequestParam String name){
        DemoEntity demoEntity = demoService.insertDemoEntity(name);
        return ResponseEntity.ok(demoEntity);
    }

}
