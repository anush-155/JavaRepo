
package demoPrograms;

public class StringReverse {
public static void main(String[] args) {
	String name = "Anush";
	char[] reverse = new char[name.length()];
	
	for(int i=0; i<name.length(); i++) {
		reverse[i] = name.charAt(name.length()-1-i);
	}
	System.out.println(reverse);
	for(char a : reverse) {
		System.out.print(a);
	}
}
	
	
	
	
}
