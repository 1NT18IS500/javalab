import java.util.Scanner;

public class calc 
{
	public static void main(String[] args) 
	{
		Scanner in=new Scanner(System.in);
		int ch=0;
		do
		{
			System.out.println("Please enter value for first operand : ");
			double a=in.nextDouble();
			System.out.println("Please enter value for second operand : ");
			double b=in.nextDouble();
			System.out.println("Select the operation to be performed");
			System.out.println("1. Addition");
			System.out.println("2. Subtraction");
			System.out.println("3. Multiplication");
			System.out.println("4. Division");
			System.out.println("5. Exit");
			
			System.out.print("Enter the option : ");
			ch=in.nextInt();
			switch(ch)
			{
                case 1:
                    System.out.println("The addition of two numbers is : " +(a+b));
                    break;
                case 2:
                    System.out.println("The subtraction of two numbers is : " +(a-b));
                    break;
                case 3:
                    System.out.println("The multiplication of two numbers is : " +(a*b));
                    break;
                case 4:
                    System.out.println("The division of two numbers is : " +(a/b));
                    break;
                default:
                    System.out.println("Please input right option......");
			}
		}
		while(ch!=5);
	}
}
