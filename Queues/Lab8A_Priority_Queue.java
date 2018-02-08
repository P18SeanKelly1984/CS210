package Solutions_2017;
/**
Problem Statement

Manipulate a priority queue according to the given INSERT and REMOVE commands 
and then output the string that is at the front of the priority queue. If a 
remove command is issued for an empty queue then nothing should happen. Inserted
strings should be entered into the priority queue according to the length of 
the string, with shorter strings at the front of the queue and longer strings 
at the back. Where two strings have equal length, positioning should be resolved
by alphabetical ordering, with the words closer to the front of the dictionary 
(e.g. aardvark, apple) going towards the front of the priority queue, and the 
ones closer to the end of the dictionary going towards the back (e.g. zip, zoo).
You should then output the item at the front of the priority queue. 


You can implement the priority queue using an array or linked list.


Input Format
An integer N indicating the number of instructions, followed by N instructions each
 on a separate line (either INSERT followed by a string to insert, or REMOVE)


Output Format
Output the string at the front of the priority queue

Constraints
1≤n≤200


Sample Input

6
INSERT avocado
INSERT lemon
REMOVE
INSERT orange
INSERT kiwi
INSERT apple

Sample Output
kiwi
**/

import java.util.Scanner;

public class Lab8A_Priority_Queue
{
    public static void main(String args[] ) throws Exception 
    {
        Scanner sc = new Scanner(System.in);

        int size = Integer.parseInt(sc.nextLine());

        Queue PQ = new Queue(size);

        for (int i = 0; i < size; i++)
        {
            String input = sc.nextLine();

            if (input.equals("REMOVE"))
            {
                PQ.remove();
            }
            
            else
            {
                PQ.insert(input.substring(7,input.length()));              
            }
        }
        System.out.println(PQ.peekFront());
        sc.close();
    }
}

class Queue
{
    private int maxSize;
    private String[] queArray;
    private int nItems;
 
    // constructor
    public Queue(int s) 
    {          
        maxSize = s;
        queArray = new String[maxSize];
        nItems = 0;
    }
 
    // insert item    
    public void insert(String word) 
    {       
    	// if no items,
        if(nItems == 0)
        {                         
        	// insert at 0
            queArray[0] = word;           
        }
        // if some items,
        else
        {                                 
        	// start at end   
            int j = nItems;         

            // while new item larger
            while(j > 0 && bigger(queArray[j-1],word))
            {   
            	// shift upward
                queArray[j] = queArray[j-1];    

                // decrement j
                j--;                     
            }
            // insert it
            queArray[j] = word;                
        }
        // increase items
        nItems++;                         
    }

    public boolean bigger(String one, String two)
    {
        if (one.length() < two.length())
        {
            return true;
        }
        
        else if (one.length() == two.length() && one.compareTo(two) < 0)
        {
            return true;
        }
        return false;
    }

    // take item from front of queue
    public String remove() 
    {         
        if(!isEmpty())
        {
        	// get value and increment front
            String temp = queArray[nItems];

            // one less item
            nItems--;                      
            return temp;
        }
        
        else
        {
            return null;
        }
    }

    // peek at front of queue 
    public String peekFront()
    {       
        if(!isEmpty())
        {
            return queArray[nItems-1];    
        }
        
        else
        {
            return null;
        }
    }     

    // true if queue is empty
    public boolean isEmpty() 
    {    
        return (nItems == 0);
    }     

    // true if queue is full
    public boolean isFull() 
    {    
        return (nItems == maxSize);
    }     

    // number of items in queue
    public int size() 
    {        
        return nItems;
    }

}