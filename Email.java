package email;

import java.util.Scanner;

public class Email{
	private String firstName;
	private String lastName;
	private String password;
	private String department;
	private int mailboxCapacity=500;
	private String alternateEmail;
	private int defaultPasswordLength=8;
	private String email;
	private String companySuffix= "mycompany.com";

//Constructor to receice the first name and last name
	public Email(String firstName,String lastName) {
		this.firstName=firstName;
		this.lastName=lastName;
		this.password=password;
		System.out.println("EMAIL CREATED: "+this.firstName+" "+ this.lastName);
		
		this.department=setDepartment();
		System.out.println("Department: " + this.department);
		
		this.password= randomPassword(defaultPasswordLength);
		System.out.println("Your password is: "+ this.password);
		
		email=firstName.toLowerCase() + "."+ lastName.toLowerCase()+ "@" +department+ "."+ companySuffix;
		System.out.println("Your email is:" +email);
	}

// Ask for the department
private String setDepartment() {
	System.out.print("Enter the department CODE\n1 for Sales\n2 for Development\n3 for Accounting\n0 for none\nEnter department code:");
	Scanner in=new Scanner(System.in);
	int depChoice=in.nextInt();
	if (depChoice==1) { return "sales";} 
	if (depChoice==2) { return "dev";} 
	if (depChoice==3) { return "acct";} 
	else {return "";}
	
}

// Generate a random password
private String randomPassword(int length) {
	String passwordSet= "AABCDEFG01234";
	char[]password= new char[length];
	for(int i=0;i<length;i++) {
		int rand=(int)(Math.random() * passwordSet.length());
		password[i]= passwordSet.charAt(rand);
	}
	
	return new String (password);
}

// Set the mailbox capacity
	public void setAlternateEmail(String altEmail) {
		this.alternateEmail=altEmail;
	}
//Change the password
	public void changePassword(String password) {
		this.password=password;
	}
	
	public int getMailboxCapacity(){return mailboxCapacity;}
	public String getAlternateEmail() {return alternateEmail;}
	public String getPassword() { return password;}
	
	public String showInfo() {
		return "DISPLAY NAME: " +firstName+" "+lastName+ "\nCOMPANY EMAIL: "+ email+"\nMAILBOX CAPACITY "+ mailboxCapacity +"mb"+"\nAlternative Email: "+alternateEmail;
	}
}

