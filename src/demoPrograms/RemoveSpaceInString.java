package demoPrograms;

public class RemoveSpaceInString {

	public static void main(String[] args) {
      String name = "My name is Anush";
     
      int l = name.length();
    int i=0;
    	  while (name.charAt(i) != ' ') {
    		 System.out.println(name.charAt(i));
    		 i++;
    	  
      }
	}

}
