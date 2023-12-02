package methodCase;

public class MethodOtherSource1 {

	public static void main(String[] args) {
		int num = 11;
	//	int ans = multiplyNumbers(num);
		System.out.println(multiplyNumbers(num));
		
		int r = 4; 
		int s = 4;
		
		System.out.println(isEqual (r,s));
		
	}

	public static int multiplyNumbers(int a) {
	//	int ans= a * 7;
		return a * 7;
	}
	
	public static boolean isEqual (int r, int s) {
		if(r==s) return true;
		
		else return false;
		
	}
}
