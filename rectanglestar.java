import java.util.*;
public class rectanglestar 
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter length");
        int l=sc.nextInt();
        System.out.println("Enter breadth");
        int b=sc.nextInt();
        sc.nextLine();
        for(int i=0;i<b;i++)
        {
            if(i==0||i==(b-1))
            {
                for(int j=0;j<l;j++)
                {
                    System.out.print("*");
                }
            }
            else
            {
                for(int j=0;j<l;j++)
                {
                    if(j==0||j==(l-1))
                    {
                        System.out.print("*");
                    }
                    else
                    {
                        System.out.print(" ");
                    }
                }
            }
            System.out.println();
        }

    }
    
}
