package demoPrograms;

import java.util.Arrays;



public class Restart {

	static void reverse() {
		int[] a = { 1, 2, 3, 4, 5 };
		int l = a.length;
		int[] temp = new int[l];
		for (int i = 0; i < l; i++) {
			temp[i] = a[l - i - 1];

		}
		
		System.out.println(Arrays.toString(temp));

	}

	public static void main(String[] args) {
		reverse();
	
		
	}

}
