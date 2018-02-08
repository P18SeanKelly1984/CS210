package Solutions_2017;

//Find the Xth biggest number

import java.util.Scanner;

public class Lab2B_Xth_biggest_number
{
    public static void main(String args[] ) throws Exception 
    {
        Scanner sc = new Scanner(System.in);
        
        //Declare an array of the value of sc
        int[] a = new int[sc.nextInt()];
       
            for(int i = 0; i < a.length; i++) 
            {
                a[i] = sc.nextInt();
            }
            
            //Note: Use any sorting algorithm you wish or use Arrays.sort, but you will need to import a library
            a = insertion(a);
            
        System.out.println(a[a.length - sc.nextInt()]);
        
        sc.close();
      
    }
    
    //Insertion sort algorithm method.  Bubble sort and selection sort will also do the job
    public static int[] insertion(int[] a) 
    {
        for(int i = 0; i < a.length; i++) 
        {
            for(int j = i + 1; j < a.length; j++) 
            {
                if(a[i] > a[j]) 
                {
                    int temp = a[i];
                    a[i] = a[j];
                    a[j] = temp; 
                }
            }
        }
        return a;
    }
    
}
