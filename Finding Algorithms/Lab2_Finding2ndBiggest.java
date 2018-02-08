package Previous_Labs;

/*
 * Find the second biggest number in the list of numbers given.
 * Each number is unique.
*/

import java.util.Arrays;
import java.util.Scanner;

public class Lab2_Finding2ndBiggest
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);

		//Take in the size of the array
		int n = sc.nextInt(); 

		int arr[] = new int[n];

		//Populate the array
		for(int i = 0; i < n; i++) 
			arr[i] = sc.nextInt();

		//Sort the array in ascending order
		Arrays.sort(arr); 

		//Print the second last element in the array
		System.out.println(arr[n-2]); 
		
		//prevent possibly memory leaks, may need to be removed for HackerRank
		sc.close();
	}
}