package Solutions_2017;

//FIND THE CLOSEST TO THE AVERAGE
import java.util.Scanner;

public class Lab3A_Closest_To_Average
{ 
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);

        int number = sc.nextInt();

        int[] arr =  new int[number];

        double sum = 0;       

        for(int x = 0; x < arr.length; x++)
        {
        	//Type in the integer values
            arr[x] = sc.nextInt();

            //Add up the sum of the values in the array elements
            sum = arr[x] + sum;
        }

		//Calculate the average       
        double average = (sum/arr.length);

		/**
		Set the record equal to the first distance from the average.
		Search begins at element 0
		abs == absolute value becomes a positive, can never be a negative.
		Square value and then square root
		**/       
        double closest = Math.abs(arr[0] - average);
        int index = 0;

        for (int j = 0; j < arr.length; j++)
        {
        	//When cycling through the for loop, store the value closest
        	//to the average in index
            if (Math.abs(arr[j] - average) < closest)
            {
              closest = Math.abs(arr[j] - average);
              index = j;
            }
        }
        
        //When closest to average is found and value is transfered to index
        //print out that array element
        System.out.println(arr[index]);
        
        //Make not need for HackerRank
        sc.close();
    }       
}