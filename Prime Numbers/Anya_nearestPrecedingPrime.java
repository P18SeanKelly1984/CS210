package Solutions_2017;
import java.util.Scanner;

public class Anya_nearestPrecedingPrime 
{
	public static void main(String[] args) 
	{
	Scanner sc = new Scanner(System.in);
	int n = sc.nextInt();
	sieveOEApproach(n);
	secondApproach(n);
	
	sc.close();
	}
	
	public static void sieveOEApproach (int n) 
	{
		//As we don't know how big the nth prime number is, sieve is not the best approach
		//but if you decided use it then
		//we have to make our array quite large ( 2n is enough, you could look
		//up for "Bertrand's postulate"
		boolean sieve[] = new boolean[2*n];
		
		// no need to set 0 and 1 to false since they`re false by default 
		for(int i = 2; i < sieve.length; i++)
		{
			//Set every element to true except index 0 and 1
			sieve[i] = true; 
		}
			
			//The same as for ( int i = 1; i < Math.sqrt(sieve.length); i++) but faster
			for ( int i = 1; i*i < sieve.length; i++ ) 
			{ 	
				//No need to check after sqrt(size)
				if (sieve[i]) 
				{ 
					//If prime => check multiples of prime
					for ( int j = i + i; j < sieve.length; j += i) 
					{  
						//Iterate through multiples and set them to false
						sieve[j] = false; 
					}
				} 
			}
			
			// save nearest prime to n in the first half (before) => 
			int firstHalfPrime = 0;
			
			for (int i = sieve.length/2 - 1; i > 2; i-- ) 
			{
				//If a prime is found
				if (sieve[i])  
				{
				firstHalfPrime = i; // save it
				break; // break immediately after finding nearest prime
				}
			}
			
			// save nearest prime to n in the second half (after) => 
			int secondHalfPrime = 0;
			int j = sieve.length/2 + 1;
			
			
			while (true) 
			{ // infinite loop
				
				if (sieve[j]) 
				{ // found prime 
					secondHalfPrime = j; // save it
					break; // break immediately after finding nearest prime
				}
				j++; // if not continue iterating
			}
			
			// if input is prime print the difference between nearest in the second one and n
			if (sieve[n]) 
			{  
				System.out.println(secondHalfPrime-n);
			} 
			
			else  
			{ // else print the difference between two nearest primes
				System.out.println(secondHalfPrime - firstHalfPrime);
			}
	
	}
	
	
	public static void secondApproach(int n) 
	{ 
	int firstHalfPrime = 0;
	
		for (int i = n - 1; i > 2; i-- ) 
		{
			if (isPrime(i)) 
			{ // found prime
			firstHalfPrime = i; // save it
			break; // break immediately after finding nearest prime
			}
		}
		
	int secondHalfPrime = 0;
	
	int j = n + 1;
	
	while (true) 
	{ // infinite loop
		if (isPrime(j)) 
		{ // found prime 
			secondHalfPrime = j; // save it
			break; // break immediately after finding nearest prime
		}
		
		// if not continue iterating
		j++; 
	}
	
	// if input is prime print the difference between nearest in the second one and n 
		if (isPrime(n)) 
		{ 
			System.out.println(secondHalfPrime - n);
		} 
	
		else 
		{ // else print the difference between two nearest primes
			System.out.println(secondHalfPrime - firstHalfPrime);
		}
	}
	
	public static boolean isPrime(int n) 
	{ 
		if ( n == 2 ) return true;
		
		if ( n % 2 == 0 ) return false;
		
			for (int i = 3; i * i <= n; i += 2 ) 
			{
			if (n % i == 0) return false;
			}
			
		return true;
	}
}

