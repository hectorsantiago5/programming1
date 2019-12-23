/**
 *
 * @author (Hector Santiago)
 * 
 */

import java.util.Scanner;
import java.text.DecimalFormat;
//import java.util.ArrayList;

public class rainfall
{
    public static void main(String[] args) {
      //rain1,rain2,rain3,rain4,rain5,rain6,rain7,rain8,rain9,rain11,rain12; // Holds the rain amount for each month
      double January, February, March, April, May, June, July, August, September, October, November, December; // Months of the year
      String[] thisMonth = {"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};
      int high;
      int low;
      
      Scanner keyboard = new Scanner(System.in);
      DecimalFormat df=new DecimalFormat(" #,###,##0.00");

      System.out.println("What is the rainfall in inches for January?: ");
      January = keyboard.nextInt();
      
      System.out.println("What is the rainfall in inches for February?: ");
      February = keyboard.nextInt();
      
      System.out.println("What is the rainfall in inches for March?: ");
      March = keyboard.nextInt();
      
      System.out.println("What is the rainfall in inches for April?: ");
      April = keyboard.nextInt();
      
      System.out.println("What is the rainfall in inches for May?: ");
      May = keyboard.nextInt();
      
      System.out.println("What is the rainfall in inches for June?: ");
      June = keyboard.nextInt();
      
      System.out.println("What is the rainfall in inches for July?: ");
      July = keyboard.nextInt();
      
      System.out.println("What is the rainfall in inches for August?: ");
      August = keyboard.nextInt();
      
      System.out.println("What is the rainfall in inches for September?: ");
      September = keyboard.nextInt();
      
      System.out.println("What is the rainfall in inches for October?: ");
      October = keyboard.nextInt();
      
      System.out.println("What is the rainfall in inches for November?: ");
      November = keyboard.nextInt();
      
      System.out.println("What is the rainfall in inches for December?: ");
      December = keyboard.nextInt();
      
      rainfall_methods rm = new rainfall_methods(January, February, March, April, May, June, July, August, September, October, November, December);
      
      high = rm.getMax();
      low = rm.getLeast();
      
      System.out.println("\n The month with the highest rainfall was: " + thisMonth[high]);
      System.out.println("The month with the Lowest rainfall was: " + thisMonth[low]);
      System.out.println("The total amount of rainfall for the year in inches was: " + rm.getTotal());
      System.out.println("The average amount of rainfall for the year in inches was: " + df.format(rm.getAverage()));
    }
}
