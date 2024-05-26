import java.util.Scanner;
public class complex 
{
   // int count=0,realsum=0,compsum=0;;
   
    public static int realreturn(String a)
    {
        String real="";int count=0;int realpart;
        
        for (int i=0;i<a.length();i++)
        {
            if(a.charAt(i)!='+')
            {
                real=real+a.charAt(i);
                count=i;
            }
            else
            {
                break;
            }
        }
        realpart=Integer.parseInt(real);      
        return realpart;

    }
    public static int compreturn(String a)
    {
        String com="";int comppart,count=0;
        for (int i=0;i<a.length();i++)
        {
            if(a.charAt(i)!='+')
            {
                count++;
            }
            else
            {
                break;
            }
        }
        for (int i=(count+1);i<a.length();i++)
        {
            if(a.charAt(i)!='i')
            {
                com=com+a.charAt(i);
            }
            else
            {
                break;
            }
        }
        comppart=Integer.valueOf(com);
        return comppart;

        
    }
    public static void main(String args[])
    {
        int realsum=0,compsum=0;
        Scanner sc= new Scanner (System.in);
        System.out.println("Enter the no. of numbers to enter");
        int no=sc.nextInt();
        sc.nextLine();
        for (int i=0;i<no;i++)
        {
            System.out.println("Enter the complex number");
            String a= sc.nextLine();
            realsum=realsum+realreturn(a);
            compsum=compsum+compreturn(a);
        }
        System.out.println("The sum of real part is= "+realsum);
        System.out.println("The sum of complex part is= "+compsum+"i");
        


    }

    
}
