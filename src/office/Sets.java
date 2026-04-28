package office;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class Sets {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		TreeSet<Integer> set = new TreeSet<>((a,b) -> b-a); // Auto sorting 
		set.add(3);
		set.add(5);
		set.add(4);
		set.add(2);
		set.add(2);
		for(int i : set) {
			// System.out.println(i);
		}
		
		LinkedHashSet<Integer> lhSet = new LinkedHashSet<>(); // Follows insertion order
		lhSet.add(5);
		lhSet.add(3);
		lhSet.add(4);
		lhSet.add(2);
		lhSet.add(2);
		for(int i : lhSet) {
		//	System.out.println(i);
		}
		
		HashSet<Integer> hSet = new HashSet<>(); // only duplicates ignored
		hSet.add(100);
		hSet.add(50);
		hSet.add(3);
		hSet.add(2);
		hSet.add(2);
		for(int i : hSet) {
			System.out.println(i);
		}
		
	}

}
