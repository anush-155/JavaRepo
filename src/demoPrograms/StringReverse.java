
package demoPrograms;

public class StringReverse {

	public static void main(String[] args) {
	String name = "Anush Panday";
	char[] reverse = new char[name.length()];
	for(int i=0; i<name.length(); i++) {
	reverse[i] = name.charAt(name.length()-i-1);
	}
	
System.out.println(reverse);   // char[] doesnt require Arrays.toString
	}

}
