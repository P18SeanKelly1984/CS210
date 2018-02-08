//Find the median value in a Queue given input
//Example input: INSERT 20,INSERT 30, INSERT 23,REMOVE, REMOVE

package Previous_Labs;
import java.util.Scanner;

public class Lab8_MiddleOfQueue 
{
	public static void main(String args[])
	{
	 Scanner sc = new Scanner(System.in);
     String x;
     Queue theQueue = new Queue(5);

     	//Return
		 while(sc.hasNext())
		 {
		     x = sc.next();
		     
		     //Need stopping condition when using hasNext with standard input.
		     if(x.equals("STOP"))	
		     {
			     	break;
		     }
		     //If input is REMOVE and theQueue is not empty, remove from queue
		     if((x.equals("REMOVE"))&&!theQueue.isEmpty())
		     {
		            theQueue.remove();
		     }
		     
		     //Else continue inserting 
		     else
		     {
		         x = sc.next();
		         theQueue.insert(x);
		     }
		 }
		 
		 //If the queue is empty, there is no other code to run
	    if(theQueue.isEmpty())
	    {
	        System.out.println("empty");
	    }
	    
	    //else calculate
	    else
	    {
	        int size = 0;
	        size = size + theQueue.size();
	        
	        //if the length is even
	        if(size % 2 == 0)
	        {
	        	//divide by 2 and minus 1
	            size = (size / 2) -1;
	        }
	        //else if it is odd just divide by 2
	        else
	        {
	            size = size / 2;
	        }
	
	        //If the queue is not at the size of zero remove element
	         for(int i = 0; i < size; i++)
	         {
	                 theQueue.remove();
	         }
	         
	         //Print out the removed value
	        System.out.println(theQueue.remove());
	    }
	    
	    sc.close();
	}
}

public class Queue
{

 private int maxSize;
 private String[] queArray;
 private int front;
 private int rear;
 private int nItems;

 public Queue(int s)
 {
     maxSize = s;
     queArray = new String[maxSize];
     front = 0;
     rear = -1;
     nItems = 0;
 }

 public boolean insert(String item)
 {
	 //fill this in
     if(isFull()) return false;
     if(rear == maxSize-1)
         rear = -1;
     rear++;
     queArray[rear] = item;
     nItems++;
     return true;
 }

 public String remove()
 {
	 //If the string is empty return no value
     if(isEmpty()) 
     {
    	 return null;
     }

     String temp = queArray[front];
     front++;
     if(front == maxSize)
         front = 0;
     nItems--;
     return temp;
 }

 //If the queue is empty the number items is 0
 public boolean isEmpty()
 {
     return (nItems == 0);
 }

 //If the queue is full, the number of items is the same as maxSize
 public boolean isFull()
 {
     return (nItems == maxSize);
 }

 public int size()
 {
     return nItems;
 }

}