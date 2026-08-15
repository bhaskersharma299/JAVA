import java.util.*;
class fibonacci
{
    public static void main(String args[])
    {
        int n,f,f0=0,f1=1;
        Scanner sc=new Scanner (System.in);
        System.out.println("Enter a number ");
        n=sc.nextInt();
        for(int i=0;i<n;i++)
        {
            System.out.println(f0+"\t");
            f=f0+f1;
            f0=f1;
            f1=f;
        }
    }
}