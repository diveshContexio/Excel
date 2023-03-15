package ExcelReadWrite;

import java.util.InputMismatchException;
import java.util.Scanner;

public class choice {
	 boolean choice = true;
	 int user_preference;
	 
	 public static Scanner sc= new Scanner(System.in); 
	 public boolean choice()
	 {
		 boolean c = true;
	  System.out.println("Press 1 to continue 2 to exit");
	  try {
      user_preference = sc.nextInt();
	  }
	  catch(InputMismatchException e) {
		  System.out.println("Invalid value ");
          sc.nextLine();
          choice();
		  
	  }
	  
     if(user_preference ==2)
     {
         c = false;
     }
     return c;
}

}