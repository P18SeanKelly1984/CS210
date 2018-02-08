package Solutions_2017;

import java.util.Scanner;

/**
Problem Statement

The well known Fibonnaci sequence is defined Fn = F(n-1) + F(n-2) with
seed values 0 and 1 for the first two terms, giving rise to the sequence
0, 1, 1, 2, 3, 5, 8, 13, 21, 34... where every term is the sum of the two
terms before it. Let's invent a "Tribonnaci" sequence where Fn = F(n-1) +
F(n-2) + F(n-3) and the first three terms are F(0)=0, F(1)=0 and F(2)=1. 
Given an input number n, find the nth term of the "Tribonnaci" sequence.

You can choose to use recursion (with dynamic programming), or you can
use a less elegant method!

Input Format
An integer n

Output Format
A long which is the nth term of the Tribonnaci sequence

Constraints
0≤n≤70

Sample input
3

Sample output
1
**/

public class Lab10A1_Tribonnaci
{
    public static void main(String args[] ) throws Exception 
    {       
        Scanner sc = new Scanner(System.in);        
        int n = sc.nextInt();
        
        System.out.println(Tribonnaci(n));  
        
        sc.close();
        
    }//end main

    
    public static long Tribonnaci(int n)
    {
    	//First three N values given instructions
        if(n == 0)
            return 0;
        
        if(n == 1)
            return 0;
        
        if(n == 2)
            return 1;
      
        
    	//Use longs rather than integers to deal with the inefficiency of Tribonnaci/Fibonnaci algorithms
        long trib[] = new long[n + 1];        
        trib[0] = 0;
        trib[1] = 0;
        trib[2] = 1;
        
        //Tribonnaci works the same as Fibonnaci, except for the extra algorithm instruction
		for (int i = 3; i < n + 1; i++)
		{
			trib[i] = trib[i - 1] + trib[i - 2] + trib[i - 3]; 
		}
        
        return trib[n];
    }
    
}