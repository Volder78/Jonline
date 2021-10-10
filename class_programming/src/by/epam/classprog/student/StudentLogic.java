package by.epam.classprog.student;

public class StudentLogic {

	public boolean isSuccessful(Student student, int minGrade) {

		for (int grade : student.getSuccess()) {
			if (grade < minGrade) {
				return false;
			}
		}
		return true;
	}

}
