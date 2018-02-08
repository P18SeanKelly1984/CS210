package Solutions_2017;

import java.util.Scanner;

/**Number of primes under a limit 

Problem Statement

The goal is to read in a number N and output the number of primes below that number. 
For example, if N is 11, then output 4, because there are 4 primes below 11, namely, 
2, 3, 5, and 7.

Input Format
An integer N.

Output Format
The number of primes below N. 

Constraints
2≤N≤1000 

Sample Input
20

Sample Output
8

Explanation
There are 8 primes smaller than 20.

They are 2, 3, 5, 7, 11, 13, 17, and 19.
**/
public class Lab4B_Num_Primes_Under_Limit
{

	public static void main(String args[] ) throws Exception 
	{
		Scanner sc = new Scanner(System.in);

		int count = 0;

			//Begin the search from the value of sc downwards to 2 
    		for(int i = sc.nextInt() - 1; i >= 2; i--) 
    		{
    			//Add up the prime numbers with a counter
       			if(isPrime(i)) 
       			{
       				count++;       				
       			}
   			}

			System.out.print(count);
			
			sc.close();
    }

	//Use a method to search for prime numbers
	public static boolean isPrime(int x) 
	{
    	for(int i = 2; i <= Math.sqrt(x); i++) 
    	{
     	   if(x % i == 0) return false;
    	}
   	 	return true;
	} 

}