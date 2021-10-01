import java.util.*;
public class digitSum {
	static void sum(int no)
	{
        int n=no;
		int sum=0;
	
        while(n!=0)
        {
            sum=sum+n%10;
            n=n/10;
        }
        if(sum<10){
            System.out.print("The sum of digits of entered number is : ");
            System.out.println(sum);
        }
        else
            sum(sum);
    }
/*
int sum = 0;  
	    while(num > 0 || sum > 9) 
	    { 
	        if(num == 0) 
	        { 
	            num = sum; 
	            sum = 0; 
	        } 
	        sum += num % 10; 
	        num /= 10; 
	    } 
        System.out.print(sum);
*/
	public static void main(String[] args)
	{
		Scanner userInput=new Scanner(System.in);
		System.out.print("Enter a number - ");
		int num= userInput.nextInt();
		sum(num);
    }
}