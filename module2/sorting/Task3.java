package by.epam.module2.sorting;

/*
	Дана последовательность чисел a1<=a2<=...<=an. Переставить элементы, чтобы они были расположены по убыванию
	Для этого в массиве, начиная с первого выбирается наибольший элемент и ставится на первое место, 
	а первый - на место наибольшегоЗатем, начиная со второго,
	эта процедура повторяется. Написать алгоритм сортировки выбором
*/
public class Task3 {

	public static void sorting(int[] a) {
		for (int i = 0; i < a.length; i++) {
			int pos = i;
			int max = a[i];
			for (int j = i + 1; j < a.length; j++) {
				if (a[j] > max) {
					pos = j;
					max = a[j];
				}
			}
			// max = a[pos];
			a[pos] = a[i];
			a[i] = max;
		}
	}

	public static void print(int[] a) {
		for (int i : a) {
			System.out.print(i + " ");
		}
		System.out.println();
	}

	public static void main(String[] args) {
		int[] a = { 2, 3, 7, 8, 12, 15, 19, 23, 46, 79, 91 };

		sorting(a);

		print(a);

	}

}
