import java.util.*;
import java.io.*;

class Randomnumber
{
    public void RandomphoneNumber()
    {
        long ph=(long)(Math.random()*100000000*100);
        
        System.out.println(ph);
    }
    public void Randomdate ()
    {
        int randig=(int)(Math.random()*10);
        if(randig % 2==0)
        {
            int randate= (int)(Math.random()*10);
            System.out.println(randate);
        }
        else if (randig % 2==1)
        {
            int randate= (int)(Math.random()*100);
            System.out.println(randate);
        }
    }
}
class delay
{
    public void delay()
    {
        try 
        {
          Thread.sleep(2000);  
        }
        catch( InterruptedException obj)
        {
            int a=2;
        }
    }
}
public class Ivr
{
    static Scanner sc=new Scanner(System.in);
    static Firstphrase fp=new Firstphrase();
    static Secondphrase sp=new Secondphrase();
    static ThirdPhrase tp=new ThirdPhrase();
    static filetxt ft=new filetxt();
    static delay de=new delay();
    public static void mains (String args[]) throws IOException
    {
        System.out.println("Welcome to \"New brand of living\"");
        System.out.println("Enter 1 for phone number details");
        System.out.println("Enter 2 for sim details");
        System.out.println("Enter 3 for other inquiry");
        int ch=sc.nextInt();
        switch (ch)
        {
            case 1:
                fp.Firstphrase();
                break;
            case 2:
                sp.Secondphrase();
                break;
            case 3:
                tp.thirdphrase();
                break;
            default:
                System.out.println("Wrong choice");
        }
        de.delay();
        ft. FileTxt();
        de.delay();
        System.out.println("Thank you!");
    }
}
class Firstphrase
{
    static Scanner sc=new Scanner(System.in);
    public void Firstphrase()
    {
        Firstphraseparts fps=new Firstphraseparts();
        System.out.println("Enter 1 for customer service\nEnter 2 for Recharge details");
        int a=sc.nextInt();
        switch (a)
        {
            case 1: 
                System.out.println("Your phone is being handed over");
                fps.Firstphrase1();
                break;
            case 2:
                fps.Firstphrase2();
                break;
            default:
                System.out.println("Wrong choice");
            }
    }
}
class Firstphraseparts
{
    static Scanner sc=new Scanner(System.in);
    static Randomnumber phnran=new Randomnumber();
    public void Firstphrase1()
    {
        System.out.println("Please call at given number ");
        phnran.RandomphoneNumber();
    }
    public void Firstphrase2()
    {
        System.out.println("Enter 1 for Recharge Expiry \nEnter 2 for recharge demand");
        int rc=sc.nextInt();
        switch (rc)
        {
            case 1:
                System.out.println("Enter you phone number");
                String phno=sc.next();
                System.out.println("Expiary date for "+ phno+" is " );phnran.Randomdate();
            break;
            case 2:
                System.out.println("Enter you phone number");
                String phno2=sc.next();
                System.out.println("Enter number of days you want to recharge for "+phno2);
                int days=sc.nextInt();
                System.out.println(phno2 +" has been recharged for "+days);
            break;
            default:
                System.out.println("Wrong choice");
        }
    }
}
class Secondphrase
{
    static Scanner sc=new Scanner(System.in);
    static Name name=new Name();
    static Randomnumber phnran=new Randomnumber();
    public void Secondphrase()
    {
        System.out.println("Enter 1 for sim user\nEnter 2 for last use of the number");
        int simdetails=sc.nextInt();
        switch (simdetails)
        {
            case 1:
                System.out.println("Enter phone number ");
                String phno3=sc.next();
                System.out.println("User of "+phno3+" is ");name.name();
            break;
            case 2:
                System.out.println("Enter phone number ");
                String phno4=sc.next();
                System.out.print("last use of "+phno4+" is ");phnran.Randomdate();System.out.println("days ago");
            default:
                System.out.println("Wrong choice");
        }
    }
}
class Name
{
    public void name()
    {
        int randig=(int)(Math.random()*10);
        switch (randig)
        {
            case 1:
                System.out.println("Ananya Sharma");
            break;
            case 2:
                System.out.println("Arjun Kapoor");
            break;
            case 3:
                System.out.println("Siddharth Patel");
            break;
            case 4:
                System.out.println("Priya Singhania");
            break;
            case 5:
                System.out.println("Aryan Deshmukh");
            break;
            case 6:
                System.out.println("Naina Verma");
            break;
            case 7:
                System.out.println("Rohan Malhotra");
            break;
            case 8:
                System.out.println("Kavita Reddy");
            break;
            case 9:
                System.out.println("Rajat Choudhary");
            break;
            case 10:
                System.out.println("Meera Iyer");
            break;
        }
    }
}
class ThirdPhrase
{
    public void thirdphrase()
    {
        Randomnumber phnran=new Randomnumber();
        System.out.println("Contact the given phone number for your query");
        phnran.RandomphoneNumber();
    }
}
class filetxt
{
    public void FileTxt() throws IOException,EOFException
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Please give your rating");
        String a=sc.nextLine();
        FileWriter fw=new FileWriter("Rating of program.txt",true);
        BufferedWriter bw=new BufferedWriter(fw);
        PrintWriter pw=new PrintWriter(bw);
        pw.println(a);
        
        pw.close();
        bw.close();
        fw.close();
    }
}
