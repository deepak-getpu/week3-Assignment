package arrayCase;

public class ArrayStudentName {

		public static void main(String[] args) {
			
//			String studentName1 = "Tom Smith";
//			String studentName2 = "Jack Taylor";
//			String studentName3 = "Bill Turner";
//			
//			System.out.println(studentName1);
//			System.out.println(studentName2);
//			System.out.println(studentName3);
			
				
		
			String[] students = new String[3];
			
			students[0] = "Tom Smith";
			students[1] = "Jack Taylor";
			students[2] = "Bill Turner";
			
//			System.out.println(students[0]);
//			System.out.println(students[1]);
//			System.out.println(students[2]);
			
			for(int i=0; i<students.length; i++) {
				System.out.println(students[i]);
			}
			
			
	System.out.println("Enhanced for loop");
			for (String student : students) {
				System.out.println(student);
			}

	}

}
