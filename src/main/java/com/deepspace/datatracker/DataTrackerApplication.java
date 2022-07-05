package com.deepspace.datatracker;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class DataTrackerApplication {

    public static void main(String[] args) {
        SpringApplication.run(DataTrackerApplication.class, args);
    }

}
