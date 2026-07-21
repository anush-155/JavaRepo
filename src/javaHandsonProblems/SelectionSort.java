package javaHandsonProblems;

public class SelectionSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int[] a = {1,4,3,5,7};
int l = a.length;
for(int i = 0;i<l;i++) {
	int smallestIndex = i;
	
	for(int j=1+i;j<l;j++) {
	if(a[j]<a[smallestIndex]) {
		smallestIndex = j;
	}}
	int temp = a[i];
	a[i] = a[smallestIndex];
	a[smallestIndex]  =temp;
	
		
	}

for(int q:a) {
	System.out.println(q);
}
		
		
		
	}

}
