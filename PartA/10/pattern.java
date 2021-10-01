import java.util.Scanner;

public class pattern 
{
	public static void main(String[] args) 
	{
		Scanner in=new Scanner(System.in);
		System.out.print("Enter the number of levels for the number pyramid : ");
		int r=in.nextInt();
		for(int i=0;i<r;i++)
		{
			int k=i+1;
			for(int j=0;j<2*r-1;j++){
				if(i+j>=r-1 && i-j<=r-1 && i-j>=-(r-1))		
				{
					System.out.print(k);
					if(j>r-2)
						k--;
					else
						k++;
				}
				else
					System.out.print(" ");
			}
			System.out.println();
		}
	}
}
