package com.stackroute;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("beans.xml");
		EmployeeDAO empDao=(EmployeeDAO)context.getBean("empDao");
		
		Employee emp1=new Employee(501, "Jelly", 4563.36);
		int status= empDao.saveEmployee(emp1);
		
		if(status>0)
			System.out.println(status+" rows affected");
	}
}
