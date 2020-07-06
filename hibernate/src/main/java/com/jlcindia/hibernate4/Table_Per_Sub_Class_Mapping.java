package com.jlcindia.hibernate4;



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
			Student stu = new Student("Samm","Blore","Enabled",15000.00); Integer it =
			(Integer) session.save(stu);
			System.out.println(it.intValue());
			CurrentStudent cstu = new CurrentStudent("Vas", "Blore", "Enabled", 15000,"BTM", "6:30PM", "2000");
			Integer it1 = (Integer) session.save(cstu);
			System.out.println(it.intValue());
			//Adding the OldStudent
			OldStudent ostu = new OldStudent("aa", "blore", "Enabled", 12456, "Techm", "satish@1243", "1000");
			Integer ostu1 = (Integer) session.save(ostu);
			System.out.println(ostu1.intValue());
			//Adding the weekendStudent
			WeekdayStudent wst= new WeekdayStudent("bb", "hyd", "Enable", 10000, "Guntur", "6.PM", "2000", "Btech", "40", "2014");
			Integer wstit = (Integer) session.save(wst);
			System.out.println(wstit.intValue());
			//Adding the weekdayStudent
			WeekdayStudent wsd= new WeekdayStudent("samm", "Guntur", "Enabled", 30000, "Franch", "10.30 PM", "1000", "B-Tech", "30", "2018");
			Integer wsd1 = (Integer) session.save(wst);
			System.out.println(wsd1.intValue());
			txt.commit();
			
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			if (txt!=null ) {
				txt.rollback();
			}
			
			
			
		}

	}

}
