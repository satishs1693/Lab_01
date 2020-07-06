package com.satish.Lab6;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class BaseDAO {
	
	@Autowired
	private HibernateTemplate HibernateTemplate;

	public HibernateTemplate getHibernateTemplate() {
		return HibernateTemplate;
	}

	public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
		HibernateTemplate = hibernateTemplate;
	}

	
}
