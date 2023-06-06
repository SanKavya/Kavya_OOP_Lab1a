
package com.gl.main;

import java.util.Scanner;

import com.gl.model.EmployeeDetails;
import com.gl.service.EmailCredentialServiceImpl;
import com.gl.service.EmailcredentialService;

public class EmailApp {
    public static void main(String[] args) {
        EmailCredentialServiceImpl service = new EmailCredentialServiceImpl();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your First Name");
        String fn = sc.next();
        System.out.println("Enter your Last Name");
        String ln = sc.next();
        EmployeeDetails employee = new EmployeeDetails(fn, ln);

        System.out.println("Please enter your Department");
        System.out.println("1.Technical");
        System.out.println("2.Admin");
        System.out.println("3.Human Resource");
        System.out.println("4.legal");

        String department = "";
        int choice = sc.nextInt();
        switch (choice) {
            case 1:
                department = "tech";
                break;
            case 2:
                department = "admin";
                break;
            case 3:
                department = "hr";
                break;
            case 4:
                department = "legal";
                break;
            default:
                System.out.println("Please Enter Valid Option");
                break;
        }

        String password = service.generatePassword();
        String generatedEmail = service.generateEmailAddress(employee, department);
        service.showCredentials(employee, department);
        sc.close();

        System.out.println(employee.getFirstName());
        System.out.println(employee.getLastName());
        System.out.println(department);
    }
}











	
