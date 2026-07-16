package office;

public class VijayString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  String name = "My nam is Vijay";
		
		char[] name2  = name.toCharArray();
		char temp;
		int l = name2.length;
		
		for(int i=0;i<l/2-1;i++) {
			temp = name2[i];
			name2[i] = name2[l-1-i];
			name2[l-1-i] = temp;
		}
		System.out.println(name2);
		
		
		
	}

}
