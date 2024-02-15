import java.util.*;
// import java.lang.InterruptedException;
public class Cal
{
    Scanner sc=new Scanner(System.in);
    void add()//throws InterruptedException
    {
        System.out.println("You have chosen addition");
        System.out.println("Enter 2 numbers ");
        double a=sc.nextDouble();
        double b=sc.nextDouble();
        double sum=a+b;
        // for (int i=1;i<=5;i++)
        // {
            // Thread.sleep(1000);
            // System.out.print("calculating..");
            // System.out.print("\r");
            // System.out.print("             ");
            // System.out.print("\r");
            // Thread.sleep(1000);
        // }
        System.out.println("Sum= "+sum);
    }
     void sub()// throws InterruptedException
    {
        System.out.println("You have chosen substraction");
        System.out.println("Enter 2 numbers ");
        double c=sc.nextDouble();
        double d=sc.nextDouble();
        // for (int i=1;i<=5;i++)
        // {
            // Thread.sleep(1000);
            // System.out.print("calculating..");
            // System.out.print("\r");
            // System.out.print("             ");
            // System.out.print("\r");
            // Thread.sleep(1000);
        // }
        if (c>d)
        {
            double dif1=c-d;
            
            System.out.println("Difference = "+dif1);
        }
        else if (c<d)
        {
            double dif2=d-c;
            System.out.println("Difference = "+dif2);
        }
    }
    void multi()//throws InterruptedException
    {
        System.out.println("You have chosen Multiplication");
        System.out.println("Enter 2 numbers ");
        double e=sc.nextDouble();
        double f=sc.nextDouble();
        double prod=e*f;
        // for (int i=1;i<=5;i++)
        // {
            // Thread.sleep(1000);
            // System.out.print("calculating..");
            // System.out.print("\r");
            // System.out.print("             ");
            // System.out.print("\r");
            // Thread.sleep(1000);
        // }
        System.out.println("Product= "+prod);
    }
    void div()//throws InterruptedException
    {
        System.out.println("You have chosen Division");
        System.out.println("Enter 2 numbers ");
        double g=sc.nextDouble();
        double h=sc.nextDouble();
        double quo=g/h;
        // for (int i=1;i<=5;i++)
        // {
            // Thread.sleep(1000);
            // System.out.print("calculating..");
            // System.out.print("\r");
            // System.out.print("             ");
            // System.out.print("\r");
            // Thread.sleep(1000);
        // }
        System.out.println("Quotient = "+quo);
    }
    public static void mains(String args[])//throws InterruptedException
    {
        Scanner sc=new Scanner (System.in);
        Cal a=new Cal();
        char z;
        do
        {
            System.out.println("Choose an operation:");
            System.out.println("Enter 1 for Addition");
            System.out.println("Enter 2 for Substraction");
            System.out.println("Enter 3 for Multiplication");
            System.out.println("Enter 4 for Division");
            int ch=sc.nextInt();
            switch(ch)
            {
                case 1:
                    a.add();
                    break;
                case 2:
                    a.sub();
                    break;
                case 3:
                    a.multi();
                    break;
                case 4:
                    a.div();
                    break;
                default:
                System.out.println("Wrong choice");
            }
            System.out.println("Do you want to use the calculator(y/n) ");
            z = sc.next().charAt(0);
        }while(z == 'Y'||z == 'y');
        System.out.println("Thank you for using the calculator");
    }
}