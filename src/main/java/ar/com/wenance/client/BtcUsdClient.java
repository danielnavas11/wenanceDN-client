package ar.com.wenance.client;

import ar.com.wenance.domain.BtcUsd;
import lombok.extern.log4j.Log4j2;
import org.springframework.boot.ApplicationRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.reactive.function.client.WebClient;

@Log4j2
@Configuration
public class BtcUsdClient {
    @Bean
    WebClient client() {
        return WebClient.create("http://localhost:8080/");
    }

    @Bean
    ApplicationRunner runner(WebClient webClient) {
        return args -> webClient.get()
                .uri("btc")
                .retrieve()
                .bodyToFlux(BtcUsd.class)
                .subscribe(data -> log.info(data.toString()));
    }
}
