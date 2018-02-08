package Solutions_2017;

//FIND THE MODE

import java.util.*;

public class Lab3B_Find_The_Mode
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);

        int number = sc.nextInt();

        //Make an array the size of number
        int[] data = new int[number];

        //Populate the array with values
        for(int i = 0; i < number; i++)
        {
            data[i] = sc.nextInt();
        }

        int record = 0;

        int recordnumber = 0;

        for(int i = 0; i < number; i++)
        {
            int count = 0;

            for(int j = 0; j < number; j++)
            {
                if(data[i] == data[j])

                    count++;
            }

            if(count > record)
            {
                record = count;

                recordnumber = data[i];
            }
        }

        System.out.println(recordnumber);

        sc.close();
    }

}