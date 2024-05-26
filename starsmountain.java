import java.util.*;
public class starsmountain 
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the rows");
        int a=sc.nextInt();
        sc.nextLine();
        int b=a;
        for(int i=1;i<=a;i++)
        {
            for(int j=0;j<(b-1);j++)
            {
                System.out.print(" ");
            }
            b=b-1;
            for(int k=0;k<((2*i)-1);k++)
            {
                System.out.print("*");
            
            }
            System.out.println();
        }
    }
    
}
