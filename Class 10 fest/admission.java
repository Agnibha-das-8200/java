import java.util.*;
import java.io.*;
public class admission

{
    static Scanner sc1=new Scanner(System.in);
    static InputStreamReader read=new InputStreamReader(System.in);
    static BufferedReader sc=new BufferedReader(read);
    static String name, father_name,mother_name,Gender, local_guardian,addressl1,addressl2,addressl3,cast,blood_grp,allergy,dt;
    static String uid,clasc,email;   
    static int age,numberofstream,con=0,clas,c=5,ct,run=0,k;
    static double percent=0,fees;
    static long contact_number1,contact_number2;
    static String Streams[]={"English","Hindi","Geography","History","Mathematics","Science","Computer application"};
    static String Stream[]={"English","Hindi","Geography","History","Mathematics","Science","Computer application"};
    static String admited[][]={{"Ayushman Singha","Anshu Singha","Anindita Singha","97 Atshutosh colony"},{"Harsh Das" ,"Ajay Das","Radhika Das","27 Diamond Harbour"},{ "Ayan Pramanik","Riyan Pramanik","Rohini Pramanik","64 Salt Lake Sector 3"},{"Sampriti Guho","Aditya Guho","Sonakshi Guho","16 M.G. Road "},{"Triasha Maity","Arpan Maity","Riddhi Maity","58 Kudghat"}};
    static String fathers_name[]={"Anshu Singha","Ajay Das","Riyan Pramanik","Aditya Guho","Arpan Maity","","","","","","","","","","","",""};
    String database[][]=new String[50][14];
    void input()throws IOException
    {

        System.out.println("\tEnter Student's name");
        name=sc.readLine();
        database[run][0]=name;
        
        System.out.println("\tEnter Student's father's name");
        father_name=sc.readLine();
        database[run][1]=father_name;

        fathers_name[c]=father_name;
        c++;
        System.out.println("\tEnter Student's mother's name");
        mother_name=sc.readLine();
        database[run][2]=mother_name;
        for(int i=0;i<admited.length;i++)

        {
            if(name.equalsIgnoreCase(admited[i][0])==true)
                con++;
            if(father_name.equalsIgnoreCase(fathers_name[i])==true)
                con++;
            if(mother_name.equalsIgnoreCase(admited[i][2])==true)
                con++;
        }
        if(con==3)
        {
            System.out.println("\tDetails already exist");
            System.exit(0);
        }

        System.out.println("\tEnter the name of student's Local guardian");
        local_guardian=sc.readLine();
        database[run][3]=local_guardian;

        System.out.println("\tDate of birth (DD/MM/YYYY)");
        dt=sc.readLine();
        database[run][4]=dt;

        age = age_calculator(dt);
        if (age==1)
        {
            System.out.println("\tInvalid Input");
            System.exit(0);
        }

        System.out.println("\tEnter the student's Address");
        System.out.println("\tStreet's name or Apartment's name");
        addressl1=sc.readLine();
        database[run][5]=addressl1;

        System.out.println("\tLocal Area name");
        addressl2=sc.readLine();
        database[run][6]=addressl2;

        System.out.println("\tEnter student's city name along with pin code ");
        addressl3=sc.readLine();
        database[run][7]=addressl3;

        for(int i=0;i<admited.length;i++)
        {
            if(addressl1.equalsIgnoreCase(admited[i][3])==true)
                con++;
        }

        if(con==4)
        {
            System.out.println("\tDetails already exist");
            System.exit(0);
        }

        System.out.println("\tEnter primary contact number");
        do
        {
            contact_number1=Long.parseLong(sc.readLine());
            ct=0;
            long copy_no=contact_number1;
            while(copy_no!=0)
            {
                ct++;
                copy_no=copy_no/10;
            }

            if(ct!=10)
            {
                System.out.println("\tInvalid Input! please try again");
            }
        }while (ct!=10);
        database[run][8]=Long.toString(contact_number1);

        System.out.println("\tEnter alternate contact number ");
        do
        {
            contact_number2=Long.parseLong(sc.readLine());
            ct=0;
            long copy_no=contact_number2;
            while(copy_no!=0)
            {
                ct++;
                copy_no=copy_no/10;
            }

            if(ct!=10)
            {
                System.out.println("\tInvalid Input! please try again");
            }
        }while (ct!=10);
        database[run][9]=Long.toString(contact_number2);

        System.out.println("\tEnter Student's blood group ");
        blood_grp=sc.readLine();
        database[run][10]=blood_grp;

        System.out.println("\tEnter Student's gender");
        Gender=sc.readLine();
        database[run][11]=Gender;

        System.out.println("\tAllergic to ");
        allergy=sc.readLine();
        database[run][12]=allergy;

        System.out.println("\tEnter your caste");
        cast=sc.readLine();
        database[run][13]=cast;

        run++;
    }

