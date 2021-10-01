import java.util.*;
import java.io.*;

class createPass{
    public static void main(String args[])
    {
	Scanner sc = new Scanner(System.in);
	System.out.println("Roomno....");
        String roomno = sc.nextLine();
	System.out.println("PhoneNo....");
        String phoneno = sc.nextLine();
	System.out.println("Name....");
        String username = sc.nextLine();
        String password;
        String a = " " , b = " ",c = " ";
        int l=username.length();
        a=phoneno.substring(0,1);
        b=username.substring(l-3,l);
	c = roomno.substring(1,2);
        password= '$'+c+a+b;
        System.out.println("password: " +password);
    }
}
