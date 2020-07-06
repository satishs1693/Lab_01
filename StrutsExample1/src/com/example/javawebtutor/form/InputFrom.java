package com.example.javawebtutor.form;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionMapping;

public class InputFrom extends ActionForm {
	
	private String name="satishhhhhhhhhhhhh";
	private int age;
	private String addrs;
	private String gender;
	private String ms;
	private String qlfy;
	private String[] crs;
	private String[] hb;
	

	public InputFrom() {
		super();
		System.out.println("I am here Satish");
	}
	
	@Override
	public void reset(ActionMapping mapping, HttpServletRequest request) {
		
		ms = "Single";
		crs=new String[1];
		crs[0]="No Courses Selected";
		hb = new String[1];
		hb[0]="no Habbies Selected";
		
	}
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		System.out.println("I am setters methoed "+name);
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		System.out.println("I am setters age methoed "+age);
	
		this.age = age;
	}
	public String getAddrs() {
		return addrs;
	}
	public void setAddrs(String addrs) {
		this.addrs = addrs;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		System.out.println("genderrrrrrrrrrrrrrrrrr"+gender);
		this.gender = gender;
	}
	public String getMs() {
		return ms;
	}
	public void setMs(String ms) {
		this.ms = ms;
	}
	public String getQlfy() {
		return qlfy;
	}
	public void setQlfy(String qlfy) {
		this.qlfy = qlfy;
	}
	public String[] getCrs() {
		return crs;
	}
	public void setCrs(String[] crs) {
		this.crs = crs;
	}
	public String[] getHb() {
		return hb;
	}
	public void setHb(String[] hb) {
		this.hb = hb;
	}
	
	
	
	

}
