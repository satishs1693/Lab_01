package com.jlcindia.hibernate3;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="WeekendStudent")
public class WeekendStudent extends CurrentStudent {
	private String Wcompany;
	private String Wcemail;
    private String Wctc;
	/**
	 * @return the wcompany
	 */
	public String getWcompany() {
		return Wcompany;
	}
	/**
	 * @param wcompany the wcompany to set
	 */
	public void setWcompany(String wcompany) {
		Wcompany = wcompany;
	}
	/**
	 * @return the wcemail
	 */
	public String getWcemail() {
		return Wcemail;
	}
	/**
	 * @param wcemail the wcemail to set
	 */
	public void setWcemail(String wcemail) {
		Wcemail = wcemail;
	}
	/**
	 * @return the wctc
	 */
	public String getWctc() {
		return Wctc;
	}
	/**
	 * @param wctc the wctc to set
	 */
	public void setWctc(String wctc) {
		Wctc = wctc;
	}
	@Override
	public String toString() {
		return super.toString()+"WeekendStudent [Wcompany=" + Wcompany + ", Wcemail=" + Wcemail + ", Wctc=" + Wctc + "]";
	}
	public WeekendStudent() {
		super();
		// TODO Auto-generated constructor stub
	}
	public WeekendStudent(String sname, String city, String status, double totalfee, String branch, String timings,
			String feebal,String wcompany, String wcemail, String wctc) {
		super(sname, city, status, totalfee, branch, timings, feebal);
		Wcompany = wcompany;
		Wcemail = wcemail;
		Wctc = wctc;
		// TODO Auto-generated constructor stub
	}

   
}
