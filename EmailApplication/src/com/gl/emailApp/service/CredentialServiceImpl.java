package com.gl.emailApp.service;

import java.util.Random;

import com.gl.emailApp.dto.Employee;

public class CredentialServiceImpl implements CredentialService {
	public String generatePassword() {
		int length = 10;
		String symbol = "-/.^&*_!@%#";
		String cap_letter = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		String small_letter = "abcdefghijklmnopqrstuvwxyz";
		String numbers = "0123456789";

		String finalString = cap_letter + small_letter + numbers + symbol;

		Random random = new Random();

		char[] password = new char[length];

		for (int i = 0; i < length; i++) {
			password[i] = finalString.charAt(random.nextInt(finalString.length()));

		}
		return password.toString();

	}

	public String generateEmailAddress(Employee emp) {		
		return emp.getFirstName() + emp.getLastName() + "@" + emp.getDepartment() + "company.com";	

	}

	public void showCredentials(Employee emp) {
		if(emp!=null) {
		System.out.println("Dear " + emp.getFirstName() + "your generated credentials are as follows");
		System.out.println("Email-->" + generateEmailAddress(emp));
		System.out.println("Password-->" + generatePassword());
		}
	}

}
