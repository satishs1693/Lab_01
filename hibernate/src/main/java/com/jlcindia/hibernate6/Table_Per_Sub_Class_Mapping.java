package com.jlcindia.hibernate6;



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
//			Address ad = new Address("Temple11233333Road", "Hyd11233", "A.P");
//			Customer155 cust = new Customer155( "Toka112la12312","Satish", "Satish@123", "9884885518",ad );
//			session.save(cust);
			
			
			
			
			
			
			
//			Customer155 cust = (Customer155)session.load(Customer155.class, 1); 
			/*
 select customer15x0_.cid as cid1_1_0_, customer15x0_.FirstName as FirstName2_1_0_, customer15x0_.LastName as LastName3_1_0_, customer15x0_.sid as sid6_1_0_, customer15x0_.email as email4_1_0_, customer15x0_.phone as phone5_1_0_, address1_.aid as aid1_0_1_, address1_.city as city2_0_1_, address1_.state as state3_0_1_, address1_.street as street4_0_1_ from 
Customer155 customer15x0_ left outer join Address155 address1_ on customer15x0_.sid=address1_.aid where customer15x0_.cid=1
			
			
			
			*/
//			Address ad = cust.getAddress();
			//System.out.println(ad+""+cust);
			Address ADDD = (Address)session.load(Address.class, 2);
			System.out.println(ADDD);
			txt.commit();
		session.close();	
		} catch (Exception e) {
			// TODO: handle exception//
			e.printStackTrace();
			if (txt!=null ) {
				txt.rollback();
			}
			
			
			
		}

	}

}
