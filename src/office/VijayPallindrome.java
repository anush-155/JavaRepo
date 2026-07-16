package office;

public class VijayPallindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int no = 123221;
		int reverse = 0;
		int remainder;
		int originalNo =no;
		
		while(no>0) {
			remainder = no%10;
			reverse = reverse*10+remainder;
			no = no/10;
		}
		System.out.println(reverse);
		if(originalNo==reverse) {
			System.out.println(originalNo+" is a pallindrome");
		}
		else {
			System.out.println(originalNo+" is not a pallindrome");
		}
		
		
	}

}
