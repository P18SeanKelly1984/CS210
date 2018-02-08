package Previous_Labs;

//Find the number in a list of numbers that is closest to the average of those numbers

import java.util.Scanner;

public class Lab3_ClosestToAverage
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);

		int size = sc.nextInt();
		int arr[] = new int[size];
		double sum = 0;

		for(int i = 0; i < size; i++)
		{
			//Type in the integer values
			arr[i] = sc.nextInt();
			
			//Add up the sum of the values in the array elements
			sum += arr[i];
		}
		
		//Calculate the average
		double avg = sum / size; 

		/**
		Set the record equal to the first distance from the average.
		Search begins at element 0
		abs == absolute value becomes a positive, can never be a negative.  Square value
		and then square root
		**/
		double record = Math.abs(arr[0] - avg); 
		int index = 0;

		for(int i = 1; i < size; i++)
		{
			//Cycle through to find the closest
			double temp = Math.abs(arr[i] - avg);
			
			
			if(temp < record)
			{ 
				//When closest to average is found as temperature, the value is transfered to record
				record = temp;
				
				//Give index the closest to average value
				index = i;
			}
		}
		
		//When closest to average is found and value is transfered to index print out that array element
		System.out.println(arr[index]);
		
		sc.close();
	}
}