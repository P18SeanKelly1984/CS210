package Sorting;

import java.util.Scanner;
public class BinarySearchIterative
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int arr[] = {1, 3, 5, 6, 10, 23};
		int key = sc.nextInt();

		System.out.println(search(arr, key));
		sc.close();
	}

	//Find if it is odd or even
	public static boolean search(int[] arr, int key)
	{
		int lower = 0, upper = arr.length -1;
		int middle = (lower + upper) / 2;

		while(lower <= upper)
		{
			middle = (lower + upper) / 2;

			if(arr[middle] == key)				
			{
				return true;
			}

			//Disregard the upper half
			else if(key < arr[middle]) 
			{
				upper = middle - 1;
			}

			//Disregard the lower half
			else 
			{
				lower = middle + 1;
			}

		}
		return false;
	}
}