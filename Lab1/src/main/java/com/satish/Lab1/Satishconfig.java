package com.satish.Lab1;

import javax.sql.DataSource;

import org.apache.commons.dbcp.BasicDataSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;


@Configuration
@ComponentScan(basePackages = {"com.satish.Lab1"})
public class Satishconfig {
	@Bean
	public JdbcTemplate getJT(DataSource ds) {
		try {
			System.out.println(ds);
			//System.out.println(S);
		} catch (Exception e) {
			e.printStackTrace();
			// TODO: handle exception
		}
		return new JdbcTemplate(ds);
	}
	@Bean
	public DataSource getDataSource() {
		System.out.println("Hiiiiiiiiiiiiiiiiiiiiiiiiiii");
		BasicDataSource ds = new BasicDataSource();
		ds.setDriverClassName("com.mysql.cj.jdbc.Driver");
		ds.setUrl("jdbc:mysql://localhost:3306/bootb2");
		ds.setPassword("root");
		ds.setUsername("root");
		ds.setInitialSize(5);
		ds.setMaxActive(25);
		return ds;
	}
}
 