/*15. Write a program in Java to convert a given time input
 * into 24 hour format and display the output. (For e.g if 
 * time input is 02:35 A.M. the output will be 02:35 A.M., 
 * if time input is 02:35 P.M., the output will be 14:35 P.M.,
 * if the time input is 14:35 P.M., the output will be 14:35 P.M.)*/

  
import java.util.*;
import java.lang.*;
public class Project20
{
    public static void main(String[] args) 
    {
        int hh, mm;
        String ap;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the hours: "); 
        hh = sc.nextInt(); //valid hh = [1-11], [12-23] 
        
        System.out.println("Enter the minutes: "); 
        mm = sc.nextInt(); //valid mm = [0-59] 
        
        System.out.println("Enter AM/PM: "); //only AM/PM 
        ap = sc.next();
        //checks the input and declares the output
        if((hh > 0 && hh < 12) && (ap.equalsIgnoreCase("AM")))
        { 
            System.out.println("Im here"); 
            System.out.println(hh+": "+mm+" "+ap); 
        }
        else if((hh == 0) && (ap.equalsIgnoreCase("PM")))
        { 
            System.out.println("Invalid time format!"); 
        }
        else if((hh > 0 && hh < 12) && (ap.equalsIgnoreCase("PM"))) 
        {
            hh = hh + 12;
            System.out.println(hh+": "+mm+" "+ap);
        }
        else if((hh == 12) && (ap.equalsIgnoreCase("AM")))
        { 
            hh = hh - 12;
            System.out.println(hh+": "+mm+" "+ap);
        }
        else if((hh == 12) && (ap.equalsIgnoreCase("PM")))
        {
            System.out.println(hh+": "+mm+" "+ap);
        }
        else if((hh >= 12 && hh <= 23) && (ap.equals("PM")))
        { 
            System.out.println(hh+": "+mm+" "+ap); 
        }
        else if((hh >= 12 && hh <= 23) && (ap.equalsIgnoreCase("AM"))) 
        { 
            System.out.println("Invalid time format!");
        }
        else
        {
            System.out.println("Unacceptable input");
        }
    }
}