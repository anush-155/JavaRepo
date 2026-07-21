package javaHandsonProblems;

public class DuplicateInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int[] a = {1,2,4,2,1,4,2};
int l = a.length;

for(int i=0;i<l;i++) {
	for(int j=1+i;j<l;j++) {
		if(a[i]==a[j]) {
			System.out.println(a[i]+" is dulplicated at index "+j);
		}
	}
}

	}

}
