//Binary search only works with sorted input.

import java.util.Scanner;

class  binSearch{
    public static void  binarySearch(int  arr[],  int  first,  int  last,  int  key){
        int  mid  =  (first  +  last)/2;
           while(  first  <=  last  ){    
                if  (  arr[mid]  ==  key  ){    
                    System.out.println("Element  is  found  at  index:  "  +  mid);    
                    break;    
                }
                else if  (  arr[mid]  <  key  ){    
                    first  =  mid  +  1;          
                }else{    
                      last  =  mid  -  1;    
                }    
                mid  =  (first  +  last)/2;    
          }    
          if  (  first  >  last  ){    
                System.out.println("Element  is  not  found!");    
          }    
      }    
      public  static  void  main(String  args[]){    
                    int n;
                    System.out.println("Enter size of array....");
                    Scanner sc = new Scanner(System.in);
                    n = sc.nextInt();
                    int  arr[] = new int[n] ;//=  {10,20,30,40,50};   
                    System.out.println("Now enter elements of array....");
                    for(int i = 0; i < n; i++) {
                        arr[i] = sc.nextInt();
                    }
                    System.out.println("Enter value to be searched....");
                    int  key = sc.nextInt();                    
                    int  last=arr.length-1;    
                    binarySearch(arr,0,last,key);          
      }    
    }  
