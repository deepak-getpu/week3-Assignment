package methodCase;

public class MethodReturnType1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


public static void main(String[] arg) {

//Variable Declarations — visible in Main ONLY!

int firstNumber = 3;

int secondNumber = 7;

//Call to first Method — passing variables into this Method as Parameters!

sumTwoNumsPrintResult(firstNumber,secondNumber)

//Additional Variable Declarations — visible in Main ONLY!

int result = 0;

//Call to second Method

result = sumTwoNumsReturnResult(firstNumber,secondNumber);

System.out.println(“The sum is: “ + result);

}  // End of main()

}
