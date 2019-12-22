
/**
 *
 * @author (Hector Santiago)
 * 
 */
import java.util.Scanner;
public class bank
{
    public static void main(String[] args)
    {
        double checks; // Holds the amount of checks written
        double balance; // Holds the current account balance
        double conversion; // Holds the balance with $15 fee if less than $400
        
        Scanner keyboard = new Scanner(System.in);

        System.out.print("How many checks did you write this month?: ");
        checks = keyboard.nextInt();
        
        System.out.print(" What is your account's current balance?: ");
        balance = keyboard.nextInt();
        
        System.out.println(" Your month starting balance was $" + balance);
       
        bank_methods check = new bank_methods(checks, balance);
        conversion = balance - 15;
        
        if (balance < 400)
        {
         System.out.println(" Due to a balance lower than $400 you have been charged $15. Your new balance is: " + conversion); 
        
        }
        
        System.out.println(" You wrote " + checks + " checks this month");
        System.out.println(" Your ending balance this month is $" + check.getTotal());
        System.out.println(" Your total fees for this month was $" + check.getFees());
    }
}
