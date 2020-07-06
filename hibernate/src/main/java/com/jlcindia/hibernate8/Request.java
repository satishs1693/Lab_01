package com.jlcindia.hibernate8;

import javax.persistence.*;


@Entity
@Table(name="Request_Table")
public class Request {

	@Id
	@Column(name="requid")
	@GeneratedValue(strategy = GenerationType.AUTO)
	 private Integer requid;
	 private String reqDate;
	 private String desCription;
	 @Column(name="status")
	 private String status;
	 @ManyToOne(cascade = CascadeType.ALL)
	 @JoinColumn(name ="cid", referencedColumnName = "cid")
	 private Customer customer;
	public Integer getRequid() {
		return requid;
	}
	public void setRequid(Integer requid) {
		this.requid = requid;
	}	
	public String getReqDate() {
		return reqDate;
	}
	public void setReqDate(String reqDate) {
		this.reqDate = reqDate;
	}
	public String getDesCription() {
		return desCription;
	}
	public void setDesCription(String desCription) {
		this.desCription = desCription;
	}
	public Request() {
		super();
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public Customer getCustomer() {
		return customer;
	}
	public void setCustomer(Customer customer) {
		this.customer = customer;
	}
	public Request( String reqDate, String desCription, String status) {
		super();
		//is.requid = requid;
		this.reqDate = reqDate;
		this.desCription = desCription;
		this.status = status;
	}
	@Override
	public String toString() {
		return "Request [requid=" + requid + ", reqDate=" + reqDate + ", desCription=" + desCription + ", status="
				+ status + ", customer=" + customer + "]";
	}
	 

}
