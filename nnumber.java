import java.util.*;
class nnumber
{
    public static void main(String args[])
    {
        int num;
        Scanner sc=new Scanner (System.in);
        System.out.println("Enter a number");
        num=sc.nextInt();
        for(int i=1;i<=num;i++)
        {
            System.out.println(i+"\n");
        }
    }
}