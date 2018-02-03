//Filename ArithmeticDemo3.java
import java.util.Scanner;
public class ArithmeticDemo3

{
   public static void main(String[] args)
   {
      int firstNumber;
      int secondNumber;
      int sum;
      int difference;
      double average;
      Scanner input = new Scanner(System.in);
      System.out.print("Please enter an integber>>");
      firstNumber = input.nextInt();
       System.out.print("Please enter another integber>>");
      secondNumber = input.nextInt();  
      
      sum = firstNumber + secondNumber;
      difference = firstNumber - secondNumber;
      //average = sum / 2;
      //average = (double)sum / 2;
      //average = (double)(sum / 2);
      average = sum / 2.0;
      
      
      System.out.println(firstNumber + " + "+ secondNumber + " is " + sum);
      System.out.println(firstNumber + " - "+ secondNumber + " is " + difference);
      System.out.println("The average of " + firstNumber + " and "+ secondNumber + " is " + average);
      
      
    }   
}