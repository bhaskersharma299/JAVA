import java.util.*; 
class leapyear
    {
    public static void main(String args[])
    {
        int year;
        Scanner sc=new Scanner (System.in);
        System.out.println("Enter a year ");
        year=sc.nextInt();
        if(year%4==0 && year%100!=0 || year%400==0)
        {
            System.out.println("The year is a leap year");
        }
        else
        {
            System.out.println("The year is not a leap year");
        }
    }
}
