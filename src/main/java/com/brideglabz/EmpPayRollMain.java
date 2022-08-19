package com.brideglabz;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.Date;
import java.sql.SQLException;

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
					// insert values
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
				while(true) {
					System.out.println("\t ----Menu---- ");
					System.out.println("1. Show table");
					System.out.println("2. Display Data in given range");
					System.out.println("3. Display Sum of Salary");
					System.out.println("4. Display Average Salary");
					System.out.println("5. Display Minimum Salary");
					System.out.println("6. Display Maximum Salary");
					System.out.println("7. Back");
					int choice = Integer.parseInt(br.readLine());
					if(choice==1) {
						boolean answer = Operation.showAllEmployee();
						if(answer) {
							System.out.println("All record shown");
						}else {
							System.out.println("Something went wrong try again...");
						}
					}
					else if(choice==2){
						boolean answer = Operation.displayDataInGivenRange();
						if(answer) {
							System.out.println("Record Shown");
						}else {
							System.out.println("Something went wrong try again...");
						}
					}
					else if(choice==3){
						boolean answer = Operation.displaySumOfSalary();
						if(answer) {
							System.out.println("Successfully calculated sum");
						}else {
							System.out.println("Something went wrong try again...");
						}
					}
					else if(choice==4){
						boolean answer = Operation.displayAverageOfSalary();
						if(answer) {
							System.out.println("Successfully calculated average");
						}else {
							System.out.println("Something went wrong try again...");
						}
					}
					else if(choice==5){
						boolean answer = Operation.displayMinimumSalary();
						if(answer) {
							System.out.println("Successfully found minimum");
						}else {
							System.out.println("Something went wrong try again...");
						}
					}
					else if(choice==6){
						boolean answer = Operation.displayMaximumSalary();
						if(answer) {
							System.out.println("Successfully found maximum");
						}else {
							System.out.println("Something went wrong try again...");
						}
					}
					else if(choice==7) {
						break;
					}
					else {
						System.out.println("Invalid input");
					}
				}
			}
			else if(c==4) {	
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
