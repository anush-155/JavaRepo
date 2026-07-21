package javaHandsonProblems;

public class MoveZeros {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		bubble();
		
	}
	static void bubble() {
		int[] no = { 0,1, 0, 3, 4, 2, 0, 4, 2, -1,0 };
		int l = no.length;
		int temp;
		
		for(int j=0;j<l;j++) {
		for(int i=0;i<l-1-j;i++) {
			if(no[i+1] ==0) {
				temp = no[i];
				no[i] = no[i+1];
				no[i+1] = temp;
			}
		}
		}
	

		for (int a : no) {
			System.out.println(a);
		}}

	

}
