package com.orenda.event_service.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
public class SecurityConfig {

    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
        http
                .csrf(csrf -> csrf.disable())  // New way to disable CSRF
                .authorizeHttpRequests(authz -> authz
                        .anyRequest().permitAll()  // Allow all requests without authentication
                );
        return http.build();
    }
}

