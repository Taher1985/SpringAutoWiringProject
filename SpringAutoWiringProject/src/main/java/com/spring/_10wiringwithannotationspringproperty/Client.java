package com.spring._10wiringwithannotationspringproperty;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Client {

	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("/_10applicationcontainerbeans.xml");

		Employee employee = (Employee) context.getBean("employee");
		employee.employeeName();

	}

}
