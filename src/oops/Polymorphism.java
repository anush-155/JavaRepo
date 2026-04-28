package oops;

public class Polymorphism {
// many forms, done by method overloading and method overriding (compile time p. runtime p)
	public static void main(String[] args) {
		Functions obj = new Functions();
		obj.info("Anush");
		obj.info("Anush", 27);
		obj.info(27);
	}
	
}

class Functions{
	public void info(String name) {
		System.out.println(name);
	}
	public void info(int age) {
		System.out.println(age);
	}
    public void info(String name, int age) {
    	System.out.println("Name "+name+", age "+age);
    }
}
