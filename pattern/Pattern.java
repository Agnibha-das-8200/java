/*  * * * * *
 *    * * *
 *      * 
 */
public class Pattern
{
    public static void mains (String args [])
    {
        
        int row =5;
        for (int i=0;i<=row;i++)
        {
            for (int j=0; j<=i; j++)
            {
                System.out.print(" ");
            }
            for (int m=i; m<=row; m++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}