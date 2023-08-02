package com.neu.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.net.InetAddress;
import java.net.UnknownHostException;

@RestController
@SpringBootApplication
public class MyDockerApplication {

    @GetMapping("/hello")
    public String hello() {
        StringBuffer buffer = new StringBuffer();
        try {
            // 获取本地主机名
            String localHostName = InetAddress.getLocalHost().getHostName();
            buffer.append(localHostName);
            System.out.println("Local Host Name: " + localHostName);

            // 获取本地 IP 地址
            String localIpAddress = InetAddress.getLocalHost().getHostAddress();
            buffer.append(localIpAddress);
            System.out.println("Local IP Address: " + localIpAddress);
        } catch (UnknownHostException e) {
            e.printStackTrace();
        }
        return "Hello, World! I'm " + buffer;
    }

    public static void main(String[] args) {
        SpringApplication.run(MyDockerApplication.class, args);
    }

}
