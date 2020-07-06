package com.satish.Lab6;

import java.util.HashMap;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.expression.MapAccessor;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.satish.Lab6.*;

@Repository
public class HibernateCustomerDAO extends BaseDAO implements CustomerDao{ //implements CustomerDao {
	@Override
	public void addCustomer(Customer cust) {
	
		getHibernateTemplate().save(cust);
	
		//getJdbcTemplate().update(sql,cust.getCid(),cust.getCname(),cust.getEmail(),cust.getPhone(),cust.getEmail());	
	}
	@Override
	public List<Customer> getAllCustomer() {
		// TODO Auto-generated method stub
		List<Customer> list = getHibernateTemplate().loadAll(Customer.class);
		return list;
	}	
}
