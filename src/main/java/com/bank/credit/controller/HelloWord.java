package com.bank.credit.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.bank.credit.configuration.WebAppInitializer;

public class HelloWord {
	
	static final Logger LOGGER = LoggerFactory.getLogger(WebAppInitializer.class);
	
	public static void main(String[] args) {
		
		LOGGER.info("Probando log...");
	}

}
