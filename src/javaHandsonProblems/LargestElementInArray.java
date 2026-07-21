package javaHandsonProblems;

public class LargestElementInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int[] a = {1122,33,555,70,-14, 999999};
int l = a.length;
int biggest = a[0];
int smallest = a[0];
int secondBiggest = a[0];
for(int i=1;i<l;i++) {
	if(a[i]>biggest) {
		biggest = a[i];
	
	}}
for(int i=1;i<l;i++) {
	if(a[i]>secondBiggest && a[i]<biggest) {
		secondBiggest = a[i];
	}

}
for(int i=1;i<l;i++) {
	if(a[i]<smallest) {
		smallest = a[i];
	}
}
System.out.println(biggest);
System.out.println(smallest);
System.out.println(secondBiggest);


	}

}
