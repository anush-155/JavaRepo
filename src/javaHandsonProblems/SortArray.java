package javaHandsonProblems;

public class SortArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int[] a = {12,1,4,3,5,78,34};
int l = a.length;
int temp = 0;

for(int i=0;i<l-1;i++) {
	for(int j=0;j<l-1-i;j++)
	if(a[j]>a[j+1]) {
		temp = a[j];
		a[j] = a[j+1];
		a[j+1] = temp;
	}
	
}
for(int q:a) {
System.out.println(q);
}
	}

}
