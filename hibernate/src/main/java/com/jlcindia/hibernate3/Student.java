package com.jlcindia.hibernate3;

import javax.persistence.*;

@Entity
@Table(name="mystudents123")
@Inheritance(strategy=InheritanceType.TABLE_PER_CLASS)
public class Student {
	
	 @Column(name="sname")
	 private String sname;
	 
	 @Column(name="city")
	 private String city;
	 
	 @Column(name="status")
	 private String status;
	 @Id
	 @Column(name="sid")
	 @GeneratedValue(strategy = GenerationType.AUTO)
	 private int sid;
	 
	 @Column(name="totalfee")
	 private double totalfee;
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Student(String sname, String city, String status, double totalfee) {
		super();
		this.sname = sname;
		this.city = city;
		this.status = status;
		//this.sid = sid;
		this.totalfee = totalfee;
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public int getSid() {
		return sid;
	}
	public void setSid(int sid) {
		this.sid = sid;
	}
	public double getTotalfee() {
		return totalfee;
	}
	public void setTotalfee(double totalfee) {
		this.totalfee = totalfee;
	}
	 
}
