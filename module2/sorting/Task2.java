package by.epam.module2.sorting;

//Даны 2 последовательности а1<=a2<=...an и b1<=b2<=...bm. Образовать новую неубывающую последовательность

public class Task2 {
	
	public static int[] combination (int[] a1, int[] a2) {
		int index1 = 0;
		int index2 = 0;
		int[] combinedArray = new int[a1.length + a2.length];
		if(a1[0] > a2[0]) {
			combinedArray[0] = a2[0];
			index2 ++;
		}
		else {
			combinedArray[0] = a1[0];
			index1 ++;
		}
		boolean isWrongIndex;
		int i = 1;
		while(i < combinedArray.length) {
			isWrongIndex = index1 < a1.length && index2 < a2.length;
			if(isWrongIndex) {
				if(a1[index1] < a2[index2]) {
					combinedArray[i] = a1[index1];
					index1 ++;
				}
				else {
					combinedArray[i] = a2[index2];
					index2 ++;
				}
			}
			else {
				break;
			}
			i ++;
		}
		while(index1 < a1.length) {
			combinedArray[i] = a1[index1];
			index1 ++;
			i ++;
		}
		while(index2 < a2.length) {
			combinedArray[i] = a2[index2];
			index2 ++;
			i ++;
		}
		return combinedArray;
		
	}
	
	public static void printArray(int[] a) {
		for(int i :a) {
			System.out.print(i + " ");
		}
		System.out.println();
	}

	public static void main(String[] args) {
		
		int[] a1 = {1, 3, 5 ,7, 9, 11, 13};
		int[] a2 = {2, 4, 6, 8, 10, 12, 14, 16,};
		printArray(combination(a1, a2));
	
	}

}
