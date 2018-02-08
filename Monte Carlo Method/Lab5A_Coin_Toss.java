package Solutions_2017;

/**
 * Problem Statement
The goal is to read in a number of fair coin tosses, and the probability 
that a given coin toss will produce heads, and output the probability 
that the majority of coin tosses will be heads, rounded to the nearest 
percent.

Input Format
An integer N for the number of coin tosses, followed on the next line 
by an integer H for the probability of getting heads.

Output Format
An integer from 0 to 100 representing the percentage probability that 
the majority of coin tosses will be heads.

Constraints
0≤N≤1000
0≤H≤100

Sample Input
5
50 

Sample Output
50
**/

import java.util.Scanner;

public class Lab5A_Coin_Toss
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        //The number of coin tosses
        double tosses = sc.nextInt();
        
        //
        double bias = sc.nextInt();
        
        double count = 0;
        
        //number of simulations
        double simulations = 1000;
        

        for(int i = 0; i < simulations; i++)
        {
            double total = 0;

            for(int j = 0; j < tosses; j++)
            {
                if(Math.random() < bias/100.0)
                {
                    total++;
                }
            }

            if(total > tosses / 2.0)
            {
                count++;
            }
        }

        System.out.println((count * 100/simulations));
        sc.close();
    }

}