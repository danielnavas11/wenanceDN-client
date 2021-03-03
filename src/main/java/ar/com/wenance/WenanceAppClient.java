package ar.com.wenance;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
public class WenanceAppClient {
    public static void main(String[] args) {
        SpringApplication.run(WenanceAppClient.class, args);
    }
}