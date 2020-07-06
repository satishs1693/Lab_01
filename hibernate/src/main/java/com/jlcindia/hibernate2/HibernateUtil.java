package com.jlcindia.hibernate2;

import java.io.File;

import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;

/**
 * @author hp
 *
 */
public class HibernateUtil {
	static SessionFactory factory;
	static {
		
		System.out.println("**************************************");
		Configuration cfg = new Configuration();
		String hibernatePropsFilePath = "C:\\Users\\hp\\Documents\\workspace-spring-tool-suite-4-4.6.1.RELEASE\\hibernate\\hibernate.cfg.xml";
		File hibernatePropsFile = new File(hibernatePropsFilePath);
		cfg.configure(hibernatePropsFile);

		StandardServiceRegistryBuilder ssrbuilder = new StandardServiceRegistryBuilder();

		StandardServiceRegistry ssRegistery = ssrbuilder.applySettings(cfg.getProperties()).build();
		factory = cfg.buildSessionFactory(ssRegistery);
	}
     public static SessionFactory getSessionFactory() {
    	 System.out.println("***********************1222222222222***************");
		return factory;
	}
}
