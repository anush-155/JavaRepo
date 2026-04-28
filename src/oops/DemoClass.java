package oops;

public class DemoClass {
 public static void main(String[] args) {
	 Demo obj = new Demo();
     obj.view();
}

}


class Demo {
	int no = 10;
	String name ="Anush";
	
	public void view() {
		System.out.println(no+" "+name);
	}
}
