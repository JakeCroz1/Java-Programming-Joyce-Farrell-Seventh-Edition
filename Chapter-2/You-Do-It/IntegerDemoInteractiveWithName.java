//Filename IntegerDemoInteractiveWithName.java
import java.util.Scanner;
public class IntegerDemoInteractiveWithName
{
   public static void main(String[] args)
   {
      int anInt;
      byte aByte;
      short aShort;
      long aLong;
      String name;
      Scanner input = new Scanner(System.in);
      
      System.out.print("Please enter an integber>>");
      anInt = input.nextInt();
       System.out.print("Please enter an byte integber>>");
      aByte = input.nextByte();  
       System.out.print("Please enter an short integber>>");
      aShort = input.nextShort();          
       System.out.print("Please enter an long integber>>");
      aLong = input.nextLong();
      input.nextLine();
      System.out.print("please enter your name>>");
      name = input.nextLine();  
      System.out.println("Thank you," + name);
      
      System.out.println("The int is" + "   " + anInt);
      System.out.println("The byte is" + "  " + aByte);
      System.out.println("The short is" + " " + aShort);
      System.out.println("The long is" + "  " + aLong);
      
       
    }   
}
