package com.satish.Lab2;

import java.util.List;

import org.springframework.stereotype.Repository;

@Repository
public interface CustomerDao {

void addCustomer(Customer cust);
List<Customer> getAllCustomer();
	
}
