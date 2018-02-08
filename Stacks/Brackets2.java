package Stacks;
/**
 * Given N strings of brackets, determine whether each sequence of brackets is balanced. 
 * If a string is balanced, print YES on a new line; otherwise, print NO on a new line.
**/
import java.util.Scanner;

public class Brackets2
{
	   public static boolean isBalanced(String ex) 
       {
          //Use length to find the length of the string
          int stringLength = ex.length();

           //If the string has no length and expression(ex) isn't anything return true.
           //Zero is considered balanced
	       if(stringLength == 0 || ex == null) return true;
	    
	       //Create a stack for the bracket characters
	       java.util.Stack<Character> stack = new java.util.Stack<> ();
	      
	    for(int i = 0; i < ex.length(); i++)
	    {
	    	//If ( or [ or { is typed in, push
	        if(ex.charAt(i) == '(' || ex.charAt(i)=='[' || ex.charAt(i)=='{')  stack.push(ex.charAt(i));
	        
	        //If s is equal to ) and the stack is not empty and ( is already there, pop
	        else if(ex.charAt(i)==')' && !stack.empty() && stack.peek()=='(') stack.pop();
	        
	        //If s is equal to ] and the stack is not empty and [ is already there, pop
	        else if(ex.charAt(i)==']' && !stack.empty() && stack.peek()=='[') stack.pop();
	
	        //If s is equal to } and the stack is not empty and { is already there, pop
	        else if(ex.charAt(i)=='}' && !stack.empty() && stack.peek()=='{') stack.pop();
	        
	        //else boolean is set to false, unbalanced number of brackets
	        else return false;
	    }
	    
	    return stack.empty();
	}	
	
	    public static void main(String[] args) 
	    {

		Scanner in = new Scanner(System.in);
		    
		//Type in the number of bracket strings
		int N = in.nextInt();

           for (int i = 0; i < N; i++) 
           {
               //type in the string expression
               String expression = in.next();

               //Method boolean isBalanced determines if the answer is YES or NO.
               System.out.println( (isBalanced(expression)) ? "YES" : "NO" );
           }
          in.close(); 
	}
  	    
}