package com.mn.test;


import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;

public class HelloWorld {

	static Logger logger=Logger.getLogger(HelloWorld.class.getName());
	
	public static void main(String[] args) {
		
	   BasicConfigurator.configure();
	   
	   logger.info("hello world");
	   logger.info("welcome to hello world");
	}
}
