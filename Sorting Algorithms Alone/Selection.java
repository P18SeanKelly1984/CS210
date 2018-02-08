package Sorting;

import java.util.Arrays;

public class Selection
{
	//Selection sort method
	public static int[] selection(int[] arr)
	{ //ascending order

		for(int i = 0; i < arr.length; i++)
		{
			int record = i;
			
			//Iterate from the current element to the end of the array
			for(int j = i; j < arr.length; j++) 
				if(arr[j] < arr[record])
				{
					//Keep a track of the smallest number found so far	
					record = j; 				
				}
			
			//Swap the current element with the smallest number found
			int temp = arr[i];
			arr[i] = arr[record];
			arr[record] = temp;
		}
		return arr;
	}
	//Example
	public static void main(String args[])
	{
		int arr[] = {3, 1, 56, 7, 13, 21, 2};
		arr = selection(arr);

		System.out.print(Arrays.toString(arr)); // 1 2 3 7 21 56
	}
}