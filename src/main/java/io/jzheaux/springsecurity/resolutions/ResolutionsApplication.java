package io.jzheaux.springsecurity.resolutions;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;

@SpringBootApplication()
public class ResolutionsApplication {

    public static void main(String[] args) {
        SpringApplication.run(ResolutionsApplication.class, args);
    }

    @Bean
    public UserDetailsService userDetailsService() {
        return new InMemoryUserDetailsManager(
                org.springframework.security.core.userdetails.User
                        .withUsername("user")
                        .password("{bcrypt}$2b$10$0BCOSk2WSnQPA5VPv7qDw.P5jx1iW47xzhbe.32ryXGdLJ6QlxDZy")
                        .authorities("resolution:read")
                        .build());
    }
}