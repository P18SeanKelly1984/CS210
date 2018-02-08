package Solutions_2017;

/**
The goal is to read in a number of fair coin tosses, and a target number 
of heads, and output the probability that the target number of heads in a 
row will be tossed at some point in the sequence, rounded to the nearest percent.

Input Format
An integer N for the number of coin tosses, followed on the next line by an 
integer H for the target number of heads.

Output Format
An integer from 0 to 100 representing the percentage probability that H heads 
in a row will be observed at some point during N tosses of a fair coin.

Constraints
0≤N≤1000
0≤H≤100

Sample Input
5
3

Sample Output
25
**/ 

import java.util.Scanner;

public class Lab5B_Target_Numbers
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        int tosses = sc.nextInt();
        int heads = sc.nextInt();

        double count = 0;
        double simulations = 1000000;

        for(int i = 0; i < simulations; i++)
        {
            int click = 0;
            int record = 0;

            for(int j = 0; j < tosses; j++)
            {
                if(Math.random() > .5)
                {
                    click++;

                    if(click > record)
                    {
                        record = click;
                    }
                }
                
                else
                {
                    click = 0;
                }
            }

            if(record >= heads)
            {
                count++;
            }
        }
        System.out.println((count*100/simulations));
        sc.close();
    }
}