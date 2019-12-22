
/**
 *
 * @author (Hector Santiago)
 * 
 */
public class bank_methods
{
    private double check; // Holds the checks written
    double fee = 10; // Holds the $10 monthly fee
    private double balance; // Holds the starting balance
    
    /**
     * Constructor for objects of class bank_methods
     */
    public bank_methods(double ch, double bal)
    {
        check = ch;
        balance = bal;
    }

    /**
    * 
    */
    public double getChecks()
    {
        return check;
    }
    
    /**
    * 
    */
    public double getTotal()
    {
        if (check >= 60) return balance-(.04*check)-fee;
        else
        if (check >= 40) return balance-(.06*check)-fee;
        else
        if (check >= 20) return balance-(.08*check)-fee;
        
        return balance-(.10*check)-fee;
    }
    
    /**
    * 
    */
    public double getFees()
    {
        return (fee*2+getTotal())-balance;
     }
    
    /**
    * 
    */
    public double getBalance()
    {
        {if (balance < 400) return (15+fee+getTotal())+balance;
         else
         return (fee+getTotal())+balance;
        }
    }
}
