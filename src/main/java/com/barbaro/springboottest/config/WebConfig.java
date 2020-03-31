package com.barbaro.springboottest.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@Configuration
@EnableMongoRepositories("com.barbaro.springboottest.dao")
public class WebConfig {
	
}
