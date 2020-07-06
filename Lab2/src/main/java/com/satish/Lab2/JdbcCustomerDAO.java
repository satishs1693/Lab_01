package com.satish.Lab2;

import java.util.List;
import com.satish.Lab2.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class JdbcCustomerDAO extends BaseDAO implements CustomerDao{ //implements CustomerDao {
	@Override
	public void addCustomer(Customer cust) {
		String sql ="insert into customers values (?,?,?,?,?)";
		getJdbcTemplate().update(sql,cust.getCid(),cust.getCname(),cust.getEmail(),cust.getPhone(),cust.getEmail());	
	}
	@Override
	public List<Customer> getAllCustomer() {
		// TODO Auto-generated method stub
		String sql = "select * from customers";
		List<Customer> list = getJdbcTemplate().query(sql, new CustomerRowMapper());
		return list;
	}	
}
