package com.stackroute;

import org.springframework.jdbc.core.JdbcTemplate;

public class EmployeeDAO {
	private JdbcTemplate jdbcTemplate;
	
	public EmployeeDAO(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate=jdbcTemplate;
	}
	
	public int saveEmployee(Employee employee) {
		String query="insert into employee values('"+employee.getId()+"','"
	+employee.getName()+"','"+employee.getSalary()+"')";
		
		return jdbcTemplate.update(query);
	}
	
	
}
