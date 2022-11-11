package com.example.demo.properties;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
// @ConfigurationProperties is used to store many related configuration properties inside a single class
@ConfigurationProperties(prefix = "demo.resource")
public class DemoProperties {

  public DemoProperties(){
    System.out.println("DemoProperties created");
  }

  private String username;

  private String password;

  public String getUsername() {
    return username;
  }

  public void setUsername(String username) {
    this.username = username;
  }

  public String getPassword() {
    return password;
  }

  public void setPassword(String password) {
    this.password = password;
  }
}
