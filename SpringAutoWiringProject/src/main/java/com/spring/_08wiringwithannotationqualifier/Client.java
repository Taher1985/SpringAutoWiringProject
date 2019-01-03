package com.spring._08wiringwithannotationqualifier;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Client {

	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("/_08applicationcontainerbeans.xml");

		Employee employee = (Employee) context.getBean("employee");
		employee.employeeAddress();

	}

}
