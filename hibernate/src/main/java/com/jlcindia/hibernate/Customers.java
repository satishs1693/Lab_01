package com.jlcindia.hibernate;

import javax.persistence.*;

@Entity
@Table(name = "customers")
public class Customers {
	@Column(name="cname")
	private String cname;
	@Column(name="email")
	private String email;
	public Customers() {
		super();
	}
	@Override
	public String toString() {
		return "Customers [cname=" + cname + ", email=" + email + ", phone=" + phone + ", city=" + city + ", cid=" + cid
				+ ", bal=" + bal + "]";
	}

	@Column(name="phone")
	private String phone;
	@Column(name="city")
	private String city;
	public String getCity() {
		return city;
	}
	public Customers(String cname, String email, String phone, String city, int cid, double bal) {
		super();
		this.cname = cname;
		this.email = email;
		this.phone = phone;
		this.city = city;
		this.cid = cid;
		this.bal = bal;
	}
	public void setCity(String city) {
		this.city = city;
	}

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="cid")
	private int cid;
	@Column(name="bal")
	private double bal;

	public String getCname() {
		return cname;
	}

	public void setCname(String cname) {
		this.cname = cname;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public int getCid() {
		return cid;
	}

	public void setCid(int cid) {
		this.cid = cid;
	}

	public double getBal() {
		return bal;
	}

	public void setBal(double bal) {
		this.bal = bal;
	}
}
