package com.satish.Lab1;

import java.awt.image.SampleModel;
import java.util.Iterator;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
    	ApplicationContext ctx = new AnnotationConfigApplicationContext(Satishconfig.class);
    	DataSource ds = (DataSource)ctx.getBean(DataSource.class);
    	
    	Satish sa = (Satish)ctx.getBean("Sammy");
    	System.out.println(sa);
    	
    	Satish1 sa1 = (Satish1)ctx.getBean("Sammy1");
    	System.out.println(sa1);

    	System.out.println("In APP Calss "+ds);
    	CustomerDao cdo =(CustomerDao) ctx.getBean("custDAO");
        Customer cust = new Customer("satish", 1123,"Hyd", 988488, "satishS");
        cdo.addCustomer(cust); 
        List<Customer> list = cdo.getAllCustomer();
        for(Customer cust1 : list) {
        	System.out.println(cust1);
        }
        System.out.println("Done");
    }
}

/*

we need to update the 



*/