import java.util.*;
class factorial
{
    public static void main(String args[])
    {
        int num,fact=1;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number ");
        num=sc.nextInt();
        for(int i=1;i<=num;i++)
        {
            fact*=i;
        }   
        System.out.println("The factorial of the number is "+fact);
    
     }
}