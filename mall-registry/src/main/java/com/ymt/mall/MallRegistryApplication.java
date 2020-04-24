package com.ymt.mall;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * Created by @author ymtNSN on 2020/4/24
 */
@EnableEurekaServer
@SpringBootApplication
public class MallRegistryApplication {
    public static void main(String[] args) {
        SpringApplication.run(MallRegistryApplication.class, args);
    }
}
