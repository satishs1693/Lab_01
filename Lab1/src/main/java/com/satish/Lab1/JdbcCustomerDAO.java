package com.satish.Lab1;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;

@Repository("custDAO")
public class JdbcCustomerDAO implements CustomerDao {
public JdbcCustomerDAO(JdbcTemplate jremp) {
		System.out.println("Hi Satish I am here ");
	}
	@Autowired
	JdbcTemplate jremp;
	public void addCustomer(Customer cust) {
		String sql ="insert into customers values (?,?,?,?,?)";
		jremp.update(sql,cust.getCid(),cust.getCname(),cust.getEmail(),cust.getPhone(),cust.getEmail());
	}
	@Override
	public List<Customer> getAllCustomer() {
		// TODO Auto-generated method stub
		String sql = "select * from customers";
		List<Customer> list = jremp.query(sql, new CustomerRowMapper());
		return list;
	}	
}

@Component("Sammy")
class Satish{

	public Satish() {
		//super();
		System.out.println("Satish In compnet Scann");
		
		// TODO Auto-generated constructor stub
	}
	}
@Controller("Sammy1")
class Satish1{
	public Satish1() {
		//super();
		System.out.println("Satish In compnet1233  @Controller Scann");
		// TODO Auto-generated constructor stub
	}}