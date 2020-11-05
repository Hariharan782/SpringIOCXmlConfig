package com.spring.app;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.bean.Department;
import com.spring.bean.Emp;

public class IOCApp {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext appCtx = new ClassPathXmlApplicationContext("Spring-Bean.xml");
		Emp e1 = (Emp) appCtx.getBean("e2");
		System.out.println(e1);
		
		Emp e2 = (Emp) appCtx.getBean("e2");
		e1.setEmpName("John Wiseman");
		
		System.out.println("e1 object = " + e1);
		System.out.println("e2 object = " + e2);
		
		Department d1 = (Department) appCtx.getBean("d1");
		System.out.println("Department - " + d1);
	}
}
