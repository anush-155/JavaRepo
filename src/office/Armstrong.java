package office;

public class Armstrong {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  int count=0, no = 153, originalNo= no, tempNo = no, digit;
		int sum=0;
		while(no>0) {
			no = no/10;
			count ++;
		}
		System.out.println(count);
		
		while(tempNo>0) {
			digit = tempNo%10;
			sum = sum +(int)Math.pow(digit, count);
			tempNo = tempNo/10;
		}
		if(sum == originalNo) {
			System.out.println("Armstrong");
		}
		else {
			System.out.println("No");
		}
	}

}
