package com.satish.Lab6;


import java.util.List;

import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

import ch.qos.logback.classic.Logger;

@SpringBootApplication
public class MyBootApplication implements CommandLineRunner{
	
	Logger log = (Logger) LoggerFactory.getLogger(MyBootApplication.class);
	  
	
    public static void main( String[] args )
    {
    	SpringApplication.run(MyBootApplication.class, args);	
    }
    @Override
    public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
	}
		
	}