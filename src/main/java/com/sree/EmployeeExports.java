package com.sree;

import org.springframework.stereotype.Component;

@Component("eobj")
public class EmployeeExports {
	public void EmployeeExports() {
		System.out.println("OBJ CREATED");
	}

	public void showExportMsg() {
		System.out.println("FROM EXPORT MESSAGE");
	}
}
