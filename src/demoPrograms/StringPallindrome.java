package demoPrograms;



public class StringPallindrome {

	public static void main(String[] args) {
      String name = "emadame";
		char[] temp = new char[name.length()];
		for(int i=0; i<name.length(); i++) {
			temp[i] = name.charAt(name.length()-i-1);
		}
		System.out.println(temp);
		String reverse = new String(temp);
		if(reverse.equals(name)) {
			System.out.println(name+" is a pallindrome");
		}
		else {
			System.out.println(name+" is not a pallindrome");
		}
		
	}

}
