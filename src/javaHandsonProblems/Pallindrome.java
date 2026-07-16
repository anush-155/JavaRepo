package javaHandsonProblems;

public class Pallindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 final  int no = 123323;
   int temp = no;
   int reverse = 0;
   int quotient;
  
   
   while(temp>0) {
	   quotient = temp%10;
	   reverse = reverse*10+quotient;
	   temp = temp/10;
   }
   System.out.println(reverse);
   if(no==reverse) {
	   System.out.println(no+" is a Pallindrome");
   }
   else {
	   System.out.println(no+" is not a Pallindrome");
   }
	}

}
