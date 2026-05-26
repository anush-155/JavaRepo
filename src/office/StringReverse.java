package office;

public class StringReverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name = "Anuna";
		char[] reverse = name.toCharArray();
		char temp;
		int l = reverse.length;
		for(int i=0;i<l/2;i++) {
			temp = reverse[i];
			reverse[i] = reverse[l-1-i];
			reverse[l-1-i] = temp;
		}
		System.out.println(reverse);
		String rev = new String(reverse);
		
			if(rev.equalsIgnoreCase(name)) { 
				System.out.println("Pallindrome");
				
			}
			else {
				System.out.println("Not a Pallindrome");
			}
			
		
		
		

	}

}
