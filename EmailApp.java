package email;

public class EmailApp{
	
	public static void main(String[] args) {
		Email em1=new Email("Konstantinos","Grigos");
		em1.setAlternateEmail("k###@gmail.com");
		em1.getAlternateEmail();
		System.out.println(em1.showInfo());
	}
	
}