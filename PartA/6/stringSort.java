import java.util.*;

public class stringSort{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		String []words= new String[5];
        System.out.println("Enter names");   
                   
        for (int i = 0; i < 5;i++){
            words[i] = sc.nextLine();
        }

        int tp = 0;
        for(int i=0;i<5-1;i++){
            tp = i;
            for(int j = i+1; j< 5; j++){
                if(words[tp].compareTo(words[j]) > 0 ){   	
	//If first string is lexicographically greater than second string, it returns positive number (difference of character value)
                    tp = j;
                }
            }
            if(tp!=i){
                String temp = words[tp];
                words[tp] = words[i];
                words[i] = temp;
            }
        }
	System.out.println("\nLexicographical order is :");
        for(int i=0;i<5;i++)
           	System.out.print(words[i]+ "\n");
	}
}
