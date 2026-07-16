package javaHandsonProblems;

public class Vowels {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vowels obj = new Vowels();
		obj.orOperator();
		
		
		
	}
	void orOperator() {
String name = "Anush";
char[] name1 = name.toCharArray();
int l = name1.length;
for(int i=0;i<l;i++) {
	if(name1[i]=='A' | name1[i]=='E' | name1[i]=='I' | name1[i]=='O' | name1[i]=='U' | name1[i]=='a' | name1[i]=='e' | name1[i]=='i' | name1[i]=='o' | name1[i]=='u' ) {
		System.out.println(name1[i]+" is a vowel at "+(i+1));
	}
}
	}

}
