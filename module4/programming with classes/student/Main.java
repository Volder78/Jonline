package by.epam.classprog.student;

/* �������� ����� � ������ Student, ���������� ����: ������� � ��������, ����� ������, ������������ (������
   �� ���� ���������). �������� ������ �� ������ ��������� ������ ����. �������� ����������� ������ ������� �
   ������� ����� ���������, ������� ������, ������ ������ 9 ��� 10.

*/

public class Main {

	public static void main(String[] args) {
		
	final int COUNT = 10;
	Student[] students = new Student[COUNT];
	
	students[0] = new Student("������� ����", 256, new int[] {5, 7, 4, 8, 6});
	students[1] = new Student("������ ������", 123, new int[] {9, 9, 10, 9, 9});
	students[2] = new Student("��������� �������", 428, new int[] {4, 7, 9, 6, 5});
	students[3] = new Student("������� �������", 531, new int[] {6, 6, 8, 7, 8});
	students[4] = new Student("��������� �����", 248, new int[] {9, 10, 9, 10, 9});
	students[5] = new Student("������� �����", 112, new int[] {4, 3, 5, 3, 4});
	students[6] = new Student("��������� ��������", 342, new int[] { 6, 8, 4, 6, 7});
	students[7] = new Student("�������� ������", 745, new int[] {3, 5, 4, 3, 3});
	students[8] = new Student("��������� ��������", 561, new int[] {6, 4, 6, 5, 6});
	students[9] = new Student("�������� ��������", 411, new int[] {9, 9, 9, 10, 9});
	
	StudentView sView = new StudentView();
	sView.viewStudentsList(students);
	System.out.println();
	sView.viewSuccessfulStudents(students);
	
		
		
	}

}