    void processing()
    {

        String name_copy=name;
        int wrdcont=0;
        String n=name_copy.toLowerCase(),a[]=n.split(" ");
        n+=" ";
        for(int i=0;i<n.length()-1;i++)
        {
            char x=n.charAt(i);
            if(x==' ')
            wrdcont++;
        }
        if(wrdcont==1)
        email=n+"@ais.com";
        if(wrdcont==2)
        {
            email=n.replace(" ",".")+"@ais.com";
        }
        else
        {
            int pos=n.lastIndexOf(" ");
            String newwrd="";
            for(int i=0;i<n.length();i++)
            {
                char x=n.charAt(i);
                if(x!=' ')
                newwrd+=x;
                else
                {
                    if(i==pos-1)
                    {
                        newwrd+=".";
                    }
                }
            }
        }

        uid=Integer.toString((int)(Math.random()*1000))+"/2h24";
    }

    void admit()throws IOException
    {
        System.out.println("\tEnter the class");
        clasc=sc.readLine();

        int i;
        char clasce=clasc.charAt(0);

        if(clasce>=49 && clasce <=58 || clasc.equals("11"))
        {
            clas=Integer.parseInt(clasc);
        }
        else 
        {

            if(age<6&&age>2)
                System.out.println("\tADMISSION TO JUNIOR SECTION OF OUR SCHOOL IS SUCCESSFUL");

            else
            {
                System.out.println("\tPlease contact the school office");
            }

        }

        if(clas<9 && clas>=1)
        {
            if(age>=(clas+5) && age<=(clas+7))
            {
                System.out.println("\tEnter your Second language\nHindi or Bengali");
                Streams[1]=sc.readLine();

                System.out.println("\tAddmission is granted ");

                output();
                System.out.println("\tYour subjects are");
                for(i=0;i<Streams.length;i++)
                    System.out.print("\t"+Streams[i]+"\t");
            }
            else
            {
                System.out.println("\tYour age is not suitable for the class you have chosen.\nPlease contact the school office");
                System.exit(0);

            }

        }
        else if(clas==9||clas==11)
        {
            if(clas==9)
            {
                System.out.println("\tEnter the mark percentage got in class "+(clas-1));
                percent=sc1.nextDouble(); 

                if((age>=(clas+5)) &&( age<=(clas+7)))
                {
                    System.out.println("\tEnter your choice for the sixth subject:");
                    System.out.println("\tComputer application, ");
                    System.out.println("\tCommercial application, ");
                    System.out.println("\tPhysical Education, ");
                    System.out.println("\tFine arts, ");
                    System.out.println("\tHome Science, ");
                    Streams[6]=sc.readLine();

                    System.out.println("\tEnter your Second language\nHindi or Bengali");
                    Streams[1]=sc.readLine();

                    if(percent>=60)
                    {
                        System.out.println("\tYou have got the following Streams:");
                        System.out.println("\tEnter whether you want to take Science or Economics");
                        Streams[5]=sc.readLine();

                        System.out.println("\tEnter whether you want to take Mathematics or Environmental Science");
                        Streams[4]=sc.readLine();

                        output();
                        System.out.println("\tYour subjects are");

                        for(i=0;i<Streams.length;i++)
                            System.out.println("\t"+Streams[i]);

                    }
                    else if (percent<60&&percent>=35)
                    {
                        Streams[5]="Economics";

                        Streams[4]="Environmental Science";

                        output();
                        System.out.println("\tYour subjects are");
                        for(i=0;i<Streams.length;i++)
                            System.out.println("\t"+Streams[i]);

                    }
                    else 
                    {
                        System.out.println("\tNot eligible for adddmission");
                        System.exit(0);
                    }
                }
                else
                {
                    System.out.println("\tYour age is not suitable for the class you have choosen.\nPlease contact the school office");
                    System.exit(0);
                }
            }
            else 
            {
                if(age>=clas+5 && age<=clas+7)
                {
                    System.out.println("\tEnter the mark percentage you got in class "+(clas-1));
                    percent=sc1.nextDouble(); 

                    if(percent>=60)
                    {
                        System.out.println("\tMake Choice between Science,Commerce and Humanities");
                        String op=sc.readLine();

                        if(op.equalsIgnoreCase("Science"))
                        {
                            Stream[2]="English";
                            Stream[3]="Physics";
                            Stream[4]="Chemistry";
                            k=5;
                        }
                        else if(op.equalsIgnoreCase("Commerce"))
                        {
                            Stream[2]="English";
                            Stream[3]="Commerce";
                            Stream[4]="Accounts";
                            k=6;
                            System.out.println("\tEnter 2nd lang");
                            Stream[5]=sc.readLine();

                        }
                        else if(op.equalsIgnoreCase("Humanities"))
                        {
                            Stream[2]="English";
                            Stream[3]="History";
                            Stream[4]="Geography";
                            k=6;
                            System.out.println("\tEnter 2nd lang");
                            Stream[5]=sc.readLine();

                        }
                        else 
                        {
                            System.out.println("Invalid input");
                            System.exit(0);
                        }
                    }
                    else if(percent<60&&percent>=35)
                    {
                        System.out.println("\tMake Choice between commerce and humanities");
                        String op=sc.readLine();
                        if(op.equalsIgnoreCase("commerce"))
                        {
                            Stream[2]="English";
                            Stream[3]="Commerce";
                            Stream[4]="Accounts";
                            System.out.println("\tEnter 2nd lang");
                            Stream[5]=sc.readLine();

                        }
                        else if(op.equalsIgnoreCase("Humanities"))
                        {
                            Stream[2]="English";
                            Stream[3]="History";
                            Stream[4]="Geography";
                            System.out.println("\tEnter 2nd lang");
                            Stream[5]=sc.readLine();

                        }
                        else 
                        {
                            System.out.println("\tInvalid input");
                            System.exit(0);
                        }
                        k=6;
                    }
                    else 
                    {
                        System.out.println("\tNot eligible for admission");
                        System.exit(0);
                    }
                    System.out.println("Enter your choice for the Group 1 subjects:");
                    System.out.println("\t1. Mathematics\n\t2. Psychology\n\t3. Business Studies\n\t4. Physical Education.");
                    Stream[0]=sc.readLine();

                    System.out.println("\tEnter your choice for the Group 2 subjects:");
                    System.out.println("\t1. Computer Science\n\t2. Biology\n\t3. Legal Studies\n\t4. Home Science");
                    Stream[1]=sc.readLine();
                    output();
                    System.out.println("\tYour subjects are ");

                    for( i=2;i<k;i++)
                    {
                        System.out.println("\t"+Stream[i]);
                    }
                    System.out.println("\t"+Stream[0]+"\n\t"+Stream[1]);
                }
                else
                {
                    System.out.println("\tYour age is not suitable for the class you have choosen.\nPlease contact the school office");
                    System.exit(0);
                }
            }
        }
    }

