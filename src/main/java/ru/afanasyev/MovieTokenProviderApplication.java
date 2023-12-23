package ru.afanasyev;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication(scanBasePackages = "ru.afanasyev")
@EnableConfigServer
public class MovieTokenProviderApplication {
    public static void main(String[] args) {
        SpringApplication.run(MovieTokenProviderApplication.class, args);
    }
}