package com.jlcindia.hibernate8;

import java.util.Collection;

import javax.persistence.*;
import javax.persistence.GenerationType;


@Entity
@Table(name= "customer_Table")
public class Customer {
    @Id
    @Column(name="cid")
    @GeneratedValue(strategy = GenerationType.AUTO)
	private Integer cid;
	private String FirstName;
	public Customer() {
		super();
	}
	private String LastName;
	private String email;
	private String phone;
	
	@OneToMany(mappedBy = "customer")
	private Collection<Request> requests;
	
	@Override
	public String toString() {
		return "Customer [cid=" + cid + ", FirstName=" + FirstName + ", LastName=" + LastName + ", email=" + email
				+ ", phone=" + phone + "]";
	}
	public Customer(Integer cid, String firstName, String lastName, String email, String phone) {
		super();
		//this.cid = cid;
		FirstName = firstName;
		LastName = lastName;
		this.email = email;
		this.phone = phone;
	}
	public Integer getCid() {
		return cid;
	}
	public void setCid(Integer cid) {
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
	public Collection<Request> getRequests() {
		return requests;
	}
	public void setRequests(Collection<Request> requests) {
		this.requests = requests;
	}
}
