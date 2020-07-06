
package com.jlcindia.hibernate8;
import java.util.Collection;
import java.util.Iterator;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class Lab15B {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			SessionFactory sf = HibernateUtil.getSessionFactory();
			Session sess = sf.openSession();
			Transaction txt = sess.beginTransaction();
			Customer cust=(Customer)sess.load(Customer.class,2);
			System.out.println("Customer Info  *********");			System.out.println(cust);
//			Collection<Request> col = cust.getRequests();
//			for ( Request req: col) {
//				System.out.println(req);
//			}
//			System.out.println("hhhhhhhhhhhhhhhhhhhhhhhhhh");
	
			txt.commit();
			sess.close();
			System.out.println("Record Inseted");
		} catch (Exception e) {
			e.printStackTrace();
		   System.out.println("********************88");
		}
	}

}