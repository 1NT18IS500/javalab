/*
 Design a java program with one method to put even & odd elements of
 an array in 2 separate arrays, and another method to find the 
 transpose of the matrix  by implementing  the concept of 
 method overriding.
*/
import java.util.*;

class transpose{
	void func() {           //funtion to find transpose of a matrix.
		int m,n,i,j;
		System.out.println("enter the no of rows and columns");
		Scanner obj=new Scanner(System.in);
		m=obj.nextInt();
		n=obj.nextInt();
		int [][]a=new int[m][n];
		int [][]b=new int[n][m];
		System.out.println("enter the elements of MATRIX :");
		for(i=0;i<m;i++) {
			for(j=0;j<n;j++) {
				a[i][j]=obj.nextInt();
			}
		}
		System.out.println("Transpose of matrix is:");
		for(i=0;i<m;i++) {
			for(j=0;j<n;j++) {
				b[j][i]=a[i][j];
			}
		}
		for(i=0;i<n;i++) {
			for(j=0;j<m;j++) {
			System.out.print(b[i][j]+"\t");	
			}
			System.out.println();
		}
	}
}
class evenodd extends transpose{
	void func() {           //funtion to separate even and odd.
		int m,i,k=0,l=0;
		System.out.println("enter the size of array");
		Scanner obj=new Scanner(System.in);
		m=obj.nextInt();
		    int []a=new int[m];
		    int []even=new int[m];
		    int []odd=new int[m];
		    System.out.println("enter the array elemnets:");
		    for(i=0;i<m;i++) {
		    	a[i]=obj.nextInt();
		    }
		    for(i=0;i<m;i++) {
		    	if(a[i]%2==0) {
		    		even[k]=a[i];
		    		k++;
		    	}
		    	else {
		    		odd[l]=a[i];
		    		l++;
		    	}
		    }
		    System.out.println("even array elements:");
		    for(i=0;i<k;i++) {
		    	System.out.print(even[i]+"\t");
		    }
		    System.out.println();
		    System.out.println("odd array elements:");
		    for(i=0;i<l;i++) {
		    	System.out.println(odd[i]+"\t");
		    } 
	}
}

public class funcOverr{
	public static void main(String[] args) {
		transpose a=new transpose();
		transpose b=new evenodd();
		    
		    a.func();
		    b.func();
	}
}
