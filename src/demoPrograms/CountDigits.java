package demoPrograms;

public class CountDigits {

	public static void main(String[] args) {
       System.out.println(countNumbersOfDigits(12345));
	}
	public static int countNumbersOfDigits(int no) {
		int count =0;
		
		while(no>0) {
			no = no/10;
			count++;
		}
		
		
		
		
		return count;
	}

}
