package demoPrograms;

public class DuplicateInString {

	public static void main(String[] args) {
		String name = "Anuush";
		int l = name.length();

		for(int i=0; i<l-1 ;i++) {
			
			for(int j=i+1; j<l; j++ ) {
			if(name.charAt(i) == name.charAt(j)){
				System.out.println(name.charAt(i)+" is duplicate at index "+j);
			}
		}}
		
		
		
		String name2 ="nnush";
		int c = name2.length();
		for (int i=0;i<c-1;i++) {
			for(int j=1;j<c;j++) {     //why j=1 is wrong and j=i+1 is right    
				if(name2.charAt(i)==name2.charAt(j)) {
					System.out.println(name2.charAt(i)+" is repeated at "+j);
				}
			}
		}
	}

}
