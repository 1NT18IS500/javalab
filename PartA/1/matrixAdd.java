/*Java Program to Add Two Matrix using Multi-dimensional Arrays, pass two dimensional array as parameter to the method*/
import java.util.*;

public class matrixAdd {
	static void sum(int [][] x,int [][] y, int row, int col)
	{
	 	int[][] res = new int[10][10];
		for(int i=0;i<row;i++)
			for(int j=0;j<col;j++)
			{
				res[i][j]=x[i][j]+y[i][j];
			}
		System.out.println("result :");
		for(int i=0;i<row;i++)
		{
			for(int j=0;j<col;j++)
			{
				System.out.print(+res[i][j]+" ");
			}
			System.out.println();
		}
	}
	public static void main(String[] args) {
		int i, j, rows, cols;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the matix size....\nNumber of rows : ");
		rows = sc.nextInt();
		System.out.println("Number of Cols : ");
		cols = sc.nextInt();
		int mat1[][] = new int[rows][cols];
		int mat2[][] = new int[rows][cols];
		int mat3[][] = new int[rows][cols];
		//Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Matrix 1 Elements : ");
		for(i=0; i<rows; i++)
		{
		    for(j=0; j<cols; j++)
		    {
		        mat1[i][j] = sc.nextInt();
		    }
		}
		
		System.out.println("Enter Matrix 2 Elements : ");
		for(i=0; i<rows; i++)
		{
		    for(j=0; j<cols; j++)
		    {
		        mat2[i][j] = sc.nextInt();
		    }
		}
		sum(mat1,mat2,rows,cols);
	}

}
