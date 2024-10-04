package loginsystem;
import java.util.Scanner;
public class Loginsystem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
	    String myUsername ="SOKIRI";
	    String myPassword = "SRONALD";
	     int maxAttempts = 3;
	     
	     int attempt = 0;
	     while (attempt < maxAttempts) {
	    	 System.out.println("Enter username:");
	    	  String username =scanner.nextLine();
	    	    System.out.println("Enter password:");
	    	    String password =scanner.nextLine();
	    	  
	    	  if(username.equals(username)&& password.equals(myPassword)){
	    		  System.out.println("Login successful!");
	    		  break;
	    	  } else {
	    		  attempt++;
	    		  System.out.println("Incorrect username or password. Attempts left:" + (maxAttempts - attempt));
	    	  
	    	  } 
	    	   if(attempt == maxAttempts) {
	    		   System.out.println("Maximum attempts reached. Access denied");
	    	   }
	    	  
	     }
	        scanner.close();
	    
	}

}
