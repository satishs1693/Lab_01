package com.jlcindia.hibernate7;



import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class Table_Per_Sub_Class_Mapping {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Transaction txt = null;
		
		try {
			SessionFactory sf = HibernateUtil.getSessionFactory();
			Session session = sf.openSession();
			txt = (Transaction) session.beginTransaction();
			Address155 ad = new Address155("Temple11233333wwRoad", "Hyd11233", "A.P");
			Customer155 cust = new Customer155( "Toka112la12312dd312","Satish", "Satish@123", "9884885518",ad );
			session.save(cust);
//			Customer155 cust = (Customer155)session.load(Customer155.class, 1);
//			
//			System.out.println(ad);
//			Address155 ADDD = (Address155)session.load(Address155.class, 2);
//			Customer155 ad1 = ADDD.getCust();
			//System.out.println(ADDD);
			//System.out.println("\n"+ad1);
			txt.commit();
			session.close();	
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			if (txt!=null ) {
				txt.rollback();
			}
			
			
			
		}

	}

}
