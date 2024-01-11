import java.util.*;
public class Armstrong 
{
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enetr a number \nTo check the number is Amstrong or not");
        int n = sc.nextInt();
        int on, rd, rs = 0;
        on = n;
        while (on != 0)
        {
            rd = on % 10;
            rs += Math.pow(rd, 3);
            on /= 10;
        }
        if(rs == n)
            System.out.println(n + " is an Armstrong number.");
        else
            System.out.println(n + " is not an Armstrong number.");
    }
}