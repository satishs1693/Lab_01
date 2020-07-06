package com.jlcindia.hibernate2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		SessionFactory sf = HibernateUtil.getSessionFactory();
		Session session = sf.openSession();
		Transaction tx = session.beginTransaction();
		String cours[] = {"Java","Jdbc","Jsp"};
		List<String> ems = new ArrayList<String>();
		ems.add("Satis123h@123");
		ems.add("Sara12233312233h@123");
		ems.add("Satis123h@123");
		
		List<Integer> marks = new ArrayList<Integer>();
		marks.add(new Integer(150));
		marks.add(new Integer(153));
		marks.add(new Integer(152));
		marks.add(new Integer(152));
		
		Set<Long> phs = new HashSet<Long>();
		phs.add(new Long(123456));
		phs.add(new Long(123967));
		phs.add(new Long(1212345));
		
		
	Map<String,Long> refs = new HashMap<String,Long>();
	refs.put("aaa", new Long(1111));
	refs.put("bbb",new Long(2222));
	refs.put("ccc",new Long(3333));
	refs.put("cc1",new Long(333123));
	refs.put("cc2",new Long(3333));
	
	Student stu = new Student("Satish","10-10-2020", "B-Tech", cours, ems, marks, phs, refs);
	Student St2= (Student) session.load(Student.class, 2);
	System.out.println(St2);
	//session.save(stu);
	
	tx.commit();
	session.close();

	}

}
