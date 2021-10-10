package by.epam.module2.array2;

//Построить магический квадрат порядка n

import java.util.Scanner;

public class Task16 {

	public static void main(String[] args) {
		int size = getFromConsole("Enter n: ");
		boolean wrongInput;

		do {
			wrongInput = size < 2;
			if (wrongInput) {
				System.out.println("Index 'n' should be > 2");
			}
		} while (wrongInput);

		int[][] magicSquare = getMagicSquare(size);

		System.out.println();
		System.out.println("Magic square: ");
		System.out.println();
		printSquare(magicSquare);

	}

	public static void printSquare(int[][] sq) {
		for (int i = 0; i < sq.length; i++) {
			for (int j = 0; j < sq[i].length; j++) {
				System.out.print(sq[i][j] + "\t");
			}
			System.out.println();
		}
	}

	public static int getFromConsole(String s) {

		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		int n;

		System.out.print(s);
		while (!scan.hasNextInt()) {
			scan.next();
			System.out.print("Wrong entry!");
		}
		n = scan.nextInt();
		return n;

	}

	public static int[][] getMagicSquare(int n) {
		int[] array = new int[n * n];
		int[][] square = new int[n][n];

		for (int i = 0; i < array.length; i++) {
			array[i] = i + 1;
		}
		while (!isMagic(square)) {
			swapElements(array);
			makeSquare(array, square);
		}
		return square;
	}

	public static boolean isMagic(int[][] sq) {

		final int SUM;
		int n = sq.length;
		SUM = (n * (n * n + 1)) / 2;

		for (int i = 0; i < n; i++) {
			if (totalSum(sq[i]) != SUM) {
				return false;
			}
		}
		for (int i = 0; i < n; i++) {
			int columnSum = 0;
			for (int j = 0; j < n; j++) {
				columnSum += sq[j][i];
			}
			if (columnSum != SUM) {
				return false;
			}

		}
		int mainDiagonalSum = 0;
		for (int i = 0; i < n; i++) {
			mainDiagonalSum += sq[i][i];
		}
		if (mainDiagonalSum != SUM) {
			return false;
		}

		int sideDiagonalSum = 0;
		for (int i = 0; i < n; i++) {
			sideDiagonalSum += sq[i][n - 1 - i];
		}
		if (sideDiagonalSum != SUM) {
			return false;
		}
		return true;
	}

	public static void swapElements(int[] array) {
		int first;
		int second;

		first = (int) (Math.random() * array.length);
		second = (int) (Math.random() * array.length);

		int temp = array[first];
		array[first] = array[second];
		array[second] = temp;
	}

	public static void makeSquare(int[] ar, int[][] sq) {
		int count = 0;

		for (int i = 0; i < sq.length; i++) {
			for (int j = 0; j < sq[i].length; j++) {
				sq[i][j] = ar[count];
				count++;
			}
		}
	}

	public static int totalSum(int[] ar) {
		int sum = 0;
		for (int e : ar) {
			sum += e;
		}
		return sum;
	}
}
