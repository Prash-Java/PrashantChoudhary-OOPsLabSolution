package com.greatlearning.service;

import java.util.Random;

import com.greatlearning.model.Employee;

public class CredentialService {
	String companyDomain = ".abc.com";
	String generatedEmailId="";
	
	public String generateEmailAddress(Employee emp) {
		generatedEmailId = emp.getFirstName().toLowerCase()+emp.getLastName().toLowerCase()+"@"+emp.getDepartment().toLowerCase()+companyDomain;
		return generatedEmailId;
	}
	
	public String generatePassword() {
		Random random = new Random();
		
		String capitalLetters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		String smallLetters = "abcdefghijklmnopqrstuvwxyz";
		String numbers = "0123456789";
		String specialCharacters = "!@#$%^&*_=+-/.?<>)";
		
		String allowedChars = capitalLetters+smallLetters+numbers+specialCharacters;
		
		char[] password = new char[8];
		
		for(int i = 0;i<8;i++) {
			int idx = random.nextInt(allowedChars.length());
			password[i] = allowedChars.charAt(idx);
		}
		// Generate 8 digit random password
		
		return new String(password);
	}
	
	public void showCredentials(Employee emp, String email, String password) {
		System.out.println("Dear " + emp.getFirstName() + " your generated credentials are as follows");
		System.out.println("Email---> " + email);
		System.out.println("Password--->" + password);
		
	}

}
