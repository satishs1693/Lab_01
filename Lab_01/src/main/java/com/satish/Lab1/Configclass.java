package com.satish.Lab1;

import javax.sql.DataSource;

import org.apache.commons.dbcp.BasicDataSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;

@Configuration
public class Configclass {

	@Bean
	public DataSource getDataSource() {
		
		BasicDataSource ds = new BasicDataSource();
		ds.setDriverClassName("com.mysql.cj.jdbc.Driver");
		ds.setDriverClassName("com.mysql.cj.jdbc.Driver");
		ds.setUrl("jdbc:mysql://localhost:3306/bootb2");
		ds.setPassword("root");
		ds.setUsername("root");
		
		return ds;
	}
	public JdbcTemplate getTemplate( DataSource ds) {
		return new JdbcTemplate(ds);
	}
}
