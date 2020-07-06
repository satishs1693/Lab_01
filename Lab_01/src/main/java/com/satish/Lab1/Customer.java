package com.satish.Lab1;

public class Customer {

	 public String email;
	 public int cid;
	 public String city;
	 public long phone;
	 public String cname;
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public int getCid() {
		return cid;
	}
	public void setCid(int cid) {
		this.cid = cid;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public long getPhone() {
		return phone;
	}
	public void setPhone(long phone) {
		this.phone = phone;
	}
	public String getCname() {
		return cname;
	}
	public void setCname(String cname) {
		this.cname = cname;
	}
	@Override
	public String toString() {
		return "Customer [email=" + email + ", cid=" + cid + ", city=" + city + ", phone=" + phone + ", cname=" + cname
				+ "]";
	}
	public Customer(String email, int cid, String city, long phone, String cname) {
		super();
		this.email = email;
		this.cid = cid;
		this.city = city;
		this.phone = phone;
		this.cname = cname;
	}
	public Customer() {
		// TODO Auto-generated constructor stub
	}
	
	
}
