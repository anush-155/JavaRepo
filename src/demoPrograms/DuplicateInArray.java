package demoPrograms;

public class DuplicateInArray {

	public static void main(String[] args) {
int[] no = {1,2,3,4,3,7,1};
int l = no.length;

  for(int i=0; i<l-1; i++) {
	  for(int j=i+1; j<l; j++) {
	  if(no[i]==no[j]) {
		  System.out.println(no[i]+" is Duplicate at index "+j);
	  }
	  
  }}
		
		
	}

}
