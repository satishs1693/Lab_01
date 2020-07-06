package com.jlcindia.hibernate4;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
//@Table(name="WeekdayStudent")
@DiscriminatorValue(value="WDSTU")
public class WeekdayStudent extends CurrentStudent {
	private String qualification;
	private String Percentage;
	private String Yop;
	public WeekdayStudent() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public String toString() {
		return "WeekdayStudent [qualification=" + qualification + ", Percentage=" + Percentage + ", Yop=" + Yop
				+ ", toString()=" + super.toString() + ", getBranch()=" + getBranch() + ", getTimings()=" + getTimings()
				+ ", getFeebal()=" + getFeebal() + ", getSname()=" + getSname() + ", getCity()=" + getCity()
				+ ", getStatus()=" + getStatus() + ", getSid()=" + getSid() + ", getTotalfee()=" + getTotalfee()
				+ ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + "]";
	}

	public WeekdayStudent(String sname, String city, String status, double totalfee, String branch, String timings,
			String feebal,String qualification, String percentage, String yop) {
		super(sname, city, status, totalfee, branch, timings, feebal);
		this.qualification = qualification;
		Percentage = percentage;
		Yop = yop;
		// TODO Auto-generated constructor stub
	}
	

}
