
/**
 * Write a description of class resort_methods here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class resort_methods
{
    private char room; // Holds the room type
    private char spa; // Holds decision on spa
    private char meal; // Holds the meal plan
    private double days; // Holds the number of days they stay
    double deluxe; // Holds the price for Deluxe room
    double executive; // Holds the price for Executive room
    double salestax; // Holds the sales tax per night
    double tax; // Holds the occupancy tax per night
    double spacost; // Holds the spa cost
    double mealcost; // Holds the meal cost
    String roomname; // Holds the room name
    double stax;
    double otax;
    double overtax;
   
    /**
     * Constructor for objects of class resort_methods
     */
    public resort_methods(char roomtype, char spachoice, char mealplan, double daystay)
    {
        room = roomtype;
        spa = spachoice;
        meal = mealplan;
        days = daystay;
        deluxe = 135.00;
        executive = 200.00;
        salestax = .06;
        tax = .10;
        spacost = 20.00;
        mealcost = 60.00;
    }
    
    /**
     * Get the room name
     */
    public String getRoomName()
    {
        if (room == 'd' || room == 'D') return "Deluxe";
        else
        return "Executive";
    }
    
    /**
     * Get the suite cost
     */
    public double getSuite()
    {
        if (room == 'd' || room == 'D') return (deluxe * days);
        else
        if (room == 'e' || room == 'E') return (executive * days);
        
        return 0.00;
    }
    
    /**
     * Get the spa cost
     */
    public double getSpa()
    {
        if (spa == 'y' || spa == 'Y') return (spacost * days);
        else
        return 0.00;
    }
    
    /**
     * Get the meal cost
     */
    public double getMeal()
    {
        if (meal == 'y' || meal == 'Y') return (mealcost * days);
        else
        return 0.00;
    }
    
    /**
     * Set Sales Tax
     */
    public void setSalesTax()
    {
        stax = (getSuite()+getSpa()+getMeal()) * salestax;
    }
    
    /**
     * Set Occupancy Tax
     */
    public void setOccupancyTax()
    {
        otax = (getSuite()+getSpa()+getMeal()) * tax;
    }
    
    /**
     * Get Sales Tax
     */
    public double getSalesTax()
    {
        return stax;
    }
    
    /**
     * Get Occupancy Tax
     */
    public double getOccupancyTax()
    {
        return otax;
    }
    
    /**
     * Set Overall Tax
     */
    public void setOverallTax()
    {
         overtax = (otax + stax);
    }
    
    /**
     * Get the occupancy and sales tax
     */
    public double getTax()
    {
        return overtax;
    }
    
    /**
     * Get the total
     */
    public double getTotal()
    {
        return (getSuite() + getSpa() + getMeal() + overtax);
    }
}
