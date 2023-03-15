package ExcelReadWrite;

import java.io.IOException;
import java.util.Scanner;
import java.util.InputMismatchException; 

public class Main {
	
    private static boolean CONTINUE =true;
    public static void main(String[] args) throws Exception {
    	Scanner sc = new Scanner(System.in);
    	choice user_preference = new choice();
    	while(CONTINUE)
        {
        System.out.println("1.Read Data");
        System.out.println("2.Write");
        System.out.println("Enter your Choice:");
        int number = 0;
          try {
            number = sc.nextInt();
        } catch (InputMismatchException e) {
            System.out.println("Invalid value entered. Please enter a valid choice (1 or 2)");
            sc.nextLine();  
           continue;
        }
       try {
        switch (number) {
            case 1:
                new Read();
                new choice();
                CONTINUE = user_preference.choice();
                break;
            case 2:
               new Write();
                new choice();
                CONTINUE = user_preference.choice(); 
                 break;
            default:
                System.out.println("Not a valid choice");
               CONTINUE = user_preference.choice();
                break;   
        }
  }
       catch(Exception e)
       {
    	   e.printStackTrace();
       }
        }
}
}
