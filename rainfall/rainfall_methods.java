/**
 *
 * @author (Hector Santiago)
 *
 */

public class rainfall_methods
{
    private double[] rainfall = new double[12];
    private int maxRain; // Holds the max rain
    private int leastRain; // Holds the least rain
    private double total; // Holds the total rain

    
    private int i;
    
    /**
     * Constructor for objects of class rainfall_methods
     */
    public rainfall_methods(double m1,double m2, double m3, double m4, double m5, double m6, double m7, double m8, double m9, double m10, double m11, double m12)
    {
        rainfall[0] = m1;
        rainfall[1] = m2;
        rainfall[2] = m3;
        rainfall[3] = m4;
        rainfall[4] = m5;
        rainfall[5] = m6;
        rainfall[6] = m7;
        rainfall[7] = m8;
        rainfall[8] = m9;
        rainfall[9] = m10;
        rainfall[10] = m11;
        rainfall[11] = m12;
        
        maxRain = 0;
        leastRain = 0;
    }
    
    /**
     * 
     */
    public int getMax()
    {
     for (i = 1; i < rainfall.length; i +=1)
       {
         if (rainfall[i] > rainfall[maxRain])
         {
         maxRain = i;
        }
       }
        return maxRain;
    }
    
    /**
     * 
     */
    public int getLeast()
    {
       for (i = 1; i < rainfall.length; i +=1)
       {
         if (rainfall[i] < rainfall[leastRain])
         {
         leastRain = i;
        }
       }
        return leastRain; 
       }
    
    /**
     * 
     */
    public double getAverage()
    {
        return (total/rainfall.length);
    }
    
    /**
     * 
     */
    public double getTotal()
    {
     for (i = 1; i < rainfall.length; i +=1)
       {
         {
          total = total + rainfall[i];
         }
       }
        return total;    
    }
    
}
