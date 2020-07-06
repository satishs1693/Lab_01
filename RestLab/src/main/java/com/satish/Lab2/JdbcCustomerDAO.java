package com.satish.Lab2;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.satish.Lab2.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.expression.MapAccessor;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class JdbcCustomerDAO extends BaseDAO implements CustomerDao{ //implements CustomerDao {
	@Override
	public void addCustomer(Customer cust) {
		String sql ="insert into customers values (:cid,:cn,:em,:ph,:ci)";
		Map<String,Object> params = new HashMap<>();
		params.put("cid", cust.getCid());
		params.put("cn", cust.getCname());
		params.put("em", cust.getEmail());
		params.put("ph",cust.getPhone());
		params.put("ci",cust.getCity());
		getJdbcTemplate().update(sql, params);
	
		//getJdbcTemplate().update(sql,cust.getCid(),cust.getCname(),cust.getEmail(),cust.getPhone(),cust.getEmail());	
	}
	@Override
	public List<Customer> getAllCustomer() {
		// TODO Auto-generated method stub
		String sql = "select * from customers where city = :mycity";
		Map< String , Object> param = new HashMap<>();
		param.put("mycity","Hyd");
		List<Customer> list = getJdbcTemplate().query(sql, param ,new CustomerRowMapper());
		return list;
	}	
}