    void fees()
    {
        if(clas>=1&& clas<=12)
            fees=1200+((clas*2)*100);
        else 
            fees=1200;
        

    }

    void output()
    {
        fees();
        System.out.println("\n");
        System.out.println("\tAdmission details successfully saved ");
        System.out.println("\tThe monthly fees is "+fees);
        System.out.println("\tYour unique ID is : "+ uid);
        System.out.println("\tYour email address is : "+ email);
        System.out.println("\tPassword for the email address is : "+(int) (Math.random()*10000));
        return ;

    }

    int age_calculator(String dob)

    {

        String dt=dob;
        String month,day,year,news;
        int li;
        String a[]=dt.split("/");int b[]=new int[a.length];

        if(Integer.parseInt(a[1])<=11)
        {
            b[1]= 11-Integer.parseInt(a[1]);
            b[2]=2024-Integer.parseInt(a[2]);
        }
        else
        {
            b[1]=12-Integer.parseInt(a[1]);
            b[2]=2024-Integer.parseInt(a[2])-1;
        }

        if(Integer.parseInt(a[1])>12||Integer.parseInt(a[1])>31)
        {
            return 1;
        }
        else
        {
            return b[2];
        }
    }

    void display()
    {
        if(run!=0)
        {
            for(int i=0;i<=run;i++)
            {
                System.out.println("\tDetails of student "+i);
                System.out.println("\tName : "+database[i][0]);
                System.out.println("\tFathers name : "+database[i][1]);
                System.out.println("\tMothes name : "+ database[i][2]);
                System.out.println("\tLocal gurdian : "+database[i][3]);
                System.out.println("\tDate of birth : "+database[i][4]);
                System.out.println("\tAddress : \n" +database[i][5]+",");
                System.out.println("\t"+database[i][6]+",");
                System.out.println("\t"+database[i][7]+",");
                System.out.println("\tPrimary cotact number : "+database[i][8]);
                System.out.println("\tPrimary cotact number : "+database[i][9]);
                System.out.println("\tBlood group : "+database[i][10]);
                System.out.println("\tGender : "+database[i][11]);
                System.out.println("vAllergic to : "+database[i][12]);
                System.out.println("\tCast : "+database[i][13]);
            }
        }
        else
        {
            System.out.println("\tThere is no admission for today!");
        }
    }

