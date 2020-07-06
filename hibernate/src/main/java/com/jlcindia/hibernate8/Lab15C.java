package com.jlcindia.hibernate8;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class Lab15C {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			SessionFactory sf = HibernateUtil.getSessionFactory();
			Session sess = sf.openSession();
			Transaction txt = sess.beginTransaction();
			Request req = (Request)sess.load(Request.class, 3);
			System.out.println(req);
			System.out.println("Request Info ");
			//System.out.println(cust);
			txt.commit();
			sess.close();
		} catch (Exception e) {
			e.printStackTrace();
			// TODO: handle exception
		}
	}

}
