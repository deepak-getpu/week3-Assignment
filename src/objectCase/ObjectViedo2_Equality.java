package objectCase;

public class ObjectViedo2_Equality {

	public static void main(String[] args) {
		
		int a = 3;
		int b = 3; 
		System.out.println(a == b);
		
		String c = new String ("Hello");
		String d = new String ("Hello");
		System.out.println(c == d);
		
		String g = new String ("Hello");
		String h = g;
		System.out.println("Refering to same string: " +(g == h));
		
		
		
		String e = new String ("Hello");
		String f = new String ("Hello");
		System.out.println("Equality check: " + c.equals(d));
				

	}

}
