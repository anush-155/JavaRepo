package oops;

public class Abstraction {
public static void main(String[] args) {
	Horse obj = new Horse();  // here object is created for horse and hen class
	obj.walk();
	Hen obj2 = new Hen();
	obj2.walk();
	
}}
abstract class Animal {   // abstract means concept/ blueprint
	
	abstract void walk() ; // abstract method doesnt have a body {}  and directly ends with ;
		
	
}
class Horse extends Animal {
   void walk() {
	   System.out.println("Walks on 4 legs");
   }
}
class Hen extends Animal {
	void walk() {
		System.out.println("Walks on 2 legs");
	}
}
