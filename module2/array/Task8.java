package by.epam.module2.array;

//Дана последовательность целых чисел a1, a2,..,an. Образовать новую последовательность, 
//выбросив из исходной те, которые равны min(a1, a2, ...,an)

public class Task8 {

	public static void main(String[] args) {
		
		int a[] = { 1, 2, 3, 4, 1, 5, 6, 7, 1, 8, 9, };
		int min = a[0];
		int count = 0;
		
		System.out.println("Initial array ");
		
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
		}
		for (int i = 0; i < a.length; i++) {
			if (a[i] <= min) {
				min = a[i];
				count++;
			}
		}
		System.out.print("\n" + min + " is minimum here");
		System.out.print("\n" + min + " is used " + count + " times");
		System.out.println();
		System.out.println("\nArray after the change");
		
		for (int i = 0; i < a.length; i++) {
			if (a[i] != min)
				System.out.print(a[i] + " ");
		}
	}

}
