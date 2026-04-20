package office;

public class Vowels {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   String name = "My name is Anush Panday";
   int l = name.length();
   
   for(int i=0;i<l;i++) {
	   if("aeiouAEIOU".indexOf(name.charAt(i)) != -1) {
		   System.out.println(name.charAt(i)+" is a vowel");
	   }
	   else if(name.charAt(i) == ' ') {
		   System.out.println(name.charAt(i)+" is space");
	   }
	   else {
		   System.out.println(name.charAt(i)+" is a consonant");
	   }
   }
		
		
		
		
		
		
		
		
	}}	