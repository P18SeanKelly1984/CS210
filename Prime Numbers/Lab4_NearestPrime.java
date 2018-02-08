package Previous_Labs;

//Find the nearest prime to n
//My answer uses the Sieve of Eratosthenes

import java.util.Scanner;

public class Lab4_NearestPrime
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		//As we don't know how big the prime nearest to n is, we have to make our array quite large
		int size = n*n; 

		//make the sieve a boolean array
		boolean sieve[] = new boolean[size];
		sieve[0] = false;
		sieve[1] = false;
		
		for(int i = 2; i < size; i++)
		{
			//Set every element to true except index 0 and 1
			sieve[i] = true; 
		}
		
		//give record the value of the inputed number
		int record = n; 
		
		//initialise the variable answer
		int answer = 0;

		//starting the array at element 2 to begin search for prime numbers
		for(int i = 2; i < size; i++)
		{
			if(sieve[i] == true) 
			{
				//If the distance between the current prime 
				//and n is less than the record shortest distance
				if(Math.abs(n - i) < record)
				{ 
					//Update the record
					record = Math.abs(n - i); 
					answer = i;
				}
				else
				{
					//If the distance ever gets bigger than the record 
					//then you're past the shortest possible distance
					break;
				}

				//When we've found a prime, set every multiple of that prime to false
				for(int j = i+i; j < size; j+= i)
				{
					sieve[j] = false;
				}					
			}						
		}
		
		System.out.println(answer);
		sc.close();
	}
}