package com.jlcindia.hibernate8;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class Lab15A {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			SessionFactory sf = HibernateUtil.getSessionFactory();
			Session sess = sf.openSession();
			Transaction txt = sess.beginTransaction();
			Customer ctustomer = new Customer(101, "satish", "kumar", "satish@123", "9884885518");
			Request rq1 = new Request("10-20-30", "Hello World", "Enabled");
			Request rq2 = new Request("10-20-31", "Hello World2", "Enabled");
			rq1.setCustomer(ctustomer);
			rq2.setCustomer(ctustomer);
			System.out.println("sssssssssssssssss");
			sess.save(rq1);
			sess.save(rq2);
			System.out.println("hhhhhhhhhhhhhhhhhhhhhhhhhh");
			txt.commit();
			sess.close();
			System.out.println("Record Inseted");
		} catch (Exception e) {
			e.printStackTrace();
		   System.out.println("********************88");
		}
		

	}

}


//1st time create mode :

/*Hibernate: drop table Request_Table cascade constraints
Hibernate: drop table customer_Table cascade constraints
Hibernate: drop sequence hibernate_sequence
Hibernate: create table Request_Table (requid number(10,0) not null, desCription varchar2(255 char), reqDate varchar2(255 char), status varchar2(255 char), cid number(10,0), primary key (requid))
Hibernate: create table customer_Table (cid number(10,0) not null, FirstName varchar2(255 char), LastName varchar2(255 char), email varchar2(255 char), phone varchar2(255 char), primary key (cid))
Hibernate: alter table Request_Table add constraint FK_l9uha1liard6h7cv3yc4cqy41 foreign key (cid) references customer_Table
Hibernate: create sequence hibernate_sequence
***********************1222222222222***************
*Hibernate: insert into customer_Table (FirstName, LastName, email, phone, cid) values (?, ?, ?, ?, ?)
Hibernate: insert into Request_Table (cid, desCription, reqDate, status, requid) values (?, ?, ?, ?, ?)
Hibernate: insert into Request_Table (cid, desCription, reqDate, status, requid) values (?, ?, ?, ?, ?)
Record Inseted

Record Inseted

*/