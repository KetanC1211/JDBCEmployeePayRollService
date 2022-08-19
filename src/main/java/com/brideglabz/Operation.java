package com.brideglabz;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Collections;


public class Operation {
	//Adding details to Employee Payroll Service
	static ArrayList<Integer> salaryList = new ArrayList<Integer>();
	public static boolean storeSalaryInArrayList() {
		boolean f= false;
		try {
			Connection con = ConnectionProvider.createC();
			String q = "select * from employee_payroll";
			Statement stmt = con.createStatement();
			ResultSet set = stmt.executeQuery(q);
			while(set.next()) {
				int salary = set.getInt(4);
				salaryList.add(salary);	
			}
			f=true;
		} catch (SQLException e) {
			e.printStackTrace();
		}		
		return f;
	}
	
	public static boolean insertEmpToDB(EmployeeDetails emp) {
		boolean f= false;
		try {
			Connection con = ConnectionProvider.createC();
			String q = "insert into students(sname,sphone,scity) values(?,?,?)";
			//Prepared Statement
			PreparedStatement pstmt = con.prepareStatement(q);
			pstmt.setString(1, emp.getName());
			pstmt.setString(2, emp.getGender());
			pstmt.setInt(3, emp.getSalary());
			
			//execute
			pstmt.executeUpdate();
			f=true;
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return f;
	}
	//Delete data of student by Id 
	public static boolean deleteEmpFromDB(int userID) {

		boolean f= false;
		try {
			Connection con = ConnectionProvider.createC();
			String q = "delete from students where id=?";
			//Prepared Statement
			PreparedStatement pstmt = con.prepareStatement(q);
			pstmt.setInt(1,userID);
			pstmt.executeUpdate();
			f=true;
		} catch (SQLException e) {
			e.printStackTrace();
		}		
		return f;
	}
	
	//Display data
	public static boolean showAllEmployee() {
		boolean f= false;
		try {
			Connection con = ConnectionProvider.createC();
			String q = "select * from employee_payroll";
			Statement stmt = con.createStatement();
			ResultSet set = stmt.executeQuery(q);
			while(set.next()) {
				int id = set.getInt(1);
				String name = set.getString(2);
				String gender = set.getString(3);
				int salary = set.getInt(4);
				//String date = set.getString(salary)
				Date startDate = set.getDate(5);
				String phoneNumber = set.getString(6);
				String address = set.getString(7);
				String department = set.getString(8) ;
				int basicPay = set.getInt(9);
				int deductions = set.getInt(10);
				int taxablePay = set.getInt(11);
				int incomeTax = set.getInt(12);
				int netPay = set.getInt(13);
				
				System.out.println("ID : "+id);
				System.out.println("Name : "+name);
				System.out.println("Gender : "+gender);
				System.out.println("Salary : "+salary);
				System.out.println("Start Date : "+startDate);
				System.out.println("Phone Number : "+phoneNumber);
				System.out.println("Address : "+address);
				System.out.println("Department : "+department);
				System.out.println("Basic Pay : "+basicPay);
				System.out.println("Deduction : "+deductions);
				System.out.println("Taxable Pay : "+taxablePay);
				System.out.println("Income Tax : "+incomeTax);
				System.out.println("Net Pay : "+netPay);
				System.out.println("+++++++++++++++++++");
				
			}
			f=true;
		} catch (SQLException e) {
			e.printStackTrace();
		}		
		return f;
	}
	
	public static boolean updateSalaryFromGivenId() throws NumberFormatException, IOException {
		boolean f= false;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the id");
		int empId = Integer.parseInt(br.readLine());
		System.out.println("Enter updated salary");
		int salary = Integer.parseInt(br.readLine());
		try {
			Connection con = ConnectionProvider.createC();
			String q = "update employee_payroll set salary = ? where id = ?";
			//Prepared Statement
			PreparedStatement pstmt = con.prepareStatement(q);
			pstmt.setInt(1,salary);
			pstmt.setInt(2,empId);
			
			//execute
			pstmt.executeUpdate();
			f=true;
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return f;
	}
	public static boolean displayDataInGivenRange() throws NumberFormatException, IOException {
		boolean f= false;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the start date of range in this format YYYY-MM-DD ");
		String startRangeDate = br.readLine();
		System.out.println("Enter the end date of range in this format YYYY-MM-DD ");
		String endRangeDate = br.readLine();
		try {
			Connection con = ConnectionProvider.createC();
			String q = "select * from employee_payroll where start_date between '"+startRangeDate+"' and '"+endRangeDate+"'";
			Statement stmt = con.createStatement();
			ResultSet set = stmt.executeQuery(q);
			while(set.next()) {
				int id = set.getInt(1);
				String name = set.getString(2);
				String gender = set.getString(3);
				int salary = set.getInt(4);
				//String date = set.getString(salary)
				Date startDate = set.getDate(5);
				String phoneNumber = set.getString(6);
				String address = set.getString(7);
				String department = set.getString(8) ;
				int basicPay = set.getInt(9);
				int deductions = set.getInt(10);
				int taxablePay = set.getInt(11);
				int incomeTax = set.getInt(12);
				int netPay = set.getInt(13);
				
				System.out.println("ID : "+id);
				System.out.println("Name : "+name);
				System.out.println("Gender : "+gender);
				System.out.println("Salary : "+salary);
				System.out.println("Start Date : "+startDate);
				System.out.println("Phone Number : "+phoneNumber);
				System.out.println("Address : "+address);
				System.out.println("Department : "+department);
				System.out.println("Basic Pay : "+basicPay);
				System.out.println("Deduction : "+deductions);
				System.out.println("Taxable Pay : "+taxablePay);
				System.out.println("Income Tax : "+incomeTax);
				System.out.println("Net Pay : "+netPay);
				System.out.println("+++++++++++++++++++");				
			}

			f=true;
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return f;
	}

	public static boolean displayMaximumSalary() {
		storeSalaryInArrayList();
		int max = Collections.max(salaryList);
        System.out.println("Maximum salary of employee is : " + max);
		return true;
	}
	public static boolean displayMinimumSalary() {
		storeSalaryInArrayList();
		int min = Collections.min(salaryList);
        System.out.println("Maximum salary of employee is : " + min);
		return true;
	}
	public static boolean displayAverageOfSalary() {
		storeSalaryInArrayList();
		int total = 0;
		for(int i = 0; i<salaryList.size(); i++) {
		    total = total+ salaryList.get(i);
		    }
		double avg = total / salaryList.size();
		System.out.println("The average salary of employee is:" + avg);
		return true;
	}
	public static boolean displaySumOfSalary() {
		storeSalaryInArrayList();
		int total = 0;
		for(int i = 0; i<salaryList.size(); i++) {
		    total = total+ salaryList.get(i);
		    }
		System.out.println("The Sum of salary of all employee is:" + total);
		return true;
	}	
}
