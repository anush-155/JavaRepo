package demoPrograms;
import java.util.Arrays;
public class Restart {

	public static void main(String[] args) {
		int[] numbers = { 0, 30, 50, 100, 4000 };
		Restart obj = new Restart();
//		System.out.println("Biggest number "+obj.biggest(numbers));
//		System.out.println("Smallest number "+obj.smallest(numbers));
//		System.out.println("Biggest between numbers "+obj.biggestNo(10, 150, 20));
//		System.out.println("Digit count is "+obj.digitCount(1500));
     	obj.sortAscending();
//		obj.sortDescending();

	}

	int biggest(int[] numbers) {
		int big = numbers[0];
		for (int i = 1; i < numbers.length; i++) {
			if (numbers[i] > big) {
				big = numbers[i];
			}
		}

		return big;
	}

	int smallest(int[] numbers) {
		int small = numbers[0];
		for (int i = 1; i < numbers.length; i++) {
			if (numbers[i] < small) {
				small = numbers[i];

			}
		}

		return small;
	}

	int biggestNo(int a, int b, int c) {

		int biggest = Math.max(Math.max(a, b), c);

		return biggest;
	}

	int digitCount(int no) {
		int count = 0;
		while (no > 0) {
			no = no / 10;
			count++;
		}

		return count;
	}
  void sortAscending(){
	  int[] a = {1,2,3,3,5,4,5,6,1};
	  int temp, l=a.length;
	  for(int j=0;j<l;j++) {
		  for(int i=0;i<l-1;i++) {
			  if(a[i]>a[i+1]) {
				  temp = a[i];
				  a[i] = a[i+1];
				  a[i+1]=temp;
			  }
		  }
	  }
	    
	    for(int i:a) {
	    	System.out.print(i);
	    }
	    System.out.println(" Ascending end");
	    
	    for(int k=0; k<l-1;k++) {
	    	int count=0;
	    	if(a[k]==a[k+1]) {
	    		
	    		count++;
	    		System.out.println(a[k+1]+" is repeated "+count+" times");
	    	}
	    }
	    
		  }
  
  void sortDescending() {
	  int[] a = {2,3,4,5,6,4,32};
	  int temp, l = a.length;
	  for(int j=0;j<l;j++) {
		  for(int i=0;i<l-1;i++) {
			  if(a[i]<a[i+1]) {
				  temp = a[i+1];
				  a[i+1] = a[i];
				  a[i] = temp;
			  }
		  }
	  }
	  for(int q:a) {
		  System.out.print(q+" ");
	  }
		System.out.println(Arrays.toString(a));
	  
	  }
  }
	  
   

