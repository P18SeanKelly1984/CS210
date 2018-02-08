package Previous_Labs;

//Get the element of the top of the stack after performing the given push and pop commands

import java.util.Scanner;
public class Lab7_TopOfStack
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);

        //Create a new integer and string line
        int n = sc.nextInt();sc.nextLine();

        //Create new stack
        Stack myStack = new Stack(n);

        //
        for(int i = 0; i < n; i++)
        {
        	//Splits input when it reaches a space and puts each element in an array
            String arr[] = sc.nextLine().split(" "); 

            if(arr[0].equals("PUSH"))
            {
                int temp = Integer.parseInt(arr[1]);
                
                //Convert the number from a string to an integer and push it on to the stack
                myStack.push(temp); 
            }
            else
                if(myStack.isEmpty())
                    continue; //Will move on to the next iteration of the loop if the stack's empty
                else
                    myStack.pop();
        }

        if(myStack.isEmpty())
            System.out.println("empty");

        else
            System.out.print(myStack.peek()); //Print the top element
        sc.close();
    }
}

	public class Stack
	{
	    private int maxsize;
	    private int[] stackArray;
	    private int top;
	
	    public Stack(int size)
	    {
	        maxsize = size;
	        stackArray = new int[maxsize];
	        top = -1;
	    }

	    //add from the top
	    public void push(int x)
	    {
	        top++;
	        stackArray[top] = x;
	    }
	    
	    //take from top of stack
	    public int pop()
	    {
	        return stackArray[top--];
	    }

	    //look
	    public int peek()
	    {
	        return stackArray[top];
	    }
	    
	    //boolean to check if stack is empty
	    public boolean isEmpty()
	    {
	        return(top == -1);
	    }
	    
	    //boolean to check if the stack is full
	    public boolean isFull()
	    {
	        return(top == maxsize -1);
	    }
	    
	    //make empty from the top
	    public void makeEmpty()
	    {
	        top = -1;
	    }
	    
	    public int getTop()
	    {
	        return top;
	    }
	
}