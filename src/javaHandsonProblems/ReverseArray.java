package javaHandsonProblems;

public class ReverseArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int[] a = {1,2,3,4,5};
int temp, l=a.length;
 for(int i=0;i<l/2;i++) {
	 temp = a[i];
	 a[i] = a[l-i-1];
	 a[l-1-i] = temp;
	 
 }
 for(int n:a) {
	 System.out.print(n+" ");
 }

	}

}
