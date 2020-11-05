package com.spring.bean;

public class Emp {
	private int empNo;
	private String empName;
	private String city;

	public Emp() {
		super();
	}

	public Emp(int empNo, String empName, String city) {
		super();
		this.empNo = empNo;
		this.empName = empName;
		this.city = city;
	}

	public int getEmpNo() {
		return empNo;
	}

	public void setEmpNo(int empNo) {
		this.empNo = empNo;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	@Override
	public String toString() {
		return "Emp [empNo=" + empNo + ", empName=" + empName + ", city=" + city + "]";
	}
}
