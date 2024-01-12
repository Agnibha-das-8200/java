import java.util.*;
class Project17
{  
    public static void main(String args[])  
    {    
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number of terms");
        int n=sc.nextInt();
        
        int o=1,z=0;
        int sum=0;
        System.out.println();
        
        for(int i=0;i<=n;++i)//loop starts from 2 because 0 and 1 are already printed    
        {    
            sum = o + z ;
            
            System.out.println(sum);    
            
            o=z;
            z=sum;
        }    
  
    }
}  
