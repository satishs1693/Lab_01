package com.jlcindia.hibernate7;

import javax.persistence.*;
import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;


@Entity
@Table(name="Customer155")
public class Customer155 {
	
	 @Id
	 @Column(name="cid")
	 @GeneratedValue(strategy=GenerationType.AUTO)
	 private int cid;
	 private String FirstName;
	 private String LastName;
	 private String email;
     private String phone;
     @OneToOne(cascade = CascadeType.ALL)
     @JoinColumn(name="aid")
     private Address155 address;
	public Customer155(String firstName, String lastName, String email, String phone, Address155 address) {
		super();
		//this.cid = cid;
		FirstName = firstName;
		LastName = lastName;
		this.email = email;
		this.phone = phone;
		this.address = address;
	}
	public Customer155() {
		super();
	}
	@Override
	public String toString() {
		return "Customer155 [cid=" + cid + ", FirstName=" + FirstName + ", LastName=" + LastName + ", email=" + email
				+ ", phone=" + phone + ", address=" + address + "]";
	}
	public int getCid() {
		return cid;
	}
	public void setCid(int cid) {
		this.cid = cid;
	}
	public String getFirstName() {
		return FirstName;
	}
	public void setFirstName(String firstName) {
		FirstName = firstName;
	}
	public String getLastName() {
		return LastName;
	}
	public void setLastName(String lastName) {
		LastName = lastName;
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
	public Address155 getAddress() {
		return address;
	}
	public void setAddress(Address155 address) {
		this.address = address;
	}
     
}
