package Solutions_2017;

import java.util.Scanner;

/**
Problem Statement

Write a recursive method that takes in a bank account balance x, an interest
rate i and a number of years y, and outputs how much the bank account will be
worth after y years. For example, if you invest €100 at 2% annual interest,
then after year 1 you have €102.00, after year 2 you have €104.04, after year
3 you have €106.12 and so forth.

Input Format
The main method, which is already written, takes in a bank account balance as
a double, x, interest percentage rate as a double, i, and the number of years
for which it is being invested, y.

Output Format
A double representing how much the bank account is worth after y years, correct
to two decimal places.

Constraints
1 ≤ y ≤ 30
0.0% ≤ i ≤ 100.0%
0 ≤ x ≤ 1000000

Sample input
7
1.3
100

Sample output
109.46

**/
public class Lab10B1_Compounding_Recursive
{
    public static void main(String args[] )
    {
        Scanner sc = new Scanner(System.in);

        //The number of investment years
        int y = sc.nextInt();
        
        //The interest rate percentage
        double i = sc.nextDouble();
        
        //Initial bank account balance
        double x = sc.nextDouble();

        //Print out the percentage result to two floating point units
        System.out.println(String.format( "%.2f", compound(y,i,x)));
        
        sc.close();
    }

    public static double compound(int y, double i, double x)
    {   
    	//If there are zero investment years the value of x remains the same
    	if(y == 0)
    	{
            return x;    		
    	}

		double factor = (i/100) + 1;
		
		//Count down the number of years each cycle
		int one = y - 1;
		
		//two is the interest rate percentage
		double two = i;	
		
		//three is the bank account balance
		double three = x;
		
		//send back the compounding interest result
		return (factor*compound(one, two, three));
    }
}