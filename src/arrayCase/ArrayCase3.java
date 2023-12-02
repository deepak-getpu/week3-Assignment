package arrayCase;

public class ArrayCase3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
//		int[] gradesArray = new int[5]; 
//		int[] gradesArray;
//		gradesArray = new int[5];
//		int[] gradesArray = {100, 79, 80, 90, 100};
		
	//Simple for loop
		
//		String fullName = "Mary" + " " + "Brown"; 
//		int[] gradesArray = {100, 79, 80, 90, 100};
//
//		System.out.println("Student: " + fullName);
//		System.out.println("Grades: ");
//		for (int i = 0; i < 5; i++) {
//		System.out.println((i+1) + ": " + gradesArray[i]);
//		}
		

	//Enhanced for loop
		
		String fullName = "Mary" + " " + "Brown"; 
		int[] gradesArray = {100, 79, 80, 90, 100};
		int counter = 1;

		System.out.println("Student: " + fullName);
		System.out.println("Grades: ");
		for (int grade : gradesArray) {
		System.out.println((counter++) + ": " + grade);
		}
		
		

	}

}
