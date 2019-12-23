
/**
 *
 * @author (Hector Santiago)
 *
 */

public class auto_methods
{
    private double gas;
    private char gasType;
    private char input;
    private double regular;
    private double silver;
    private double premium;
   

    /**
     * Constructor for objects of class auto_methods
     */
    public auto_methods(double g, char gt, char in)
    {
        gas = g;
        gasType = gt;
        input = in;
        regular = 1.98;
        silver = 2.08;
        premium = 2.38;
    }

    /** 
    *  get gallons of gas
    */
    public double getGas()
    {
     return gas;   
    }
    
    /** 
    *  get type of gas purchased
    */
    public double getGasType()
    {
        if (gasType == 'R'|| gasType == 'r') return regular;
        else
        if (gasType == 'S'|| gasType == 's') return silver;
        
        return premium;
    }
   
    /** 
    *  get the price of gas selected
    */
    public double getPrice()
    {
        if (gasType == 'R'|| gasType == 'r') return (regular * gas);
        else
        if (gasType == 'S'|| gasType == 's') return (silver * gas);
        
        return (premium * gas);
    }
    
    /** 
    *  get car wash choice
    */
    public double getCarWash()
    {
        if (input == 'y'|| input == 'Y')
            if (gas >= 10.00)
                return 3.00;
            else
                return 7.00;
        else
        return 0.00;
    }
    
    /** 
    *  get total cost
    */
    public double getTotal()
    {
        return getPrice()+getCarWash();
    }
    
}
