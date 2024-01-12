
public class labelled_jump_stmt
{
    public static void mains(String args[])
    {
        peace:
        for (int i=1;i<=5;i++)
        {
            System.out.println("i= "+i);
            for (int j=1;j<=5;j++)
            {
                System.out.println("j= \t"+j);
                if (j==3)
                {
                    break peace;
                }
            }
        }
    }
}
