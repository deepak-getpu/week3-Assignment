package methodCase;

public class MoreMethods1 {

	public static void main(String[] args) {
	
		double[] grades = new double [5];
		grades [0] =64.5; 
		grades [1] =64.6; 
		grades [2] =64.3; 
		grades [3] =64.1; 
		grades [4] =64.2; 
		
		System.out.println(calculateAverage(grades));
	}

	public static double calculateAverage (double[] numbers) {
		double sum = 0;
		for (double number : numbers) {
		sum += number;
		}
	return sum/numbers.length;
	}
}

// ?