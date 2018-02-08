package Solutions_2017;

import java.util.Scanner;

/**Spacing between primes 

Problem Statement

The goal is to read in a number N and output the distance between the prime number that 
precedes it, and the prime that follows it. If the number itself happens to be prime, 
then output the distance to the subsequent prime. For example, if N is 7, then output 4, 
because the next prime is 11, which is 4 away.

Input Format

An integer N. 

Output Format

The distance between the preceding and subsequent prime number at N. 

Constraints
2≤N≤1000
 
Sample Input
10

Sample Output
4
**/
public class Lab4A_Primes_Distance
{
    public static void main(String args[] ) throws Exception 
    {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        //create an array of numbers the size of n
        int[] primeArray = new int[n];  

        int primeCount = 1;

        primeArray[0] = 2;
        
        //Count up the prime numbers using N multiplied by 2 for width of search
        for (int i = 2; i < (n * 2); i++)
        {
        	//set all after 2 true by default
            boolean primeTest = true;

            //find those numbers that are not prime
            for (int j = 0; j < primeCount && primeTest; j++)
            {
            	//if the number modulus equals 0 it is not 0
                if (i % primeArray[j] == 0)
                {
                    primeTest = false;
                    
                    //why is this here?  Added efficiency?
                    j = primeCount;
                }
            }
            
            //why bother with this bit of code?
            if (primeTest)
            {
                primeArray[primeCount] = i;
                primeCount++;
            }           
        }

        int higher = 0;
        int lower = 0;

        //Find the prime numbers before and after
        for (int i = 0; i < primeCount; i++)
        {
            if (primeArray[i]>n)
            {
                higher = primeArray[i];

                lower = primeArray[i - 1];

                i = primeCount;
            }
        }    

        //Find the distance from the Nth prime and preceding prime
        int diff = higher - lower;

        System.out.println(diff);

        sc.close();
    }
}