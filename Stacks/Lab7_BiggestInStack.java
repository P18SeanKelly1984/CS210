package Previous_Labs;

//Get the biggest element in the stack after performing the given push and pop commands

import java.util.Scanner;
public class Lab7_BiggestInStack
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);

        //Call in integers and string
        int n = sc.nextInt();sc.nextLine();

        Stack myStack = new Stack(n);

        for(int i = 0; i < n; i++)
        {     	
        	//Splits input when it reaches a space and puts each element in an array
            String arr[] = sc.nextLine().split(" "); 

            if(arr[0].equals("PUSH"))
            {
            	//Convert the number from a string to an int and push it on to the stack
            	int temp = Integer.parseInt(arr[1]);               
              
                myStack.push(temp); 
            }
            
            else
            {
               if(myStack.isEmpty())
                	
                	//Will move on to the next iteration of the loop if the stacks are empty
                    continue; 
            
                else
                {
                    myStack.pop();
                }

            }
 
        }

        //If empty print out empty
        if(myStack.isEmpty())
            System.out.println("empty");

        else
        {
            int record = Integer.MIN_VALUE;

            //While not empty
            while(!myStack.isEmpty())
            {
            	//if record number is greater than that found in the peek
            	if(myStack.peek() > record)
            		
            		//Keep updating the biggest number we find
            		record = myStack.peek(); 
            	
            	//pop one out
            	myStack.pop();
            }
            
            //Print out the record value
            System.out.println(record);
        }
        
        sc.close();
    }
}

		class Stack
		{
			//stores how big the array can possibly get
		    private int maxsize;
		    
		    //Stores an array stack
		    private int[] stackArray;
		    
		    //To track where is the top of the stack
		    private int top;
		
		    //Constructor for the stack, initialises the array of the size of size
		    public Stack(int size)
		    {
		        maxsize = size;
		        stackArray = new int[maxsize];
		        
		        //set to -1 before an array can be referenced, as array elements start at 0
		        top = -1;
		    }
		    
		    //place integer x into the top of the stack
		    public void push(int x)
		    {
		    	//increment up stack
		        top++;
		        
		        //place x at top of the stack
		        stackArray[top] = x;
		    }
		    
		    //take whatever is in the top of the stack out of it
		    public int pop()
		    {
		    	//
		        return stackArray[top--];
		    }
		    
		    //look at whatever is in the top of the array
		    public int peek()
		    {
		        return stackArray[top];
		    }
		    
		    //check if stack is empty
		    public boolean isEmpty()
		    {
		        return(top == -1);
		    }
		    
		    //check if stack is full
		    public boolean isFull()
		    {
		        return(top == maxsize -1);        
		    }
		    
		    //doesn't actually empty stack, but overrides what
		    //information storage starting at bottom of stack.
		    public void makeEmpty()
		    {
		        top = -1;
		    }
		}