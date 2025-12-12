package demoPrograms;

import java.util.Arrays;

public class ReverseArray {

	public static void main(String[] args) {
		 int[] array = {1,2,3,4,5};
		
		UsingNumber(array);
		Usingij(array);
    	WithoutAnything(array);
    	UsingTempArray(array);
    	
	}

	public static void UsingNumber(int[] array) {
		int temp, l = array.length;
		for (int i = 0; i < l / 2; i++) {
			temp = array[i];
			array[i] = array[l - i - 1];
			array[l - i - 1] = temp;
		}
		System.out.println(Arrays.toString(array));

	}

	public static void Usingij(int[] array) {
		
		int i = 0, j = array.length - 1, temp;
		while (i < j) {
			temp = array[i];
			array[i] = array[j];
			array[j] = temp;
			i++;
			j--;
		}
		System.out.println(Arrays.toString(array));

	}

	public static void WithoutAnything(int[] array) {
		int i = 0, j = array.length-1;
		while(i<j) {
			array[i]  = array[i] + array[j];
			array[j]  = array[i] - array[j];
			array[i]  = array[i] - array[j];
i++;
j--;

		}
		System.out.println(Arrays.toString(array));
		
	}

	public static void UsingTempArray(int[] array) {
		int l = array.length;
		int[] temp = new int[l];
		for (int i = 0; i < l; i++) {
			temp[i] = array[l - 1 - i];

		}
		array = temp; // only change local copy of array, does not change the original array
		System.out.println(Arrays.toString(array));
	}

}
