package demoPrograms;
import java.util.Arrays;


public class ReverseAndSwapNos {
	int rev = 0, rem;

	public static void main(String[] args) {
		ReverseAndSwapNos obj = new ReverseAndSwapNos();
		System.out.println(obj.ReverseNo(123453));

System.out.println(Arrays.toString(swap(3,5))); //line 10
	}

	public int ReverseNo(int no) {
		while (no > 0) {
			rem = no % 10;
			rev = rev * 10 + rem;
			no = no / 10;
		}
		return rev;
	}

	public static int[] swap(int a, int b) {
		a = a + b;
		b = a - b;
		a = a - b;
		int[] swap = { a, b };
		return swap;
	}

}
