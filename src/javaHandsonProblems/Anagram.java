package javaHandsonProblems;

import java.util.Arrays;

public class Anagram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String word1 = "worth";
		String word2 = "throws";
	char[] word11 = word1.toCharArray();
	char[] word22 = word2.toCharArray();
	
	Arrays.sort(word11);
	Arrays.sort(word22);
	if(Arrays.equals(word11, word22)) {
		System.out.println("Is an Anagram");
		
	}
	else {
		System.out.println("Not an Anagram"); 
		
	}
	
	}}


