package Previous_Labs;

	//Find the nth prime
	//My answer uses the Sieve of Eratosthenes

	import java.util.Scanner;

public class Lab4_nth_prime
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		//As we don't know how big the nth prime number is, 
		//we have to make our array quite large
		int size = n*n;
		
		boolean sieve[] = new boolean[size];
		sieve[0] = false;
		sieve[1] = false;
		
		for(int i = 2; i < size; i++)
		{
				//Set every element to true except index 0 and 1
				sieve[i] = true; 
		}

			int count = 0;
			
			boolean check = false;
	
			int i = 2;
			
			while(check == false)
			{
				if(sieve[i] == true)
				{
					//Keep track of how many prime numbers we've found
					count++; 
					
					//When we've found the nth prime number we print it and stop the loop
					if(count == n) 
					{	
						System.out.println(i);
						check = true;
					}
					
					else 
					{
						//When we've found a prime, set every multiple of that prime to false
						for(int j = i+i; j < size; j+=i)
						{
							
							sieve[j] = false;
						}
					
					}
					
				}
				
			i++;
		}
		sc.close();
	}
}




