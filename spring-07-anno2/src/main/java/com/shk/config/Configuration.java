package com.shk.config;

import com.shk.pojo.User;
import org.springframework.context.annotation.Bean;

@org.springframework.context.annotation.Configuration
public class Configuration {
@Bean
    public User getUser(){
        return new User();
    }
}
