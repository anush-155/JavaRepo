package office;

public class DuplicateInString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    String name = "Anoosho";
    int l = name.length();
    		for(int i=0;i<l;i++) {
    	       for(int j=i+1;j<l;j++) {
    	    	   if(name.charAt(i)==name.charAt(j)){
    	    	   System.out.println(name.charAt(i)+" Duplicate at "+j); //Not accurate enough
    	       }
    }
		
    		}}}
		
		
	


