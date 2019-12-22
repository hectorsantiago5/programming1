
/**
 *
 * @author (Hector Santiago)
 *
 */

import java.util.Scanner; 

public class resort
{
    public static void main(String[] args) {
        char room; // Holds the room type
        char spa; // Holds decision on spa
        char meal; // Holds the meal plan
        double days; // Holds the number of days they stay
        int index; // Controls the loop
        
        Scanner keyboard=new Scanner(System.in);  
        
        System.out.print("Welcome to Caldwell Spa & Resort!\n We hope you enjoy your stay!\n");
        
        for(index = 0; index < 4; index++)
        {
            
        System.out.println("\nWhat room do you want to sign up for? (Deluxe or Executive)");  
        room = keyboard.next().charAt(0);
        
        System.out.println("Do you want acces to the spa? (Yes or No)");  
        spa = keyboard.next().charAt(0);
        
        System.out.println("Do you want a meal plan? (Yes or No)");  
        meal = keyboard.next().charAt(0);
        
        System.out.println("How many days will you be staying?");  
        days = keyboard.nextDouble();
        
        resort_methods rm = new resort_methods(room,spa,meal,days);
        
        rm.setOccupancyTax();
        rm.setSalesTax();
        rm.setOverallTax();
        
        System.out.print("\n*****************************************************************************************\n");
        System.out.print("                               CALDWELL SPA & RESORT                                     \n");
        System.out.print("*****************************************************************************************\n");
        System.out.println("Type of Suite:                                 " + rm.getRoomName());
        System.out.println("Days:                                          " + days);
        System.out.println("Suite Cost:                                    $" + rm.getSuite());
        System.out.println("Spa Cost:                                      $" + rm.getSpa());
        System.out.println("Meal Cost:                                     $" + rm.getMeal());
        System.out.println("Total Tax:                                     $" + rm.getTax());
        System.out.println("Total Amount Due:                              $" + rm.getTotal());
        System.out.println(" ");
        System.out.println("                         Thank You for Staying With Us                                ");
        System.out.println("                         Please Come Again Real Soon!                                 ");
        System.out.println("                     Remember to BUCKLE UP and DRIVE SAFELY!                          ");
        System.out.println(" ");
        
        }
    }
}
