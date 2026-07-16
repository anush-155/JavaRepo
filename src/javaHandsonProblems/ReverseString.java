package javaHandsonProblems;

import javax.swing.plaf.synth.SynthOptionPaneUI;

public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String name = "My name is Anush";
char[] temp = name.toCharArray();
char a;
     int l = temp.length;
     for(int i=0;i<l/2;i++) {
    	 a = temp[i];
    	 temp[i] = temp[l-i-1];
    	 temp[l-i-1] = a;
     }
    System.out.println(temp);
	}

}
