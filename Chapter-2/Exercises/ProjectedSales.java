//Filename ProjectedSales.java
import java.util.Scanner;
public class ProjectedSales

{
   public static void main(String[] args)
   {
      double TenPercentIncrease = 0.10;
      double ThisYearsSalesTotal;
      double NextYearsSalesGrowth;
                
      Scanner input = new Scanner(System.in);
      System.out.print("Please enter this years total sales>>");
      ThisYearsSalesTotal = input.nextDouble();
     
      NextYearsSalesGrowth = ThisYearsSalesTotal + (ThisYearsSalesTotal * 0.10);
      
            
      System.out.println("Next years potential sales growth is " + NextYearsSalesGrowth);
          
    }   
}