package com.satish.Lab6;

import java.util.Properties;

import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.orm.hibernate5.HibernateTransactionManager;
import org.springframework.orm.hibernate5.LocalSessionFactoryBean;
import org.springframework.transaction.PlatformTransactionManager;
import com.mysql.cj.xdevapi.SessionFactory;

@Configuration
@ComponentScan(basePackages = {"com.satish.Lab1"})
public class Configclass {
	@Bean(name="DataSource")
	public DataSource datasource() {
		DriverManagerDataSource ds = new DriverManagerDataSource();
		ds.setDriverClassName("com.mysql.cj.jdbc.Driver");
		ds.setUrl("jdbc:mysql://localhost:3306/bootb2");
		ds.setUsername("root");
		ds.setPassword("root");
		return ds;
	}
	@Bean(name="DataSource")
	public LocalSessionFactoryBean sessionFactory(DataSource ds) {
		LocalSessionFactoryBean ln = new LocalSessionFactoryBean();
		ln.setDataSource(ds);
		Properties props = new Properties();
		props.put("hibernate.show_sql", "true");
		props.put("hibernate.format_sql", "true");
		props.put("hibernate.hbm2ddl.auto", "update");
		props.put("hibernate.transaction.factory_class",
		"org.hibernate.transaction.JDBCTransactionFactory");
		ln.setHibernateProperties(props);
		ln.setPackagesToScan("com.satish.Lab6");
		return ln;
	}
	@Bean(name="HibernateTemplate")
	public HibernateTemplate hibernateTemplate(SessionFactory sessionFactory) {
		return new HibernateTemplate((org.hibernate.SessionFactory) sessionFactory);
	}
	@Bean(name="jlcHibernateTransactionManager")
	public PlatformTransactionManager transactionManager(SessionFactory sessionFactory) {
	return new HibernateTransactionManager((org.hibernate.SessionFactory) sessionFactory);
	}
}


/*@Configuration
@ComponentScan(basePackages = {"com.satish.Lab1"})
public class Satishconfig {
	@Bean
	public DataSource getDataSource() {
	
		BasicDataSource ds = new BasicDataSource();
		ds.setDriverClassName("com.mysql.cj.jdbc.Driver");
		ds.setUrl("jdbc:mysql://localhost:3306/bootb2");
		ds.setPassword("root");
		ds.setUsername("root");
		ds.setInitialSize(5);
		ds.setMaxActive(25);
		return ds;
	}
	@Bean
	public JdbcTemplate getJT(DataSource ds) {
		return new JdbcTemplate(ds);
	}
}
*/
