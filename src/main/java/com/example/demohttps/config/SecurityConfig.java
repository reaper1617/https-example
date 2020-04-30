package com.example.demohttps.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@Configuration
public class SecurityConfig extends WebSecurityConfigurerAdapter {

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        // enable https
        http
                .requiresChannel()
                .anyRequest()
                .requiresSecure();

        // permit all unauthenticated for test purposes
        http
                .authorizeRequests()
                .antMatchers("/**")
                .permitAll();


    }
}
