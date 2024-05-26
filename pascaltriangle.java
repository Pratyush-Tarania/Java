import java.util.*;
public class pascaltriangle
{
    public static void main(String args[])
    {
        int count=0;
        Scanner sc=new Scanner (System.in);
        System.out.println("Enter the value of N");
        int n=sc.nextInt();
        sc.nextLine();
        if (n==0)
        {
            count=1;
        }
        else if (n==1)
        {
            count=2;
        }
        else
        {
            for (int i=1;i<=n;i++)
            {
                count++;
            }
        }
        int arr[][]=new int[n][n];
        int l=count/2;
        for (int i=0;i<n;i++)
        {
            for (int j=0;j<=i;j++)
            {
                if(j==0 || j==i)
                {
                    arr[i][j]=1;
                }
                else
                {
                    arr[i][j]=arr[i-1][j-1]+arr[i-1][j];
                }
            }
         
        }
        for (int i=0;i<n;i++)
        {
            for(int k=0;k<n-i-1;k++)
                {
                    System.out.print(" ");

                }
            for (int j=0;j<=i;j++)
            {
                
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
            count=count-1;
        }

        

        

        

    }
    
}

