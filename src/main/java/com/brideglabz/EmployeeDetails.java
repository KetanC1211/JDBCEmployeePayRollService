package com.brideglabz;

import java.sql.Date;

public class EmployeeDetails {
	int id;
	String name;
	String gender;
	int salary;
	String date;
	Date startDate = Date.valueOf(date);
	String phoneNumber;
	String address;
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	String department;
	int basicPay;
	int deductions;
	int taxablePay;
	int incomeTax;
	int netPay;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public Date getStartDate() {
		return startDate;
	}
	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public int getBasicPay() {
		return basicPay;
	}
	public void setBasicPay(int basicPay) {
		this.basicPay = basicPay;
	}
	public int getDeductions() {
		return deductions;
	}
	public void setDeductions(int deductions) {
		this.deductions = deductions;
	}
	public int getTaxablePay() {
		return taxablePay;
	}
	public void setTaxablePay(int taxablePay) {
		this.taxablePay = taxablePay;
	}
	public int getIncomeTax() {
		return incomeTax;
	}
	public void setIncomeTax(int incomeTax) {
		this.incomeTax = incomeTax;
	}
	public int getNetPay() {
		return netPay;
	}
	public void setNetPay(int netPay) {
		this.netPay = netPay;
	}
	public EmployeeDetails() {
		super();
		// TODO Auto-generated constructor stub
	}
	public EmployeeDetails(String name, String gender, int salary, String date, Date startDate, String phoneNumber,
			String address,String department, int basicPay, int deductions, int taxablePay, int incomeTax, int netPay) {
		super();
		this.name = name;
		this.gender = gender;
		this.salary = salary;
		this.date = date;
		this.startDate = startDate;
		this.phoneNumber = phoneNumber;
		this.address = address;
		this.department = department;
		this.basicPay = basicPay;
		this.deductions = deductions;
		this.taxablePay = taxablePay;
		this.incomeTax = incomeTax;
		this.netPay = netPay;
	}
	@Override
	public String toString() {
		return "EmployeeDetails [id=" + id + ", name=" + name + ", gender=" + gender + ", salary=" + salary + ", date="
				+ date + ", startDate=" + startDate + ", phoneNumber=" + phoneNumber + ", address =" + address +", department=" + department
				+ ", basicPay=" + basicPay + ", deductions=" + deductions + ", taxablePay=" + taxablePay
				+ ", incomeTax=" + incomeTax + ", netPay=" + netPay + "]";
	}
	
}
