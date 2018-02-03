//Filename Initials.java
import java.util.Scanner;
public class Initials

{
   public static void main(String[] args)
   {
      
      String fName;
      String mName;
      String lName;
     
      Scanner input = new Scanner(System.in);
      System.out.print("Please first name>>");
       fName = input.nextLine();
       String initials1 = fName.substring(0, 1);       
       System.out.print("Please middle name>>");
       mName = input.nextLine();
       String initials2 = mName.substring(0, 1);
       System.out.print("Please last name>>");
       lName = input.nextLine();
       String initials3 = lName.substring(0, 1);
     
      System.out.println(initials1.toUpperCase() + "." + initials2.toUpperCase() + "." + initials3.toUpperCase() + ".");
          
    }   
}