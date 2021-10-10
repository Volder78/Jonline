package by.epam.classprog.student;

public class StudentView {
	
	public void viewStudentsList(Student[] students) {
		System.out.println("Students:");
		
		System.out.printf("%8s %16s\n", "ÔÈÎ", "Ãğóïïà");
		System.out.println("--------------------------");
		
		for(Student student : students) {
			System.out.printf("%-20s %-5d", student.getName(), student.getGroupNumber());
			System.out.println("\n--------------------------");
		}
		System.out.println();
	}
	
	public void viewSuccessfulStudents(Student[] students) {
		System.out.println("Successful students:");
		
		System.out.printf("%8s %16s\n", "ÔÈÎ", "Ãğóïïà");
		System.out.println("--------------------------");
		
		StudentLogic sLogic = new StudentLogic();
		final int passGrade = 9;
		
		for(Student student : students) {
			if(sLogic.isSuccessful(student, passGrade)) {
				System.out.printf("%-20s %-5d", student.getName(), student.getGroupNumber());
				System.out.println("\n--------------------------");
			}
			
		}
		
	}

}
