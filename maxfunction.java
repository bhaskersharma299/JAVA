import java.util.*;
class maxfunction
{
    public static void max(int a,int b)
    {
        if(a>b)
        {
            System.out.println(a+" is the greatest");
        }
        else
        {
            System.out.println(b+" is the greatest");
        }
        
    }
    public static void main(String args[])
    {
        int a,b;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter 2 no. : ");
        a=sc.nextInt();
        b=sc.nextInt();
        max(a,b);   
    }
}