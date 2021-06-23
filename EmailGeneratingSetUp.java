
package emailgeneratorsystempackage;

import java.util.Scanner;
import java.util.Random;

/**
 * @author Yves-Noel Forbang
 *
 */
public class EmailGeneratingSetUp {
	private String firstName;
	private String lastName;
	private String password;
	private String department;
	private String company = "GoDaddy";
	private String mailboxCapacity;
	private String alternateEmail;
	private int defaultPasswordLength = 8;
	private String companyEmail;
	
	// Constructor to receive the First name, Last name, password and department.
	public EmailGeneratingSetUp () {
		firstName = getEmployeeFirstName();
		lastName = getEmployeeLastName();
		department = getDepartment();
		password = generatePassword(defaultPasswordLength);
		companyEmail = firstName.toLowerCase() + "." + lastName.toLowerCase() + "@" + department.toLowerCase() + "." + company + ".com";
		
		
		System.out.println("\n\n");
		System.out.println("FIRST NAME = " + firstName);
		System.out.println("LAST NAME = " + lastName);
		System.out.println("DEPARTMENT = " + department);
		System.out.println("YOUR PASSWORD IS = " + password);
		System.out.println("\n\n");
		System.out.println("NEW EMPLOYEE EMAIL = " + companyEmail);
		
	}
	
	/**
	 * 
	 * @return Method gets the user input and returns the employee's First Name.
	 */
	private String getEmployeeFirstName() {
		Scanner nameOne = new Scanner(System.in);
		System.out.println("Enter First Name");
		String employeeFirstName = nameOne.nextLine();
		return employeeFirstName;
	}
	
	/**
	 * 
	 * @return Method gets user input and returns the employee's Last Name.
	 */
	private String getEmployeeLastName( ) {
		Scanner nameTwo = new Scanner(System.in);
		System.out.println("Enter Last Name");
		String employeeLastName = nameTwo.nextLine();
		return employeeLastName;
	}
	
	/**
	 * 
	 * @return Method gets user input and returns the employee's Department.
	 */
	private String getDepartment() {
		Scanner depmnt = new Scanner(System.in);
		System.out.println("Enter Department (E.G Engineering)");
		String employeeDepartment = depmnt.nextLine();
		return employeeDepartment;
	}
	
	/**
	 * 
	 * @return Method generates a unique 8-character password for every employee.
	 */
	private String generatePassword(int length) {
		String passwordSet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890";
		char[] employeePassword = new char[length];
		for (int i = 0; i < length; i++) {
			int randomGenerator = (int) (Math.random() * passwordSet.length());
			employeePassword[i] = passwordSet.charAt(randomGenerator);
		}
		return new String(employeePassword);
	}
	


}


