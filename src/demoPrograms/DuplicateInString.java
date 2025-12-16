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
		
	}

}
