import java.lang.InterruptedException;

public class blinkMsg
{
    public static void main(String args[]) throws InterruptedException
    {
        // caution : this will not Work in java
        for (int i=1;i<=5;i++)
        {
            Thread.sleep(1000);
            System.out.print("calculating..");
            System.out.print("\r");
            System.out.print("             ");
            System.out.print("\r");
            Thread.sleep(1000);
        }
        System.out.println("Fun coding");
    }
}