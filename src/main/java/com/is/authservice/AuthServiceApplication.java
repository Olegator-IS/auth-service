package com.is.authservice;
import com.is.authservice.config.SSHTunnel;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class AuthServiceApplication {

    public static void main(String[] args) {
        SSHTunnel.createSSHTunnel(); // Устанавливаем SSH туннель
        SpringApplication.run(AuthServiceApplication.class, args);
    }

    protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
        return builder.sources(AuthServiceApplication.class);
    }

}