    public  void main (String args[])throws IOException 
    {
        int condition;
        String condition2;

        System.out.println("\t \t \t WELCOME TO ARCADIA INTERNATIONAL SCHOOL");
        do
        {
            System.out.println("\tEnter 1 if you want to enter anymore admission details or \n\t2 viewing the details of the admited student");
            condition=sc1.nextInt();
            switch (condition)
            {
                case 1:
                    System.out.println("\t \t \t Admission Form");
                    input();
                    try
                    {
                        Thread.sleep(1000);
                    }
                    catch(InterruptedException ob)
                    {
                        System.out.println("Not valid");
                    }
                    processing();
                    try
                    {
                        Thread.sleep(1000);
                    }
                    catch(InterruptedException ob)
                    {
                        System.out.println("Not valid");
                    }
                    admit();
                    try
                    {
                        Thread.sleep(1000);
                    }
                    catch(InterruptedException ob)
                    {
                        System.out.println("Not valid");
                    }
                    
                    break;
                case 2:
                    display();                    
                    break;
                default:
                    System.out.println("\tInvalid Input!");

            }
            try
            {
                Thread.sleep(1000);
            }
            catch(InterruptedException ob)
            {
                System.out.println("Not valid");
            }
            System.out.println();
            System.out.println("\tDo you want to terminate the program?");
            System.out.println("\tEnter yes or no");
            condition2=sc.readLine();
        }while(condition2.equalsIgnoreCase("no"));
    }

}