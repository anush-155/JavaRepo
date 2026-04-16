package demoPrograms;

public class Scribble {

	public static void main(String[] args) {
		int no = 123;
		int rem , rev=0;
		while(no>0) {
			rem = no%10;
			rev = rev*10+rem;
			no = no/10;
		}
		System.out.println(rev);
		
		int[] a = {1,2,3,2,9,7,4};
		int temp, l = a.length;
		for(int j=0;j<l;j++) {
			for(int i=0;i<l-1;i++) {
				if(a[i+1]<a[i]) {
					temp=a[i];
					a[i]=a[i+1];
					a[i+1]=temp;
				}
			}
		}
		for(int q:a) {
			System.out.print(q);
		}
	}
	
	
	
	
	    		 }
	    	 
	          
				
			
	

	


