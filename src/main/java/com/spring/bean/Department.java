package com.spring.bean;

public class Department {
	private String deptName;
	private Emp employee;
	
	public Department() {
		
	}

	public Department(String deptName, Emp employee) {
		super();
		this.deptName = deptName;
		this.employee = employee;
	}

	public String getDeptName() {
		return deptName;
	}

	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}

	public Emp getEmployee() {
		return employee;
	}

	public void setEmployee(Emp employee) {
		this.employee = employee;
	}

	@Override
	public String toString() {
		return "Department [deptName=" + deptName + ", employee=" + employee + "]";
	}
}
