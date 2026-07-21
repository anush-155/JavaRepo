package javaHandsonProblems;

public class Vowels {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	String name = "My name is Anush";
	String vowel = "AEIOUaeiou";
	int count =0;
	
	for(int i=0;i<name.length();i++) {
		if(vowel.indexOf(name.charAt(i)) != -1) {
			count++;
		}
	}
	System.out.println(count);
}}
