
//
//Copyright (c) 2023 Promineo Tech
//Author:  Promineo Tech Academic Team
//Subject: Arrays & Methods
//Java Week 03 Lab
//
package labWeek03;

public class LabWeek03 {

	public static void main(String[] args) {
			
		//
		// Arrays:
		//
		
		// 1. Create an array with the following values 1, 5, 2, 8, 13, 6
		
		int[] testScores = new int[6];
		testScores[0] = 1;
		testScores[1] = 5;
		testScores[2] = 2;
		testScores[3] = 8;
		testScores[4] = 13;
		testScores[5] = 6;
			
//		double average = 0; 
//		double sum = 0;
//		for (int i=0; i<testScores.length; i++) {
//			sum += testScores[i];
//			average = (sum)/testScores.length; 
//			
//		} System.out.printf("%.3f", average);
		
//		
//		double average = 0; 
//		double sum = 0;
//		
//		for (int i=0; i<testScores.length; i++) {
//			sum += testScores[i];
//			average = (sum)/testScores.length; 
//			
//		} 
//		System.out.println(Math.round(average));
//		System.out.printf("%.2f", average);
		
		
		
//		for(int i = 0; i<(testScores.length); i++) {
//			System.out.println((i+1) + ") " + testScores[i]);
//		}
//	
//		
//		// 2. Print out the first element in the array
//		
//		System.out.println("First element in the array: " + testScores[1-1]);
//		
//		// 3. Print out the last element in the array without using the number 5
//		
//		System.out.println(testScores[testScores.length-1]);
//		
//		
//		// 4. Print out the element in the array at position 6, what happens?
//
//		/*
//		 *  System.out.println(testScores[6]);
//		 *  Shows the out of bound error and more risk to application crash. 
//		 */ 
//		 
//		
//		// 5. Print out the element in the array at position -1, what happens?
//		
//		// System.out.println(testScores[-1]);
//		// Shows the out of bound error and more risk to application crash.
//		
//			
//		// 6. Write a traditional for loop that prints out each element in the array
//	
//		for(int i=0; i<testScores.length; i++) {
//			System.out.println((i) + ") " + (testScores[i]));
//		}
//			
//		// 7. Write an enhanced for loop that prints out each element in the array
//
//		for(int testScore : testScores) {
//			System.out.println(testScore);
//		}
//		
//		// 8. Create a new variable called sum, write a loop that adds 
//		//			each element in the array to the sum
		
//		int sum = 0; 
//		
//		for (int i=0; i<testScores.length; i++) {
//			 sum += testScores[i];
//			
//		} System.out.println(sum);

			
		// 9. Create a new variable called average and assign the average value of the array to it

//		int average = 0; 
//		int sum = 0;
//		for (int i=0; i<testScores.length; i++) {
//			sum += testScores[i];
//			average = (sum)/testScores.length; 
//		}
//		System.out.println(average);
		
		
		// 10. Write an enhanced for loop that prints out each number in the array 
		//			only if the number is odd
		
//		for (int element : testScores) {
//			if(element%2 !=0) {
//				System.out.println(element);
//			}
//		}

		
		// 11. Create an array that contains the values "Sam", "Sally", "Thomas", and "Robert"

//		String[] friendsName = new String[4];
//		friendsName[0] = "Sam";
//		friendsName[1] = "Sally";
//		friendsName[2] = "Thomas";
//		friendsName[3] = "Robert";
//		
		// OR 
		
	String[] friName = {"Sam", "Sally", "Thomas", "Robert"};
		
		
		// 12. Calculate the sum of all the letters in the new array
		
//		int sumOfLetters = 0; 
//		for(int i=0; i<friendsName.length; i++) {
//			String s = friendsName[i]; 
//			sumOfLetters += s.length();  
//			}
//		System.out.println(sumOfLetters);
//		

//		int sumOfLetters = 0; 
//		for(int i=0; i<friendsName.length; i++) { 
//			sumOfLetters +=((friendsName[i]).length());  
//			}
//		System.out.println(sumOfLetters);
	
//	int sumOfLetters = 0; 
//	for (String name : friName) {
//		sumOfLetters += name.length();
//	} System.out.println(sumOfLetters);

		
		
		
		//
		// Methods:
		//
		
		// 13. Write and test a method that takes a String name and prints out a greeting. 
		//			This method returns nothing.
		
		greet("Sam");
		greet("Belly");
		
		
		// 14. Write and test a method that takes a String name and  
		//			returns a greeting.  Do not print in the method.
		
		
		System.out.println(goodMorning("Tom"));
		
		
		// Compare method 13 and method 14:  
		//		a. Analyze the difference between these two methods.
		
		// In void we can not return value like assigning a variable or printing etc. It just prints when called. 
		
		//		b. What do you find? 
		//		c. How are they different?
		
		
		// 15. Write and test a method that takes a String and an int and 
		//			returns true if the number of letters in the string is greater than the int
		
//		int i = 7;
//		String name = "Deepak";
//		System.out.println(validity("Khina", 7));
		
		// 16. Write and test a method that takes an array of string and a string and 
		//			returns true if the string passed in exists in the array
		
		System.out.println(isStringThereInArray(friName, "Dep"));
		
//		System.out.println(isStringThereInArray(friName, "Sam")); 
		
		// 17. Write and test a method that takes an array of int and 
		//			returns the smallest number in the array
	
		
//		System.out.println(smallestNumberFromArray(testScores));
		
		// 18. Write and test a method that takes an array of double and 
		//			returns the average
		
		double[] test = new double[5];
		test[0] = 5; 
		test[1] = 5; 
		test[2] = 5; 
		test[3] = 5; 
		test[4] = 5; 
		
		double testArray = arrayAverage(test);
		System.out.println(testArray);
		
		// 19. Write and test a method that takes an array of Strings and 
		//			returns an array of int where each element
		//			matches the length of the string at that position
		
		String[] frienName = {"Sam", "Sally", "Sally", "Sally", "Sally", "Thomas", "Robert"};
		int[] nameLengths = ArrayForlengthOfEachStringInArray(frienName);
		for (int length : nameLengths) {
		System.out.println(length);
		}	
		
		// 20. Write and test a method that takes an array of strings and 
		//			returns true if the sum of letters for all strings with an even amount of letters
		//			is greater than the sum of those with an odd amount of letters.
		
		System.out.println(IsSumEvenLetterGreater(frienName));
	
		// 21. Write and test a method that takes a string and 
		//			returns true if the string is a palindrome

//		System.out.println(isPalindrome("madame"));
//		
//	
//		 System.out.println(isDivisibleBy2(5));
		
		
		int a =1;
		int b =3;
		int c =2;
		int d =3;
		int e =5;
		
		System.out.println(createArray (a,b,c,d,e));
		
}
   

