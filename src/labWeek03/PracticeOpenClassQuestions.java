package labWeek03;

public class PracticeOpenClassQuestions {

	public static void main(String[] args) {
		
		int digit = 16784;
		System.out.println(sumOfNumb(digit));
	}
	
	public static int sumOfNumb(int a) {
		int remainder=0;
		int newNumber =0;
		int sum=0; 
		
			while(newNumber==0) {
			remainder = a%10; 
			a/=10; 
			sum+=remainder;
			} return sum;
	}
	
//	public static int sumOfNumbers(int a) {
//	String str = "a";
//	int sum = 0;
//	for (int i = 0; i < str.length(); i++) {
//		sum += str.charAt(i);
//	} return sum;
//}
}
