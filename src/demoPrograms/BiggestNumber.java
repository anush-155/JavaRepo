package demoPrograms;

public class BiggestNumber {

	public static void main(String[] args) {
int a =10, b = 200, c=30;
if(a>b &&a>c) {
	System.out.println(a);
}
else if(b>a &&b>c) {   //S
	System.out.println(b);
}	
else {
	System.out.println(c);
}

int max =Math.max(a, Math.max(a, b));
		System.out.println(max);
		
	}

}
