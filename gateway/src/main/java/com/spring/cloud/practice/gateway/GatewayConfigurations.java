package com.spring.cloud.practice.gateway;

import com.sun.org.apache.xml.internal.security.keys.keyresolver.KeyResolver;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import reactor.core.publisher.Mono;

@Configuration
public class GatewayConfigurations {
    @Bean
    KeyResolver testResolver() {
        return exchange -> Mono.just("fero");
    }
}
