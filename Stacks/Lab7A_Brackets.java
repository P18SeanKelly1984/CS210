package Solutions_2017;
/**
Braces in a string are considered to be balanced if the following criteria are met:

For every opening brace (i.e., (, {, or [), there is a matching closing 
brace (i.e., ), }, or ]) of the same type (i.e., ( matches ), { matches }, and 
[matches ]). An opening brace must appear before (to the left of) its matching 
closing brace. For example, ]{}[ is not balanced.

No unmatched braces lie between some pair of matched braces. For example, ({[]})
 is balanced, but {[}] and [{)] are not balanced.


Complete the braces function in the editor below. It has one parameter: an array 
of n strings, values. For each string in values, it must determine if all the braces 
in the string are balanced. The function must return an array of strings where the 
string at each index i (where 0 ≤ i < n) denotes whether or not all the braces in 
string values i were balanced. If yes, then index i in the return array must contain 
the string YES; otherwise, index i in the return array must contain the string NO.
 

Input Format

Locked stub code in the editor reads the following input from stdin:
The first line contains an integer, n, denoting the number of elements in values.
Each line i of the n subsequent lines (where 0 ≤ i < n) contains a string describing values i.
The locked stub code then passes the string array values as an argument to the braces() function.


Constraints

1 ≤ n ≤ 15

1 ≤ length of values i ≤ 100

It is guaranteed that each values i consists of (, ), {, }, [, and ] only.


Output Format
The function must return an array of strings where each index i contains either 
YES or NO denoting whether or not values i was balanced. This is printed to stdout 
by locked stub code in the editor.


Sample Input 0
2
{}[]()
{[}]}

Sample Output 0
YES
NO


Explanation 0
values0: {}[]() meets the criteria for a balanced string, so index 0 in our return 
array should contain the string YES.

values1: {[}] contains unmatched braces between a matched pair in the substrings [}, 
{[}, and [}], so index 1 in our return array should contain the string NO.
**/

//(courtesy of Conor Kerrigan)
public class Lab7A_Brackets
{
	public static class Stack 
	{ 
	     /* size of stack array */
	     private int maxSize;
	     private Object[] stackArray;
	
	     /* top of stack */
	     private int top;
	
	     /* constructor */
	     public Stack(int s) 
	     {
	    	   // set array size
	           maxSize = s; 
	
	           // create array
	           stackArray = new Object[maxSize]; 
	
	           // no items yet }
	           top = -1; 
	     }
	
	     /* put item on top of stack */
	     public void push(Object j) 
	     {
	           top++;
	           
	           // increment top, insert item
	           stackArray[top] = j; 
	     }
	
	     /* take item from top of stack */
	     public Object pop() 
	     {
	    	   // access item, decrement top
	           return stackArray[top--]; 
	     }
	
	      /* peek at top of stack */
	     public Object peek() 
	     {
	           return stackArray[top];
	     }
	
	     /* true if stack is empty */
	     public boolean isEmpty() 
	     {
	           return (top == -1);
	     }
	
	     /* true if stack is full */
	     public boolean isFull() 
	     {
	           return (top == maxSize - 1);
	     }
	
	     /* empty stack */
	     public void makeEmpty() 
	     {
	           top = -1;
	     }
	
		public static boolean parenthesesMatching(String string) 
		{
	           char b1;
	           char b2;
	
	           Stack theStack = new Stack(20);
	
	           for (int i = 0; i < string.length(); i++) 
	           {
	                b1 = string.charAt(i);
	
	                // Opening brackets are placed on a stack
	                if (b1 == '{' || b1 == '(' || b1 == '[' || b1 == '<') 
	                {
	                     theStack.push(b1);
	                }
	
	                // When the program comes across a closing bracket it pops from
	                // the ‘opening bracket stack’ and this should match
	                if (b1 == '}' || b1 == ')' || b1 == ']' || b1 == '>') 
	                {
	                     if (theStack.isEmpty())
	                           return false;
	
	                     b2 = (char) theStack.pop();
	
	                     switch (b2) 
	                     {
		                     case '{':
		                           if (b1 != '}')
		                                return false;
		                           break;
		
		                     case '(':		
		                           if (b1 != ')')
		                                return false;
		                           break;
		
		                     case '[':		
		                           if (b1 != ']')
		                                return false;
		                           break;
		
		                     case '<':		
		                           if (b1 != '>')
		                                return false;
	                     }
	                }
	           }
	           return (theStack.isEmpty());
	     }
	
	    /*
	     * Complete the function below.
	     */
	    static String[] braces(String[] values) 
	    {
	        String[] res = new String[values.length];
	
	       for (int i = 0; i < values.length; i++) 
	       {
	           res[i] =  parenthesesMatching(values[i]) ? "YES": "NO";
	       }
	        return res;
	    }
	}
}