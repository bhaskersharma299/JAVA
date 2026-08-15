import java.util.*;
class primecheck
{
    public static void main(String args[])
    {
        int n,isprime=1;
        Scanner sc=new Scanner (System.in);
        System.out.println("Enter a number ");
        n=sc.nextInt();
        
        if(n<2)
        {
            isprime=0;
        }
        else
        {
            for(int i=2;i*i<=n;i++)
            {
                if(n%2==0)
                {
                    isprime=0;
                }
            }
        }
        if(isprime==1)
        {
            System.out.println("The no. is prime");
        }
        else
        {
            System.out.println("The no. is not prime");
        }
    }
}
