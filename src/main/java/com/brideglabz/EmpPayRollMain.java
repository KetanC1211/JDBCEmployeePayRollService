package com.brideglabz;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.Date;

public class EmpPayRollMain {

	public static void main(String[] args) throws IOException {
		System.out.println("Welcome to Employee payroll service ");
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		while(true) {
			System.out.println("\t ----Menu---- ");
			System.out.println("1. Add Student");
			System.out.println("2. Delete Student");
			System.out.println("3. Display");
			System.out.println("4. Search and update");
			System.out.println("5. Exit");
			int c = Integer.parseInt(br.readLine());
			if(c==1) {
				//insert elements			
			}
			else if(c==2) {
				//delete students
				System.out.println("Enter Student ID to delete");
				int empID = Integer.parseInt(br.readLine());
				boolean answer = Operation.deleteEmpFromDB(empID);
				if(answer) {
					System.out.println("Deleted record successfully");
				}else {
					System.out.println("Something went wrong try again...");
				}
			}
			else if(c==3) {
				boolean answer = Operation.showAllEmployee();
				if(answer) {
					System.out.println("All record shown");
				}else {
					System.out.println("Something went wrong try again...");
				}
			}
			else if(c==4) {
				//Search
				//Search
				boolean answer = Operation.updateSalaryFromGivenId();
				if(answer) {
					System.out.println("Updated Salary");
				}else {
					System.out.println("Something went wrong try again...");
				}
			}
			else if(c==5) {
				//Exit
				break;
			}
			else {
				System.out.println("Invalid Input");
			}
		}
		System.out.println("Thank you for using Application");	
	}
}
