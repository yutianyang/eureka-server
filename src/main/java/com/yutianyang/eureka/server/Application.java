package com.yutianyang.eureka.server;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @author tianyang.yu
 * @date 2019-05-08
 */
@EnableEurekaServer
@SpringBootApplication
public class Application {

  public static void main(String... args) {
    SpringApplication.run(Application.class,args);
  }
}
