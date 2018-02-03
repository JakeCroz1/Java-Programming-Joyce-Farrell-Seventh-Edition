//Filename IntegerDemoInteractive.java
import java.util.Scanner;
public class IntegerDemoInteractive

{
   public static void main(String[] args)
   {
      int anInt ;
      byte aByte  ;
      short aShort  ;
      long aLong  ;
      Scanner input = new Scanner(System.in);
      System.out.print("Please enter an integber>>");
      anInt = input.nextInt();
       System.out.print("Please enter an byte integber>>");
      aByte = input.nextByte();  
       System.out.print("Please enter an short integber>>");
      aShort = input.nextShort();          
       System.out.print("Please enter an long integber>>");
      aLong = input.nextLong();
   
       
    }   
}