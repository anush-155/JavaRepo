package demoPrograms;

public class VowelAgain {

	public static void main(String[] args) {
	String name = "My name is Anush";
	String vowels = "AEIOUaeiou";
	int l = name.length();
	int v= 0, cons =0, space = 0;
    String s = " ";
    for(int i=0; i<l; i++) {
    	if(vowels.indexOf(name.charAt(i)) != -1) {
    		v++;
    	System.out.println(i);
    	}
    	else if (s.indexOf(name.charAt(i)) != -1) {
    		space ++;
    	}
    	else {
    		cons++;
    	}
    }
    System.out.println(v+", "+space+", "+cons);
	}

}
