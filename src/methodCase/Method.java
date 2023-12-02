package methodCase;

public class Method {

	public static void main(String[] args) {
	
		String firstName = "Neeru";
		String lastName = "Acharya";
		String fullName = createfullName (firstName, lastName); 
		String fullName1 = createfullName ("Deepak", lastName);
		String fullName2 = createfullName ("Khina", "Gautam");
		
		System.out.println(fullName);
		System.out.println(fullName1);
		System.out.println(fullName2);
	}
	
	public static String createfullName (String x, String y) {
		String fullName = x + " " +  y; 
		return fullName; 
		
//	return x + " " +  y; 
		
	}

}
 