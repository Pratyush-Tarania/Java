import java.util.*;
public class evenfibbo 
{
    public static void main(String arg[])
    {
        int b=1,c=1;int sum=0;
        Scanner sc=new Scanner (System.in);
        System.out.println("Enter the number");
        int a=sc.nextInt();
        sc.nextLine();
        a=2*a;
        int arr[]=new int[a];
        for(int i=0;i<arr.length;i++)
        {
            if(i==0||i==1)
            {
                arr[i]=1;

            }
            else
            {
                arr[i]=arr[i-2]+arr[i-1];
            }
        }
        for(int i=0;i<arr.length;i++)
        {
            if(i%2!=0)
            {
                sum=sum+arr[i];

            }
            else
            {
                continue;
            }
        }
        System.out.println("Sum of even indexes are="+sum);

            

        }

        }

    

    

