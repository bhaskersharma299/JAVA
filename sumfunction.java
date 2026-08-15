import java.util.*;
class sumfunction
{
    public static void add(int a,int b)
    {
        System.out.println(a+b);
    }
    public static void main(String args[])
    {
        int a,b;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter 2 no. : ");
        a=sc.nextInt();
        b=sc.nextInt();
        add(a,b);   
    }
}