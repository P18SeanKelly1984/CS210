package Solutions_2017;

//Find the outlier of 3 numbers
import java.util.Scanner;

public class Lab2A_find_outlier 
{
    public static void main(String args[] ) throws Exception 
    {
        Scanner scan = new Scanner(System.in);
        
        //Input three numbers
        int num1 = scan.nextInt();
        int num2 = scan.nextInt();
        int num3 = scan.nextInt();
        
        //Add up the three numbers and divide by three to find the average value
        int avg = (num1+num2+num3)/3;
        
        //Find how far each number is from the average value
        int OneDiff = Math.abs(num1 - avg);
        int TwoDiff = Math.abs(num2 - avg);
        int ThreeDiff = Math.abs(num3 - avg);
        
        //Call an output for each possible result
        if (OneDiff > TwoDiff && OneDiff > ThreeDiff) 
        {
            System.out.println(num1);
        }
        
        else if (TwoDiff > OneDiff && TwoDiff > ThreeDiff) 
        {
            System.out.println(num2);
        }
        
        else if (ThreeDiff > TwoDiff && ThreeDiff > OneDiff) 
        {
            System.out.println(num3);
        }
        
        else 
        {
            System.out.println("NA");
        }
        
        //Without this there may be possible memory leaks, but this feature isn't required in Hackerrank
        scan.close();
    }
}