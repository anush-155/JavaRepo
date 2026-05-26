package oops;

public class InterfaceDemo {
   public static void main(String[] args) {
	  goat obj = new goat();
	  obj.walk();
	   obj.eatsGrass();
   }
}
interface AnimalInterface{
 void walk();
}
interface Herbivore{
	void eatsGrass();

}
class goat implements AnimalInterface,Herbivore {
	@Override
	public void walk() {
		System.out.println("Walk on 4 legs");
	}
	@Override
	public void eatsGrass(){
		System.out.println("Eats grass");
	}
}