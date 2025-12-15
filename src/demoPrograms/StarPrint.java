package demoPrograms;

public class StarPrint {

	public static void main(String[] args) {
//		descending();
//		ascending();
		random();
		
	}

	public static void descending() {
		for (int j = 0; j < 6; j++) {
			for (int i = 0; i < 6 - j; i++) {
				System.out.print("*");
				System.out.print(" ");
			}
			System.out.println();
		}

	}
	public static void ascending() {  //isko deekhna zara ghar pe 
		for (int i=0; i<6; i++) {
			for(int j=0; j<i+1; j++) {
				System.out.print("*");
				System.out.print(" ");
			}
			System.out.println();
		}
	}
	public static void random() {
		for (int i=0; i<4; i++) {
			if(i%2 == 0) {
				System.out.print(" ");
			}
			else {	for (int j=0; j<4; j++) {
				
				System.out.print("*");
				
			}
			System.out.println();
		}
	}}

}
