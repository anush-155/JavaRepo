package demoPrograms;

public class VowelsAgain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 String name = "My name is Anush";
 int l = name.length(), vowel =0, cons = 0;
 
 for(int i=0; i<l; i++) {
	 if("aeiouAEIOU".indexOf(name.charAt(i)) != -1) {
		 vowel ++;
	 }
	 else {
		 cons ++;
	 }
 }
   System.out.println(vowel+", "+cons);
	}

}
