package by.epam.classprog.student;

/* Создайте класс с именем Student, содержащий поля: фамилия и инициалы, номер группы, успеваемость (массив
   из пяти элементов). Создайте массив из десяти элементов такого типа. Добавьте возможность вывода фамилий и
   номеров групп студентов, имеющих оценки, равные только 9 или 10.

*/

public class Main {

	public static void main(String[] args) {
		
	final int COUNT = 10;
	Student[] students = new Student[COUNT];
	
	students[0] = new Student("Сергеев Иван", 256, new int[] {5, 7, 4, 8, 6});
	students[1] = new Student("Иванов Сергей", 123, new int[] {9, 9, 10, 9, 9});
	students[2] = new Student("Григорьев Дмитрий", 428, new int[] {4, 7, 9, 6, 5});
	students[3] = new Student("Соколов Николай", 531, new int[] {6, 6, 8, 7, 8});
	students[4] = new Student("Николаева Дарья", 248, new int[] {9, 10, 9, 10, 9});
	students[5] = new Student("Архипов Денис", 112, new int[] {4, 3, 5, 3, 4});
	students[6] = new Student("Михайлова Виктория", 342, new int[] { 6, 8, 4, 6, 7});
	students[7] = new Student("Дмитриев Никита", 745, new int[] {3, 5, 4, 3, 3});
	students[8] = new Student("Приходько Вячеслав", 561, new int[] {6, 4, 6, 5, 6});
	students[9] = new Student("Кульбеда Вероника", 411, new int[] {9, 9, 9, 10, 9});
	
	StudentView sView = new StudentView();
	sView.viewStudentsList(students);
	System.out.println();
	sView.viewSuccessfulStudents(students);
	
		
		
	}

}
