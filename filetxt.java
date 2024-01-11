import java.util.*;
import java.io.*;
public class filetxt
{
    public static void mains(String args[]) throws IOException
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a sentence");
        String a=sc.nextLine();
        FileWriter fw=new FileWriter("a.ppt",true);
        BufferedWriter bw=new BufferedWriter(fw);
        PrintWriter pw=new PrintWriter(bw);
        pw.println(a);
        
        pw.close();
        bw.close();
        fw.close();
    }
}
