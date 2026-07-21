package javaHandsonProblems;

public class CountWords {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String name = "a a My name is Anush";
int l =name.length();
int count = 1;
for(int i=1;i<l-1;i++) {
	if(name.charAt(i)==' ') {
		count ++;
	}
}
System.out.println(count);

	}

}
