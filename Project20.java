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
        
        if((hh > 0 && hh < 12) && (ap.equals("AM")))
        { 
            System.out.println("Im here"); 
            System.out.println(hh+": "+mm+" "+ap); 
        }
        else if((hh == 0) && (ap.equals("PM")))
        { 
            System.out.println("Invalid time format!"); 
        }
        else if((hh > 0 && hh < 12) && (ap.equals("PM"))) 
        {
            hh = hh + 12;
            System.out.println(hh+": "+mm+" "+ap);
        }
        else if((hh == 12) && (ap.equals("AM")))
        { 
            hh = hh - 12;
            System.out.println(hh+": "+mm+" "+ap);
        }
        else if((hh == 12) && (ap.equals("PM")))
        {
            System.out.println(hh+": "+mm+" "+ap);
        }
        else if((hh >= 12 && hh <= 23) && (ap.equals("PM")))
        { 
            System.out.println(hh+": "+mm+" "+ap); 
        }
        else if((hh >= 12 && hh <= 23) && (ap.equals("AM"))) 
        { 
            System.out.println("Invalid time format!");
        }
        else
        {
            System.out.println("Unacceptable input");
        }
    }
}