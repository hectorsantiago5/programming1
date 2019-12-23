
/**
 *
 * @author (Hector)
 *
 */

import java.util.Scanner; 
import java.text.DecimalFormat;

public class AutoCenter
{
    public static void main(String[] args) 
    {
      double gas; // Holds the amount of gas used
      char gasType; // Holds the type of gas the used
      char input; // Holds a yes or no
      
      Scanner keyboard=new Scanner(System.in); 
      DecimalFormat df=new DecimalFormat(" #,###,##0.00");  
      
      System.out.println("How many gallons of gas did you purchase?: ");
      gas = keyboard.nextDouble();
      
      System.out.println("What type of gas did you purchase? (Regular,Silver,Premium or None): ");
      gasType = keyboard.next().charAt(0);
       
      System.out.println("Do you want a car wash? (yes or no): ");
      input = keyboard.next().charAt(0);
      
      auto_methods am = new auto_methods(gas, gasType, input);
      
      System.out.println("Your purchased " + am.getGas() + " gallons of gas.");
      System.out.println("Your price per gallon was $" + am.getGasType());
      System.out.println("Your total gasoline cost was $" + am.getPrice());
      System.out.println("Your car wash cost was " + df.format(am.getCarWash()));
      System.out.println("Your total amount due is $" + df.format(am.getTotal()));
    }
}
