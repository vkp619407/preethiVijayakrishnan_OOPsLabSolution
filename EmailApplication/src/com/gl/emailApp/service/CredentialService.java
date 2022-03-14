package com.gl.emailApp.service;

import com.gl.emailApp.dto.Employee;

public interface CredentialService {
	
	public String generatePassword();
	
	public String generateEmailAddress(Employee emp);
	
	public void showCredentials(Employee emp);

}
