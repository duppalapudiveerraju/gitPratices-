package com.example.demo;


import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.bean.Bean;

@RestController
public class Demo {
	
	private static final Logger log=LogManager.getLogger(Demo.class);
	
	Bean bean=new Bean();
	//@Autowired
	//private Bean bean;
	
	@Value("${first.one.m}")
	private String msg;
	
	@Value("${first.one.n}")
	private String two;
	
	@Value("${first.one.l}")
	private String three;
	
	/*@Value("#{'${first.one.l}'.split(',')}")
	private String three;
	
	*/
	
	//@Value("${first.name.one}")
	//private String newMsg;
	

	public void demo() {
		//System.out.println(msg);
		System.out.println(" server port 56778");
		
	}

	@GetMapping("/getValue")
	public void restCall() {
		log.info("thi is logger "+msg);
		log.debug("this logger debug"+msg);
		System.out.println(msg);
		System.out.println(two);
		System.out.println(three);
		//System.out.println(newMsg);
		
		
		
	}
	@GetMapping("/getmsg")
	public void msgs() {
		
		bean.display();
	}
}
