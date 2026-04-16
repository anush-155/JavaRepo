package demoPrograms;

public class SortArrayAndDuplicate {
	static int[] a= {1,5,3,5,7,4};
public static void main(String[] args) {
	SortArrayAndDuplicate obj = new SortArrayAndDuplicate();
	obj.sortAscending(a);
	System.out.println();
	obj.sortDescending(a);
}
 
  void sortAscending(int[] a) {
	  int temp, l = a.length;
	  for(int j=0;j<l;j++) {
		  for(int i=0;i<l-1;i++) {
			  if(a[i]>a[i+1]) {
				  temp=a[i];
				a[i] = a[i+1];
				a[i+1] = temp;
			  }}
			  }
			  for(int s:a) {
				  System.out.print(s);
				
				  
			  }
		  }
  void sortDescending(int[] a) {
	  int temp, l= a.length;
	  for(int j=0;j<l;j++) {
		  for(int i=0;i<l-1;i++) {
			  if(a[i]<a[i+1]) {
				  temp=a[i];
				  a[i] = a[i+1];
				  a[i+1] = temp;
			
			  }
		  }
	  }
	  for(int s:a) {
		  System.out.print(s);
	  }
		 System.out.println(duplicate(a, l));

  }
	boolean duplicate(int[] a, int l) {
		boolean b = false;
		for(int j=0;j<l;j++) {
			 for(int i=0;i<l-1;i++) {
				 if(a[i]==a[i+1]) {
					b = true;
				 }
				 
			 }
		}
		
		
		return b;
	}
  }



