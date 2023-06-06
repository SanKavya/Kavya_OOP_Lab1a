package com.gl.service;

import com.gl.model.EmployeeDetails;
public interface EmailcredentialService {
	public String generateEmailAddress(EmployeeDetails emp,String department);
	
	public String generatePassword();
	
	public void showCredentials(EmployeeDetails employee,String department);
	

}
