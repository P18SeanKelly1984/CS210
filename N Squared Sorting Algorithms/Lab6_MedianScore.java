package Previous_Labs;

/*
 * Read in a list of student names and their test scores and output 
 * the name of the student with the median score.
 * You can assume that the number of students will always be odd.
*/
import java.util.Scanner;
public class Lab6_MedianScore
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);

		//Call in the length of the list
		int n = sc.nextInt();
		
		//This array will hold the names
		String arr1[] = new String[n]; 
		
		//This array will hold the scores
		int arr2[] = new int[n]; 

		//Scan in the name of the student with their 
		//student score for each for loop cycle
		for(int i = 0; i < n; i++)
		{
			arr1[i] = sc.next();
			arr2[i] = sc.nextInt();
		}
		
		//Insertion sort
		for(int i = 0; i < n; i++)
		{ 
			//begin the search by giving record one of the search values
			int record = i;
			
			for(int j = i; j < n; j++)
			{
				if(arr2[j] < arr2[record])
					
					//Keep track of the smallest score
					record = j; 
			}
			
			//Perform two identical swaps on the arrays
			//One for the integers and another for the strings
			int temp1 = arr2[i];
			arr2[i] = arr2[record];
			
			//This will order the score 
			arr2[record] = temp1; 

			//Swap the strings
			String temp2 = arr1[i];
			arr1[i] = arr1[record];
			
			//This will order the names
			arr1[record] = temp2; 
		}

		//Find the index for the middle
		int middle = (arr1.length + 1)/ 2; 
		System.out.println(arr1[middle - 1]);
		sc.close();
	}
}