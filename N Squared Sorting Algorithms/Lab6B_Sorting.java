package Solutions_2017;

/**Problem Statement

The goal is to read in a list of students and their exam scores into an array, 
sort the class by their exam scores, and output the name of the student with 
a particular ranking.

NOTE: You should implement the sorting algorithm yourself, DO NOT use Arrays.sort

TIP: To avoid issues with a scanner when reading a line after reading a number, 
you can read in the number using Integer.parseInt(scan.nextLine()) where scan in 
the name of the Scanner you are using.

Input Format
The first line contains n, the number of students. The second line contains r, the 
ranking to output. This is followed by n pairs of student names and exam scores, 
each on a separate line.

Output Format
The name of the student who came in Rth rank in the class.

Constraints
0 ≤ n ≤ 100 

Sample Input
5
2
Eoin
18
Claire
94
David
34
Dylan
69
John
25
 
Sample Output
Dylan

Explanation
When sorted by exam scores, the class looks like

94: Claire
69: Dylan
34: David
25: John
18: Eoin

"Dylan" is ranked 2nd.
**/

import java.util.*;

public class Lab6B_Sorting
{
    public static void main(String args[])
    {
        Scanner in = new Scanner(System.in);

        int n = Integer.parseInt(in.nextLine()), rank = Integer.parseInt(in.nextLine());

        String[] b = new String[n];

        int[] a = new int[n];

        for(int i = 0; i < n; i++) 
        {
            b[i] = in.nextLine();
            a[i] = Integer.parseInt(in.nextLine());
        }
        
        insertion(a, b);

        System.out.println(b[n - rank]);
        in.close();
    }

    public static void insertion(int[] a, String[] b) 
    {
        for(int i = 0; i < a.length - 1; i++) 
        {
            for(int j = i + 1; j < a.length; j++) 
            {
                if(a[i] > a[j]) 
                {
                    swap(i, j, a);
                    swap(i, j, b);
                }
            }
        }
    }

    public static void swap(int x, int y, int[] a) 
    {
        int temp = a[x];
        a[x] = a[y];
        a[y] = temp;
    }

    public static void swap(int x, int y, String[] b) 
    {
        String temp = b[x];
        b[x] = b[y];
        b[y] = temp;  
    }
}