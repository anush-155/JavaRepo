package demoPrograms;

import java.util.HashMap;



public class RemoveSpaceInString {

	public static void main(String[] args) {
      String name = "My name is Anush";
     
 //     int l = name.length();
    int i=0;
    	  while (name.charAt(i) != ' ') {
    		 System.out.println(name.charAt(i));
    		 i++;
    	  
      }
    	HashMap<Integer, String> hm = new HashMap<>();  
          hm.put(0, "Apple");
          hm.put(1, "AApple");
          hm.put(2, "AAApple");
          
          System.out.println(hm.hashCode());
	}

}
