package Solutions_2017;

import java.util.Scanner;

/**
Problem Statement

You are given two integers and are allowed to apply one of the operators &, |, ^ 
and unlimited uses of the operator ~. What is the largest integer that can be 
produced given those constraints?

Input Format
Two integers, each on a separate line.

Output Format
The largest integer that can be produced using the inputs and the bit manipulation operators.


Sample input
7
4

Sample output
7
(courtesy of Manyiu Lam)
**/

public class Lab10B2_Largest_Possible_int
{
    public static void main(String args[] ) throws Exception 
    {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt(), b = in.nextInt(), k = Integer.MIN_VALUE;

        if((a & b) > k) k =  (a & b);

        if((a ^ b) > k) k =  (a ^ b);

        if((a | b) > k) k =  (a | b);

        if(~(a & b) > k) k = ~(a & b);

        if(~(a ^ b) > k) k = ~(a ^ b);

        if(~(a | b) > k) k = ~(a | b);

        if(~(b & a) > k) k = ~(b & a);

        if(~(b ^ a) > k) k = ~(b ^ a);

        if(~(b | a) > k) k = ~(b | a);

        if((~a & b) > k) k = (~a & b);

        if((~a ^ b) > k) k = (~a ^ b);

        if((~a | b) > k) k = (~a | b);

        if((~b & a) > k) k = (~b & a);

        if((~b ^ a) > k) k = (~b ^ a);

        if((~b | a) > k) k = (~b | a);

        System.out.print(k);
        in.close();
    }
}