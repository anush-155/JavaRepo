package demoPrograms;

public class VowelsInAString {

	public static void main(String[] args) {
      String name = "My name is Anush";
      int vowel=0, consonent=0;
		for(int i=0; i<name.length(); i++) {
			if(name.charAt(i)=='a' | name.charAt(i)=='e' | name.charAt(i)=='i' | name.charAt(i)=='o' |name.charAt(i)=='u') {
				System.out.println(name.charAt(i));
				vowel ++;
			}
			else {
				consonent ++;
			}
		}
		System.out.println(vowel+" "+consonent);
		 //OR
	int	v =0, c=0;
	for(int j=0; j<name.length(); j++) {
		if("aeiouAEIOU".indexOf(name.charAt(j)) != -1) {
			v++;
		}
		else {
			c++;
		}
	}
	System.out.println("Vowels "+v+", Consonents "+c);
	}

}
