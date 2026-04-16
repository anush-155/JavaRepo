package office;

import java.util.Arrays;

public class ArraySort {
public static void main(String[] args) {
//	simple();
	System.out.println();
//	optimized();
	System.out.println();
	reverseArrayUsingTemp();
	System.out.println();
	reverseArrayUsingArray();
	System.out.println();
	reverseArrayUsingAddition();
	System.out.println();
	reverseStringUsingArray();
	System.out.println();
	reverseStringconvertingToArray();
	System.out.println();
	stringBuilder();
}
	static void simple() {
	int[] a = {1,4,7,1,1,7,4,8,4,4,2,3,6,10};
	int temp, l = a.length;
	for(int j=0; j<l; j++) {
		for(int i=0;i<l-1;i++) {
			if(a[i]>a[i+1]) {
				temp = a[i];
				a[i] = a[i+1];
				a[i+1] = temp;
			}
		}
	}
	for(int s:a) {
		System.out.print( s+" ");
	}}
	// Most optimized 
	static void optimized() {
		int[] b = {1,4,7,1,1,7,4,8,4,4,2,3,6,10};
		int temp, l = b.length;
		for(int j=0;j<l-1;j++) {    //j<l-1 : to swap n nos, swapping n-1 times
			for(int i=0;i<l-1-j;i++) {  // biggest no reaches last index so reduce it every time 
				if(b[i]>b[i+1]) {
					temp = b[i];
					b[i] = b[i+1];
					b[i+1] = temp;
				}
			}
		}
		for(int s:b) {
			System.out.print( s+" ");
	}}
	static void reverseArrayUsingTemp() { 
		int[] a = {1,2,3,4};
		int temp, l = a.length;
		for(int i=0;i<l/2;i++) { //when using temp, use l/2
			temp = a[i];         // temp is best save time, less space, safe, readable
			a[i] = a[l-i-1];
			a[l-i-1] = temp;
		}
		for(int s:a) {
			System.out.print(s);
		}
		
	}
	static void reverseArrayUsingArray() { 
		int[] a = {1,2,3,4};
	int	l = a.length;	int[] reverse = new int[l];
		for(int i=0;i<l;i++) { 
			reverse[i] = a[l-i-1];
		}
		for(int s:reverse) {
			System.out.print(s);
		}
		
	}
	static void reverseArrayUsingAddition() { 
		int[] a = {1,2,3,4,5,6,7,8};
	int	l = a.length;	
		for(int i=0;i<l/2;i++) { // use l/2 here also
		 a[i] = a[i] + a[l-i-1];
		 a[l-i-1] = a[i] - a[l-i-1];
		 a[i] = a[i] - a[l-i-1];
		}
		for(int s:a) {
			System.out.print(s);
		}
		
	}
	static void reverseStringUsingArray() {
		String name = "Anush";
		int l = name.length();
		char[] reverse = new char[l];
		for(int i=0;i<l;i++) {
			reverse[i] = name.charAt(l-i-1);
		}
		System.out.println(reverse);
	}
	static void reverseStringconvertingToArray() {
		String name = "Anush";
		char[] a = name.toCharArray();
	char temp;	int l = name.length();
		for(int i=0;i<l/2; i++) {
			temp = a[i];
			a[i] = a[l-i-1];
			a[l-i-1] = temp;
		}
		System.out.println(a);
	}
	static void stringBuilder() {
		String name = "Anush";
	     new StringBuilder(name).reverse();
	System.out.println(name);
	}
}

	
	

