package Solutions_2017;
import java.util.Scanner;

/**
Problem Statement

The goal is to read in an int and output the largest int that can be
created by bit shifting the original 32-bit number any number of positions
either to the left or the right (i.e. using a single operator, either <<,
>> or >>>).

Input Format
An integer which represents n in 32-bit Little Endian format.

Output Format
An integer which is the largest that can be created by bit shifting n to the left or right.

Sample Input
1

Sample Output
1073741824

**/
public class Lab10A2_Byte_Manipulation
{
    public static void main(String args[] ) throws Exception
    {
        Scanner input = new Scanner(System.in);

        int n = input.nextInt();
        int record = n;

        //32 bits makes up the range of integers
        for (int i = 0; i < 32; i++) 
        {
        	//when to shift left
            if (n << i > record)
            {
                record = n << i;
            }

            //when to signed right shift
            if (n >> i > record)
            {
                record = n >> i;
            }

            //when to unsigned right shift
            if (n >>> i > record)
            {
                record = n >>> i;
            }
        }
        
        System.out.println(record);
        input.close();
    }
}