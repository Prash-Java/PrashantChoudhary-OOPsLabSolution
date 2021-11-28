package com.greatlearning.main;

import java.util.Scanner;

import com.greatlearning.model.Employee;
import com.greatlearning.service.CredentialService;

public class Driver {

	public static void main(String[] args) {
		
		//declare attributes
		String firstName, lastName, choice;
		String department="";
		
		//Get details from users
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Your First Name: ");
		firstName = sc.nextLine();
		System.out.println("Enter Your Last Name: ");
		lastName = sc.nextLine();
		System.out.println("1.Technical\n2.Admin\n3.Human Resource\n4.Legal");
		System.out.println("Enter Your Department Choice: ");
		choice = sc.nextLine();
		
		Employee employee;
		
		switch(Integer.parseInt(choice)) {
		case 1:
			department = "Tech";
			employee = new Employee(firstName,lastName,department);
			break;
		case 2:
			department = "Admin";
			employee = new Employee(firstName,lastName,department);
			break;
		case 3:
			department = "HR";
			employee = new Employee(firstName,lastName,department);
			break;
		case 4:
			department = "Legal";
			employee = new Employee(firstName,lastName,department);
			break;
			
			default:
				System.out.println("Please Enter Correct Choice..");
				//Closing The Resource As This Wont Be Needed Once User Enters Choice Inappropriately
				sc.close();
				return;
		}
		
		if(!department.equals("")) {
		CredentialService cs = new CredentialService();
		String email = cs.generateEmailAddress(employee);
		System.out.println("Email-->" + email);
		String password = cs.generatePassword();
		System.out.println("Password-->" + password);
		}
		
		
	}
}

