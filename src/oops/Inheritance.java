package oops;

public class Inheritance {
 private String password; // private not even work for child class
 
 
 public void setPassword(String password) {   //line 7
	 this.password = password; // line 8 thispassword is instance variable
 }
 public String getPassword() {	
	
		return password;
	}
public static void main (String [] args) {
	

	
	SetDetails obj = new SetDetails();
	obj.setPassword();
}
}

class SetDetails extends Inheritance {
	public void setPassword() {
		setPassword("Anush");
		System.out.println(getPassword());
}
	}

