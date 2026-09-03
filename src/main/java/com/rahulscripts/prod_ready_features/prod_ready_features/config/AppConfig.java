package com.rahulscripts.prod_ready_features.prod_ready_features.config;

import org.modelmapper.ModelMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.ui.ModelMap;

@Configuration
public class AppConfig {

    @Bean
    ModelMapper getMapper(){
        return new ModelMapper();
    }
}
