package methodCase;

public class MethodOtherSources {

	public static void main(String[] args) {
		System.out.println("Program Start here.\n");
		printFirstName();
		printLastName();
		addNames();
		System.out.println("\n The end of the program.");
	

	}

	public static void printFirstName () {
		System.out.println("My first Name is Jason.");
	}
	
	public static void printLastName () {
		System.out.println("My last name is Gibson.");
	}
	
	public static void addNames () {
		int jason =5;
		int gibson =6;
		int sum =jason + gibson;
		System.out.println("The numbers of letters in my full name is " + sum +".");
		
	}
}
