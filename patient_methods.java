
/**
 *
 * @author (Hector Santiago)
 *
 */

public class patient_methods
{
   private String first; // Holds the patients first name
   private String middle; // Holds the patients middle name
   private String last; // Holds the patients last name
   private String street, city, state, zip; // Holds the patients street address, city and zip code
   private String phone; // Holds the patients phone number
   private String emname; // Holds an emergecy contacts name
   private String emphone; // Holds an emergency contacts number
   private String procedure1; // Holds the name of the procedure performed
   private String procedure2; // Holds the name of the procedure performed
   private String procedure3; // Holds the name of the procedure performed
   private String proc_date1; // Holds the date the procedure was performed
   private String proc_date2; // Holds the date the procedure was performed
   private String proc_date3; // Holds the date the procedure was performed
   private String doctor1; // Holds the name of the Doctor
   private String doctor2; // Holds the name of the Doctor
   private String doctor3; // Holds the name of the Doctor
   private String charge1; // Cost of the procedure
   private String charge2; // Cost of the procedure
   private String charge3; // Cost of the procedure
   
    /**
     * Constructor for objects of class patient_methods
     */
    public patient_methods(String first_, String mid, String last_, String strt, 
           String city_, String state_, String zip_, String num, String emername, String emerphone)
    {
     first = first_;
     middle = mid;
     last = last_;
     street = strt;
     city = city_;
     state = state_;
     zip = zip_;
     phone = num;
     emname = emername;
     emphone = emerphone;
     procedure1 = "Physical Exam";
     procedure2 = "X-Ray";
     procedure3 = "Blood Test";
     proc_date1 = "10-08-2019";
     doctor1 = "Dr. Irvine";
     doctor2 = "Dr. Jamison";
     doctor3 = "Dr.Smith";
     charge1 = "$250.00";
     charge2 = "$500.00";
     charge3 = "$200.00";
    }

    /**
    * get first name
    */
    public String getFirst()
    {
        return first;
    }
    
    /**
    * get middle name
    */
    public String getMiddle()
    {
        return middle;
    }
    
    /**
    * get street name
    */
    public String getStreet()
    {
        return street;
    }
    
    /**
    * get city name
    */
    public String getCity()
    {
        return city;
    }
    
    /**
    * get state
    */
    public String getState()
    {
        return state;
    }
    
    /**
    * get zip code
    */
    public String getZip()
    {
        return zip;
    }
    
    /**
    * get phone number
    */
    public String getPhone()
    {
        return phone;
    }
    
    /**
    * get last name
    */
    public String getLast()
    {
        return last;
    }
    
    /**
    * get emergency contact's name
    */
    public String getEmname()
    {
        return emname;
    }
    
    /**
    * get emergency contact's phone number
    */
    public String getEmphone()
    {
        return emphone;
    }
    
    /**
    * get name of procedure
    */
    public String getProcedure1()
    {
        return procedure1;
    }
    
    /**
    * get name of second procedure
    */
    public String getProcedure2()
    {
        return procedure2;
    }
    
    /**
    * get name of third procedure
    */
    public String getProcedure3()
    {
        return procedure3;
    }
    
    /**
    * get date of procedure
    */
    public String getProc_date1()
    {
        return proc_date1;
    }
    
    /**
    * get first doctor's name
    */
    public String getDoctor1()
    {
        return doctor1;
    }
    
    /**
    * get second doctor's name
    */
    public String getDoctor2()
    {
        return doctor2;
    }
    
    /**
    * get third doctor's name
    */
    public String getDoctor3()
    {
        return doctor3;
    }
    
    /**
    * get charge of procedure 1
    */
    public String getCharge1()
    {
        return charge1;
    }
    
    /**
    * get charge of procedure 2
    */
    public String getCharge2()
    {
        return charge2;
    }
    
    /**
    * get charge of procedure 3
    */
    public String getCharge3()
    {
        return charge3;
    }
}
