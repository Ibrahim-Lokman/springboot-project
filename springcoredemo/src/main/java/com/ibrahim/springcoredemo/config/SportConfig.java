package com.ibrahim.springcoredemo.config;

import com.ibrahim.springcoredemo.common.Coach;
import com.ibrahim.springcoredemo.common.SwimCoach;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SportConfig {
    @Bean("customname")
    public Coach swimCoach() {
        return new SwimCoach();
    }
}
