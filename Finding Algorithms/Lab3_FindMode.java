package Previous_Labs;

//Find the number that occurs the most in a list of numbers

import java.util.Scanner;
import java.util.Arrays;

public class Lab3_FindMode
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		
		//type in the size of the array and make a copy
		int size = sc.nextInt();
		int arr[] = new int[size];
		int copy[] = new int[size];

		//type in the values for each array element and store in the copied array
		for(int i = 0; i < size; i++)
		{
			arr[i] = sc.nextInt();
			copy[i] = arr[i];
		}

		//Sort the array in ascending order numerically
		Arrays.sort(arr); 

		//declare three integers
		int count = 0, record = 0, recordnumber = 0;

		//Because the array is sorted you only have to iterate through it once
		for(int i = 0; i < size - 1; i++)
		{ 
			//Count how many times a number occurs that is of the same value
			if(arr[i] == arr[i + 1])
			{			
				count++; 
						
				if(count > record)
				{
					//Update the number that's occurring the most as you go
					record = count; 
					recordnumber = arr[i];
				}
				//If two numbers occur the same amount of times
				else if(count == record)
				{ 
					//Check which one came first in the original array
        			for(int j = 0; j < copy.length; j++)
        			{ 

            			if(copy[j] == recordnumber)
            			{
            				break;
            			}         				

            			//If the new number occurs first make it the new mode
            			if(copy[j] == arr[i])
            			{ 
                				recordnumber = arr[i];
                				break;
            			}
        			}
        		}
			}
			else
			{
				count = 0;
			}
				
		}
		System.out.println(recordnumber);
		sc.close();
	}
}