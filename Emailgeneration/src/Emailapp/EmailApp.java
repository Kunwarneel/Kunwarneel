package Emailapp;

public class EmailApp {

	public static void main(String[] args) {
		Email em1= new Email("Neelendra", "Singh");
		em1.setMailboxCapacity(500);
		em1.setAlternateEmail("neelendra.jadaun46@gmail.com");
		System.out.println(em1.showInfo());
	}

}
