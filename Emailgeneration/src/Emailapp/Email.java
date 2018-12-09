package Emailapp;

import java.util.Scanner;

import sun.security.util.Length;

public class Email {
	private String firstName;
	private String lastName;
	private String password;
	private String department;
	private String email;
	private int mailboxCapacity;
	private String alternateEmail;
	private int defaultPasswordLength = 15;
	private String companySuffix="kiet.edu";
	
	//Constructor to receive first name and last name;
		public Email(String firstName , String lastName) {
			this.firstName=firstName;
			this.lastName=lastName;
			System.out.println("Email Created :" + this.firstName + " " + this.lastName);
			//call a method asking for department and return the department
			
			this.department=setDepartment();
			System.out.println("Department : " + this.department);
			
			//call a method asking for generating password  and return the password
			this.password= randomPassword(defaultPasswordLength);
			System.out.println("Your Password is :" + this.password);
			
			//generating email
			email= firstName.toLowerCase() + "." + lastName.toLowerCase() + "@" + department + "." + companySuffix;
			System.out.println("Your email is : " + email);
		}
	
	public String getPassword() {
			return password;
		}

		public void setPassword(String password) {
			this.password = password;
		}

		public int getMailboxCapacity() {
			return mailboxCapacity;
		}

		public void setMailboxCapacity(int mailboxCapacity) {
			this.mailboxCapacity = mailboxCapacity;
		}

		public String getAlternateEmail() {
			return alternateEmail;
		}

		public void setAlternateEmail(String alternateEmail) {
			this.alternateEmail = alternateEmail;
		}

		//Ask for the department
		private String setDepartment() {
			System.out.println("Enter the department\n1 for sales\n2 for development\n3 for accounting\n0 for none");
			Scanner in = new Scanner(System.in);
			int deptChoice=in.nextInt();
			if (deptChoice==1) {
				return "sales";
			}if(deptChoice ==2) {
				return "development";
			}if (deptChoice ==3) {
				return "Acounting";
			}else {return "";}
			}
			
	
	//Generate a random password
		private String randomPassword(int length) {
			String passwordSet="ABCDEFGHIJKLMNOPQRSTUVWXYZ12345780!@$%";
			char[] password= new char[length];
			for (int i=0 ; i <length; i++) {
				int rand =(int) (Math.random() * passwordSet.length());
				password[i]=passwordSet.charAt(rand);
			}
			return new String(password);
		}
		
	public String showInfo() {
		return "DISPLAY NAME :" + firstName + " " + lastName + " COMPANY EMAIL :"
				+ email + " MAILBOXCAPACITY :" + mailboxCapacity + "mb" + "ALTERNATE EMAIL :" + alternateEmail ;
	}


}
