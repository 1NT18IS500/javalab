import java.util.*;
import java.io.*;
interface happy{
	interface number{
		void CheckHappy(int n);
	}
}
class Test implements happy.number{
  public void CheckHappy(int n) {
	 int x,l,k,want;
	 int key=n;
	 do {
		 want=0;
		 while(n!=0) {
			 l=n%10;
			 n=n/10;
			 want+=l*l;
			 //n=x;
		 }
		// System.out.println(want);
		 n=want;
	 }while(want>=10);
	 if(want==1)
	 System.out.println("the number "+key+ " is happy number");
	 else
		 System.out.println("the number is not happy number");
  }
}
class happyNumber{
	public static void main(String []args) {
		Scanner o=new Scanner(System.in);
		  System.out.println("enter the number:");
			int n=o.nextInt();
			Test obj=new Test();
			obj.CheckHappy(n);

	}
}
