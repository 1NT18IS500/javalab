/*
Design a java code  to accept a value for ‘n’ and calculate 
the total number of all possible squares in a square matrix.
*/
import java.util.Scanner;

public class allPossibleSquares 
{
    public static void main(String[] args) 
	{
		    Scanner in=new Scanner(System.in);
		    System.out.print("Enter the size of square Matrix : ");
			int n=in.nextInt();
			if(n<=0)
				System.out.println("invalid input");
			else
			{
				int sum=0;
				while(n!=0)
				{
					sum=sum+n*n;
					n--;
				}
				System.out.println("The total possible square matrices is : " +sum);
			}
	}
}