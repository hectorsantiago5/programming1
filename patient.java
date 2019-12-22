
/**
 *
 * @author (Hector Santiago)
 *
 */
import java.util.Scanner;
public class patient
{
    public static void main(String[] args)
  {
   String first; // Holds the patients first name
   String middle; // Holds the patients middle name
   String last; // Holds the patients last name
   String street, city, state, zip; // Holds the patients street address, city and zip code
   String phone; // Holds the patients phone number
   String emname; // Holds an emergecy contacts name
   String emphone; // Holds an emergency contacts number
    
   Scanner keyboard=new Scanner(System.in);
   
   System.out.print("Please enter your first name: ");
   first = keyboard.nextLine();
   
   System.out.print("Please enter your middle name: ");
   middle = keyboard.nextLine();
   
   System.out.print("Please enter your last name: ");
   last = keyboard.nextLine();
   
   System.out.print("Please enter just your street address: ");
   street = keyboard.nextLine();
   
   System.out.print("Please enter your city: ");
   city = keyboard.nextLine();
   
   System.out.print("Please enter the abbreviation of your state (ex. NC): ");
   state = keyboard.nextLine();
   
   System.out.print("Please enter your zip code: ");
   zip = keyboard.nextLine();
   
   System.out.print("Please enter your phone number: ");
   phone = keyboard.nextLine();
   
   System.out.print("Please enter the name of your emergency contact: ");
   emname = keyboard.nextLine();
   
   System.out.print("Please enter the phone number for your emergency contact: ");
   emphone = keyboard.nextLine();
   
   patient_methods pt = new patient_methods(first,middle,last,street,city,state,zip,phone, emname,emphone);
   
   System.out.println("");
   System.out.println("Your name is: " + pt.getFirst() + " " + pt.getMiddle() + " " + pt.getLast());
   System.out.println("Your address is : " + pt.getStreet() + " " + pt.getCity() + ", " + pt.getState() + " " + pt.getZip());
   System.out.println("Your phone number is: " + pt.getPhone() + " and your emergency contact's name is: " + pt.getEmname() + " and their number is: " + pt.getEmphone());
   System.out.println("The first procedure you can do today is a " + pt.getProcedure1() + ". The practitioner performing the procedure is " + pt.getDoctor1() + " and it will take place on " + pt.getProc_date1() + ". Your total cost for the procedure will be: " + pt.getCharge1()); 
   System.out.println("The second procedure you can do today is a " + pt.getProcedure2() + ". The practitioner that would be performing the procedure is " + pt.getDoctor2() + " and it will take place on " + pt.getProc_date1() + ". Your total cost for the procedure will be: " + pt.getCharge2()); 
   System.out.println("The third procedure you can do today is a " + pt.getProcedure3() + ". The practitioner that would be performing the procedure is " + pt.getDoctor3() + " and it will take place on " + pt.getProc_date1() + ". Your total cost for the procedure will be: " + pt.getCharge3()); 
  
   }
}
