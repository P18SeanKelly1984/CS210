package Previous_Labs;
/*
 * What's at the front of the queue after performing the given insert and remove commands?
 * CONSTRAINTS: 	1 <= commands <= 20		1 <= length of string <= 20
*/
import java.util.Scanner;

public class Lab8_FrontOfQueue
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
       
        //The queue will never be bigger than 20
        Queue myQueue = new Queue(20); 
		while(sc.hasNext())
		{		
			//  input when it reaches a space and puts each element in an array
	        String arr[] = sc.nextLine().split(" "); 
	
	        //You need to put in a stopping condition when using standard input with hasNext()
	        if(arr[0].equals("STOP")) 
	        {
	        	break;
	        }
	
	        //If string is not "STOP" and array element is 0, insert "INSERT"
	        else if(arr[0].equals("INSERT"))
	        {
	            myQueue.insert(arr[1]);
	        }
	
	        else //If it says REMOVE
	        {	
	            if(myQueue.isEmpty())
	            {
	            	//Will move on to the next iteration of the loop if the stack's empty
	                continue; 
	            }

	            else
	            {
	            	 myQueue.remove();
	            }
	        }
	        sc.close();
	                   
		}
		System.out.println(myQueue.remove());
    }
}

class Queue
{
	private int maxSize;
	private String[] queueArray;
	private int front;
	private int rear;
	private int nItems;

	//Constructor
	public Queue(int size)
	{ 		
		maxSize = size;
		queueArray = new String[size];
		front = 0;
		rear = -1;
		nItems = 0;
	}
	
	//Inserts an element at the rear of the queue
	public boolean insert(String x)
	{ 
		if(isFull())
			return false;
		
		//If the back of the queue is the end of the array wrap around to the front
		if(rear == maxSize-1) 
		{
			rear = -1;
		}

		rear++;
		queueArray[rear] = x;
		nItems++;
		return true;
	}
	
	//Remove an element from the front of the queue
	public String remove()
	{ 
		if(isEmpty())
		{
			System.out.println("Queue is empty");
			return null;
		}
		
		String temp = queueArray[front];
		front++;
		
		//Dealing with wrap-around again
		if(front == maxSize) 
		{
			front = 0;
		}
		nItems--;
		return temp;
	}

	//Returns true is the queue is full
	public boolean isFull()
	{
		return(nItems == maxSize);
	}

	//Returns true is the queue is empty
	public boolean isEmpty()
	{ 
		return(nItems == 0);
	}
}