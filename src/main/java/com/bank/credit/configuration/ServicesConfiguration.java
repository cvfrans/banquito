package com.bank.credit.configuration;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "com.bank.credit.service")
public class ServicesConfiguration {
	
}
