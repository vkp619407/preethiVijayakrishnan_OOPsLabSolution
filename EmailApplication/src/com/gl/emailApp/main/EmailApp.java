package com.gl.emailApp.main;

import java.util.Scanner;

import com.gl.emailApp.dto.Employee;
import com.gl.emailApp.service.CredentialServiceImpl;

public class EmailApp {
	private static Scanner sc = null;

	public static void main(String[] args) {
		// TODO Auto-generated method stub		
		Employee emp;
		CredentialServiceImpl imp = new CredentialServiceImpl();
		int dept = 0;
		do {
			
			System.out.println("Please enter the department from the following "+"\n"+
					"1.Technical"+"\n"+"2.Admin"+"\n"+"3.Human Resource"+"\n"+"4.Legal");
			sc = new Scanner(System.in);
			dept = sc.nextInt();
			String deptName = null;
			
		switch (dept) {
		case 1:
			deptName = "technical";			
			emp = getNameDetails(deptName);
			break;
		case 2:
			deptName = "admin";			
			emp = getNameDetails(deptName);
			break;
		case 3:
			deptName = "humanResource";
			emp = getNameDetails(deptName);
			break;
		case 4:
			deptName = "legal";			
			emp = getNameDetails(deptName);
			break;
		default:			
			emp = null;
			System.out.println("Invalid choice,System exited");			
		}		
		imp.showCredentials(emp);		
		}while(dept!= 0);		
	}
	
	
	public static Employee getNameDetails(String deptName) {
		System.out.println("Please enter firstName ::");
		sc= new Scanner(System.in);
		String firstName = sc.nextLine();
		
		System.out.println("Please enter lastName ::");
		sc= new Scanner(System.in);
		String lastName = sc.nextLine();		
		
		return new Employee(deptName,firstName,lastName);
		
	}

}
