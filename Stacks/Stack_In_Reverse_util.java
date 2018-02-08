package Stacks;
import java.util.Stack;

public class Stack_In_Reverse_util
{
	//Using Stack class for stack implementation
	static Stack<String> st = new Stack<>();

	// Below is a recursive function that inserts an element
	// at the bottom of a stack.
	static void insert_at_bottom(String x)
	{	
		if(st.isEmpty())
		{
			st.push(x);			
		}

		else
		{
			/* All items are held in Function Call Stack until we
			reach end of the stack. When the stack becomes
			empty, the st.size() becomes 0, the
			above if part is executed and the item is inserted
			at the bottom */
				
			String a = st.peek();
			st.pop();
			insert_at_bottom(x);
	
			//Push all the items held in Function Call Stack
			//once the item is inserted at the bottom
			st.push(a);
		}
	}
	
	// Below is the function that reverses the given stack using
	// insert_at_bottom()
	static void reverse()
	{
		if(st.size() > 0)
		{
			/* Hold all items in Function Call Stack until we
			reach end of the stack */
			String x = st.peek();
			
			st.pop();
			reverse();
			
			/* Insert all the items held in Function Call Stack
			one by one from the bottom to top. Every item is
			inserted at the bottom */
			insert_at_bottom(x);
		}
	}	

	// Driver method
	public static void main(String[] args) 
	{			
		String D = "North South East West";
		
		//Push words from the string into the stack string
		st.push(D.substring(0,5));
		st.push(D.substring(6,11));
		st.push(D.substring(12,16));
		st.push(D.substring(17,21));
		
		System.out.println("Directions:");
		
		System.out.println(st);
		
		//Function to reverse the stack
		reverse();
		
		System.out.println("\nDirections reversed:");
		
		System.out.println(st);
	}

}