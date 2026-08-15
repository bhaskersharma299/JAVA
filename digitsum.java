import java.util.*;
class digitsum
{
    public static void main(String args[])
    {
        int num,sum=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number ");
        num=sc.nextInt();
        while(num>0)
        {
            sum+=num%10;
            num/=10;
        }
        System.out.println("The sum of digits is "+sum);
    }
}