	public static int[] createArray(int a, int b, int c, int d, int e) {
	
		int[] given = {a,b,c,d,e};
		
		return given;
	
	
	

//		static boolean isDivisibleBy2(int a){
//				if ( a % 2 == 0) {
//					return true;
//				} else; {
//					return false;
//				}
		}
	
	// Method 13:
	public static void greet(String name) {
		System.out.println("Hello " + name + "!");
	}

	// Method 14:

	public static String goodMorning (String name) {
		return "Hi Good Morning!";
	}
	
	// Method 15:

//	public static boolean validity (String name, int x) {
//		boolean result = name.length()>=x;
//		return result;
//					
//	}
		
	// Method 16:
	
	public static boolean isStringThereInArray (String[] masterList, String name) {
	
		for(String list : masterList) {
			if(list.equals(name)) {
				return true;
			}
		} 
		   return false;
		
	}
	
	
		
		
		
		
//		for(int i =0; i<masterList.length; i++) {
//			
//			if(masterList[i].equals(name) == true) {
//				return true; 
//				}
//			} 
//				return false; 	
//		
//		}	


	

	
	// Method 17:
// Array of int and returns small number; 
	
	public static int smallestNumberFromArray (int[] numbers) {
		int minimum = numbers[0];
		for(int i=0; i<numbers.length; i++) {
			if(numbers[i] < minimum) {
				minimum=numbers[i]; 
			}
		} return minimum; 
	
	} //End of method

	
	// Method 18:

//	takes double[] returns average
	
	public static double arrayAverage (double[] numbers) {
		double sum=0;
		double average=0;
		for(double number : numbers) {
			sum+=number;
			average=sum/numbers.length;
		} return average;
	}
	
	// Method 19:
	// takes string[] returns int[] each element matches the length of string at that position
	
	public static int[] ArrayForlengthOfEachStringInArray (String[] givenArray) {
		int[] newArray = new int[givenArray.length];
		for(int i=0; i<givenArray.length; i++) {
			newArray[i] = givenArray[i].length();

		} return newArray;
	}
	
	// Method 20:
	public static boolean IsSumEvenLetterGreater (String[] str) {
		int evenSum = 0;
		int oddsSum = 0;
		for(int i=0; i<str.length; i++) {
			
			if((str[i].length())%2 == 0) {
				evenSum += str[i].length(); 
			} else {
				oddsSum += str[i].length();
			}
		} 
		
		boolean result = evenSum>oddsSum;
		return result;
		
	}
	
	// Method 21:
	
public static boolean isPalindrome(String word) { 
	for (int  i=0; i<word.length()/2; i++) {
		if(word.charAt(i) != word.charAt(word.length() - 1 - i)) {
			return false;
		}  	
	} return true;
	}
} 