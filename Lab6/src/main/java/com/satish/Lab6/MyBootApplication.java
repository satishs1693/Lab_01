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
@ComponentScan("com.satish.Lab6")
public class MyBootApplication implements CommandLineRunner{
	
	Logger log = (Logger) LoggerFactory.getLogger(MyBootApplication.class);
	  
	@Autowired CustomerDao cdo;
    public static void main( String[] args )
    {
    	SpringApplication.run(MyBootApplication.class, args);	
    }
    @Override
    public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		log.info("My Boot Application Starts ");
		log.debug("My Boot Application Starts2");
        Customer cust = new Customer("satish", 135,"Hyd", 988488, "satishS");
        cdo.addCustomer(cust); 
        List<Customer> list = cdo.getAllCustomer();
        for(Customer cust1 : list) {
        	System.out.println(cust1);
        }
        log.info("My Boot Application ends ");
		log.debug("My Boot Application ends");		
	}
}