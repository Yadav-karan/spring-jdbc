package com.springcore.springjdbc;

import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import com.springcore.springjdbc.dao.StudentDao;
import com.springcore.springjdbc.dao.StudentDaoImpl;

@Configuration
public class JavaConfig {

	@Bean(name="ds")
	public DataSource getDatSource() {
		DriverManagerDataSource ds = new DriverManagerDataSource();
		ds.setDriverClassName("org.postgresql.Driver");
		ds.setUrl("jdbc:postgresql://localhost:5432/springjdbc");
		ds.setUsername("postgres");
		ds.setPassword("karan");
		return ds;
	}
	
	@Bean(name="jdbcTemplate")
	public JdbcTemplate getTemplate() {
		JdbcTemplate jdbcTemplate = new JdbcTemplate();
		jdbcTemplate.setDataSource(getDatSource());
		return jdbcTemplate;
	}
	
	@Bean(name="studentDao")
	public StudentDao getStudentDao() {
		StudentDaoImpl studentDao = new StudentDaoImpl();
		studentDao.setJdbcTemplate(getTemplate());
		return studentDao;
	}
}
