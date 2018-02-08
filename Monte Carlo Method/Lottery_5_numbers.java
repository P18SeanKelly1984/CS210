package Practice;

// Generate 7 lottery numbers ranging from 1 to 46
// Print out the probability a number less than 10 is generated
// Next print out probability all numbers are less than arbitrary number

public class Lottery_5_numbers 
{
		public static void main(String args[])
		{
			int size = 7;			
			int array[] = new int[size];			
			double simulations = 1000000; 
			
			//use both integers as boolean operations
			boolean success = true; int totalSuccess = 0;
			
			for(int j = 0; j < simulations; j++)
			{   
				//for each iteration, success needs to be reset to 1
				success = true;
				
				//randomly generate the numbers
				for(int i = 0; i < size; i++)
				{
					array[i] = (int)(Math.random()*45) + 1;
					
					//if all numbers in i for loop are greater than 36,
					//set success to 0
					if(array[i] > 36)
					{
						success = false;					
					}							
				}				
				//if success is true use it to calculate total successes
				if(success)
				{
					totalSuccess++;
				}			
			}			
			//print out the number of total successes
			System.out.println(totalSuccess);
			
			//calculate the percentage of total successes
			int result =(int) (Math.round((totalSuccess/simulations)*100));
				
			System.out.println(result +"%");	
		}	
}
