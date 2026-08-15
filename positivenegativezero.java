import java.util.*;
class positivenegativezero 
{
    public static void main(String args[])
    {
        int n;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a no.");
        n=sc.nextInt();
        if(n>0)
        {
            System.out.println("The no. is positive");
        }
        else if(n<0)
        {
            System.out.println("The no. is negative");
        }
        else
        {
            System.out.println("The no. is zero");
        }
    }
}
