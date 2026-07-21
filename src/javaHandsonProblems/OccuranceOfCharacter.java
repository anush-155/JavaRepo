package javaHandsonProblems;

public class OccuranceOfCharacter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String name = "My name is Anush";
char[] nameArray = name.toLowerCase().toCharArray();
int l = nameArray.length;
 for(int i=0;i<l-1;i++) {
	 for(int j=i;j<l-1;j++) {
		 if(nameArray[i]==nameArray[j+1] && nameArray[i] != ' ') {
			 System.out.println(nameArray[i]+" is repeated at "+(j+1));
		 }
	 }
 }




	}

}
