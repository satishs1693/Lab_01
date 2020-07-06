package com.satish.Lab1;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;

public class JdbcCustomerDao implements CustomerDao {

	@Autowired
	JdbcTemplate jt;
	
	@Override
	public void addCustomer(Customer ct) {
		
		
		
		
	}

	@Override
	public List<Customer> getAllCustomers() {
		// TODO Auto-generated method stub
		return null;
	}

}
