
package com.jlcindia.hibernate5;

import javax.persistence.*;

@Entity

  @Table(name="csstudents123")
  
	/*
	 * @PrimaryKeyJoinColumn(name="sid")
	 * 
	 * @DiscriminatorValue(value="CSTU")
	 */
public class CurrentStudent extends Student {
	 @Override
	public String toString() {
		return "CurrentStudent [branch=" + branch + ", timings=" + timings + ", feebal=" + feebal + ", getSname()="
				+ getSname() + ", getCity()=" + getCity() + ", getStatus()=" + getStatus() + ", getSid()=" + getSid()
				+ ", getTotalfee()=" + getTotalfee() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
				+ ", toString()=" + super.toString() + "]";
	}
	 @Column(name="branch")
	private String branch;
	 @Column(name="timings")
	 private String timings;
	 @Column(name="feebal")
     private String feebal;
	public String getBranch() {
		return branch;
	}
	public void setBranch(String branch) {
		this.branch = branch;
	}
	public CurrentStudent() {
		super();
		// TODO Auto-generated constructor stub
	}
	public CurrentStudent(String sname, String city, String status,  double totalfee,String branch, String timings, String feebal) {
		super(sname, city, status, totalfee);
		this.branch = branch;
		this.timings = timings;
		this.feebal = feebal;
		// TODO Auto-generated constructor stub
	}
	public String getTimings() {
		return timings;
	}
	public void setTimings(String timings) {
		this.timings = timings;
	}
	public String getFeebal() {
		return feebal;
	}
	public void setFeebal(String feebal) {
		this.feebal = feebal;
	}
     
}
