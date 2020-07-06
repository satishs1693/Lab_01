package com.jlcindia.hibernate4;

import javax.persistence.*;

@Entity
//@Table(name="ostudents")
//@PrimaryKeyJoinColumn(name="sid")
@DiscriminatorValue(value="OSTU")
public class OldStudent extends Student{

	@Override
	public String toString() {
		return "OldStudent [ocompany=" + ocompany + ", ocemail=" + ocemail + ", octc=" + octc + ", getSname()="
				+ getSname() + ", getCity()=" + getCity() + ", getStatus()=" + getStatus() + ", getSid()=" + getSid()
				+ ", getTotalfee()=" + getTotalfee() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
				+ ", toString()=" + super.toString() + "]";
	}
	private String ocompany;
	private String ocemail;
	private String octc;
	public OldStudent() {
		super();
		// TODO Auto-generated constructor stub
	}
	public OldStudent(String sname, String city, String status,  double totalfee,String ocompany, String ocemail, String octc) {
		super(sname, city, status, totalfee);
		this.ocompany = ocompany;
		this.ocemail = ocemail;
		this.octc = octc;
		// TODO Auto-generated constructor stub
	}

	/**
	 * @return the ocompany
	 */
	public String getOcompany() {
		return ocompany;
	}
	/**
	 * @param ocompany the ocompany to set
	 */
	public void setOcompany(String ocompany) {
		this.ocompany = ocompany;
	}
	/**
	 * @return the ocemail
	 */
	public String getOcemail() {
		return ocemail;
	}
	/**
	 * @param ocemail the ocemail to set
	 */
	public void setOcemail(String ocemail) {
		this.ocemail = ocemail;
	}
	/**
	 * @return the octc
	 */
	public String getOctc() {
		return octc;
	}
	/**
	 * @param octc the octc to set
	 */
	public void setOctc(String octc) {
		this.octc = octc;
	}
	
	
	
	
	
}
