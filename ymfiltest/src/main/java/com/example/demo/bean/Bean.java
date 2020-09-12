package com.example.demo.bean;

import javax.annotation.PostConstruct;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.stereotype.Component;

@Component
public class Bean {

	private static final  Logger logger=LogManager.getLogger(Bean.class);
	
	@PostConstruct
	public void init() {
		logger.debug("This is the PostConstrct of bean life cycle method in init method invoke ");
		System.out.println(" init method calls");
		display();
		System.out.println("second commit msg");
	}
	
	public void display() {
		
		System.out.println("displaying the msgs ");
	}
}
