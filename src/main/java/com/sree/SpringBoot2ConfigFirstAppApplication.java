package com.sree;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringBoot2ConfigFirstAppApplication {

	public static void main(String[] args) {
		ApplicationContext ct=SpringApplication.run(SpringBoot2ConfigFirstAppApplication.class, args);
		EmployeeExports ob=ct.getBean("eobj",EmployeeExports.class);
		ob.showExportMsg();
	
	System.out.println(ct.getBean("eobj",EmployeeExports.class));
	}
}
