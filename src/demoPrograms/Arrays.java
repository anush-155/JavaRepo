package demoPrograms;

public class Arrays {

	public static void main(String[] args) {
        int a,b;
		int[][] array = new int[2][2];
		array[0][0] = 42;
		array[0][1] = 2;
		array[1][0] = 173;
		array[1][1] = 42;
        int biggest = array[0][0];
		for(int i=0;i<2;i++) {
	       		for(int j =0;j<2;j++) {
	       			if(array[i][j]>biggest) {
	       				biggest = array[i][j];
	       				a=i;
	       				b=j;
	       			}
	       		}
		}
		
		System.out.println(biggest);
		
		
	}

}
