package demoPrograms;

import java.util.ArrayList;

public class ListInterface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 ArrayList<Integer> al = new ArrayList<>();
  
		for(int i=0; i<=10; i++) {
		  al.add(i, i*10);		}
	System.out.println(al);
  System.out.println( al.contains(30));
  System.out.println( al.isEmpty());
  System.out.println( al.indexOf(30));
}
	
	}
