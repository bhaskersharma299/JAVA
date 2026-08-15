import java.util.*;
class calculator
{
    public static void main(String args[])
    {
        int choice;
        int num1,num2;
        Scanner sc=new Scanner(System.in);
        System.out.println("1. Addition\n2. Subtraction\n3. Multiplication\n4. Division");
        System.out.println("Enter your choice:");
        choice=sc.nextInt();
        System.out.println("Enter two numbers:");
        num1=sc.nextInt();
        num2=sc.nextInt();
        switch(choice)
        {
            case 1:
                System.out.println("Result :"+(num1+num2));
                break;
            case 2:
                System.out.println("Result :"+(num1-num2));
                break;
            case 3:
                System.out.println("Result :"+(num1*num2));
                break;
            case 4:
                if(num2!=0)
                    System.out.println("Result :"+(num1/num2));
                else
                    System.out.println("Error: Division by zero is not allowed.");
                break;
            default:
                System.out.println("Invalid choice");
        }
    }
}