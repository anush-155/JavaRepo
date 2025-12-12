package demoPrograms;

import java.util.Arrays;

public class ReverseArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ReverseArray obj = new ReverseArray();
		obj.UsingNumber();
		UsingTempArray();
		Usingij();
		WithoutAnything();
	}

	public void UsingNumber() {
		int[] array = { 1, 2, 3, 4 };
		int temp, l = array.length;
		for (int i = 0; i < l / 2; i++) {
			temp = array[i];
			array[i] = array[l - i - 1];
			array[l - i - 1] = temp;
		}
		System.out.println(Arrays.toString(array));

	}

	public static void Usingij() {
		int[] array = { 1, 2, 3, 4, 5, 6 };
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

	public static void UsingTempArray() {
		int[] array = { 6, 7, 8, 9 };
		int l = array.length;
		int[] temp = new int[l];
		for (int i = 0; i < l; i++) {
			temp[i] = array[l - 1 - i];

		}
		array = temp;
		System.out.println(Arrays.toString(array));
	}
	public static void WithoutAnything() {
		int[] array = {11,12,13,14,15,16};
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

}
