package Previous_Labs;

//Sort a list of words in order of their size, if words
//are the same size, order them in alphabetical order.

import java.util.Scanner;
public class Lab6_SortWords
{
	private static Scanner sc;

	public static void main(String args[])
	{
		sc = new Scanner(System.in);

		//input the size of the array and first name
		int n = sc.nextInt(); sc.nextLine();
		String arr[] = new String[n];

		//input names
		for(int i = 0; i < n; i++)
			arr[i] = sc.nextLine();

		//Insertion sort
		for(int i = 0; i < n; i++)
		{ 
			//Give record an initial value of i, being 0
			int record = i;
			
			//for loop search to track smallest
			for(int j = i; j < n; j++)
			{
				if(arr[j].length() < arr[record].length())
					
					//smallest found held in element j
					record = j; 
			}
			
			
			//make a temp duplicate of i
			String temp = arr[i];
			
			//Place the value of i into record
			arr[i] = arr[record];
			
			//Performing the swap
			arr[record] = temp; 

			//If two words are the same length, put them in alphabetical order
			if(i > 0 && arr[i].length() == arr[i - 1].length())
			{ 
				//Compare to used to sort alphabetically 
				if(arr[i].compareTo(arr[i - 1]) < 0)
				{
					//Swapping values using a temp
					String x = arr[i - 1];
					arr[i - 1] = arr[i];
					arr[i] = x;
				}
			}
		}
		
		//Print out the sorted list
		for(int i = 0; i < n; i++)
		{
			System.out.print(arr[i] + " ");
		}
			
	}
}