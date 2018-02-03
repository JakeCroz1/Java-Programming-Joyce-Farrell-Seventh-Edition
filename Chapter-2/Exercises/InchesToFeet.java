//Filename InchesToFeet.java
import java.util.Scanner;
public class InchesToFeet

{
   public static void main(String[] args)
   {
      
      double conversionFtToIn = 12;
      double  feet;
      
      double inputinches;
      double inch;
      
    
                
      Scanner input = new Scanner(System.in);
      System.out.print("Please enter inches>>");
       inputinches = input.nextDouble();
      feet = inputinches / conversionFtToIn; 
      //method 1
      //Not exactly sure why i have to delcare var down here
      double feetRound = Math.round((feet*100)/100);
      inch = (feet-feetRound)*12;
      double inches = Math.round((inch*100)/100);
      //method 2
      //System.out.printlf("%.2f" + "\n", feet);
      //System.out.printlf("%.2f" + "\n", inch);
      //method 3
      //DecimalFormat variableName = new DecimalFormat("0.00");
      //string formatted = variableName.format(inch);
      //System.out.println(formatted);
      
      System.out.println(feetRound + "ft. " + " and " inches + "inches");
          
    }   
}