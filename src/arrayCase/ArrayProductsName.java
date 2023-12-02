package arrayCase;

public class ArrayProductsName {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		String[] products = new String[5];
		
		products[0] = "Carrot"; 
		products[1] = "Raddish"; 
		products[2] = "Cabbage"; 
		products[3] = "Culi flower"; 
		products[4] = "Cereal"; 
		
//		for (String product : products) {
//			System.out.println("product:" + product);
//		}
		
		for (int i=0; i<products.length; i++) {
			System.out.println((i+1) + ". " + (products [i]));
		}

	}

}
