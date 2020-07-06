package com.jlcindia.hibernate;
import org.hibernate.*;
import org.hibernate.SessionFactory;

import com.jlcindia.hibernate2.HibernateUtil;

public class App{
	public static void main(String[] args) throws Exception {
	Transaction tx= null;
	
	try {
		SessionFactory sf = HibernateUtil.getSessionFactory();
		Session session = sf.openSession();
		tx =  session.beginTransaction();
		Customers cms =(Customers)session.load(Customers.class, 1);
		//Customers cust = new Customers("Satish", "satish@123", "9883888", "Hyd", 108, 11000.00);
		System.out.println("***************************8");
		System.out.println(cms);
		//session.save(cust);
		tx.commit();
		System.out.println("***************************8");
		session.close();
	} catch (Exception e) {
		e.printStackTrace();
		if(tx!=null) {
			tx.rollback();
		}
		// TODO: handle exception
	}
	}
}