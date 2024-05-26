import java.util.*;
public class changeToBinary
{
    public static void main(String args[])
    {
        int b;
        String sum="";        
        Scanner sc= new Scanner (System.in);
        System.out.println("Enter the decimal value");
        int a= sc.nextInt();
        while(a>0)
        {
            b=a%2;
            a=a/2;
            sum=sum+String.valueOf(b);
        }
        System.out.println(sum);
        
        String real="";
        for(int i=0;i<sum.length();i++)
        {
            real=real+sum.charAt((sum.length()-1)-i);
        }
        System.out.println(real);

    }

    
}
