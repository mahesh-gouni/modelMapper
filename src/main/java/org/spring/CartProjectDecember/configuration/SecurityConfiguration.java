package org.spring.CartProjectDecember.configuration;


import org.springframework.boot.autoconfigure.graphql.security.GraphQlWebFluxSecurityAutoConfiguration;
import org.springframework.boot.autoconfigure.security.servlet.SecurityFilterAutoConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


//@Configuration
//
//public class SecurityConfiguration {
//    @Bean
//    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
//        http
//                .csrf().disable()
//                .authorizeHttpRequests(auth -> auth
//                        .anyRequest().permitAll()
//                );
//        return http.build();
//    }
//}