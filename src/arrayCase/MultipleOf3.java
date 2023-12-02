package arrayCase;

public class MultipleOf3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] multipleOf3 = new int[10]; 
		
		
		for (int i=1; i<=multipleOf3.length; i++) {
			multipleOf3[i-1] = i*3;
			System.out.println("number: " + multipleOf3[i-1] );
		}

	}

}
