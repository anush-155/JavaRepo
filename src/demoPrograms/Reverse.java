package demoPrograms;

public class Reverse {
int rev = 0, rem;

 


	public static void main(String[] args) {
		Reverse obj = new Reverse();
		System.out.println(obj.ReverseNo(123));
 
	}
	public int ReverseNo(int no) {
		 while(no>0) {
			 rem = no%10;
			 rev = rev*10+rem;
			 no = no/10;
		 }
		 return rev;
	 }

}
