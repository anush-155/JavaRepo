package demoPrograms;



public class BiggestInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array = { 1, 45, 22, 775, 22, 34, 50 };

		
		BiggestInArray obj = new BiggestInArray();
		obj.biggest(array);
	}

	public void biggest(int[] array) {
		int biggest = array[0];
		int secBiggest = array[0];

		for (int i = 1; i < array.length; i++) {
			if (array[i] > biggest) {
				biggest = array[i];

			}

		}

		for (int i = 1; i < array.length; i++) {
			if (biggest != array[i] && array[i] > secBiggest) {
				secBiggest = array[i];
			}
		}

		System.out.println(biggest);
		System.out.println(secBiggest);

	}
	public void UsingStreams(int[] array) {
	
	}

}
