package com.spring._12javabeanconfiguration;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Client {

	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("/_12applicationcontainerbeans.xml");

		Employee employee1 = (Employee) context.getBean("employee1");
		employee1.employeeAddress();
		
		Employee employee = (Employee) context.getBean("employee");
		employee.employeeAddress();

	}

}
