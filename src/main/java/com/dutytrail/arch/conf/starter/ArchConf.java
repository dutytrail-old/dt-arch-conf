package com.dutytrail.arch.conf.starter;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.cloud.config.server.EnableConfigServer;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableAutoConfiguration
@EnableEurekaClient
@EnableConfigServer
@ComponentScan(basePackages = {"com.dutytrail.arch.conf"})
public class ArchConf {

    public static void main(String[] args) {
        SpringApplication.run(ArchConf.class, args);
    }

}