import java.util.*;
public class tri123 
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter thr number");
        int a=sc.nextInt();
        sc.nextLine();
        int b=a,z=1;
        for(int i=0;i<a;i++)
        {
            for(int k=0;k<(b-1);k++)
            {
                System.out.print(" ");
            }
            b=b-1;
            for(int j=(i+1);j>0;j--)
            {
                System.out.print(j);
            }
            for(int l=0;l<=(i-1);l++)
            {
                System.out.print(l+2);
            }
            System.out.println();
        }
    }
}
