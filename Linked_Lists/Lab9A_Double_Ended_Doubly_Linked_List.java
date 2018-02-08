package Solutions_2017;
/**
Problem Statement

Go through the double-ended doubly-linked list to find the largest int
value held in any of the links. If the doubly-linked list is empty or
defective in any way, return 0. The main method is already completed,
you simply have to write the search() method which reports to the main method.

HINT: Try writing down a couple of defective linked lists, and see what they have in common.

Input Format
There is no input. The linked list is created automatically.

Output Format
Output the largest value held in any of the links. If the linked list is empty or defective output 0.
**/
public class Lab9A_Double_Ended_Doubly_Linked_List
{
	public static int search(DoublyLinkedList mylist)
	{

	    /* return the highest value held in any of the links, 0 if defective or empty*/
	    //if the list is empty or the list is defective, return 0
	    if(mylist.isEmpty())
	    {
	        return 0;
	    } 
	    
	    Link current = mylist.first;

	    int highest = mylist.first.data;

	    while(current.next != null)
	    {
	        if(current.next.previous == current)
	        {	       
	        	//search through the linked list
	            if( highest < current.data)
	            {
	                highest = current.data;
	            }

	        }
	            else
	            {
	                return 0;
	            }
	        
	        current = current.next;
	    } 
	    
	    return highest;
	}
    
    class Link
    {
    	public int data;
    	public Link next;
    	public Link previous;

    	public Link(int input)
    	{
    		data = input;
    	}
    }//end class Link

    
    class DoublyLinkedList 
    {
    	public Link first; //ref to first item
    	public Link last;  //ref to last item

    	//Before inserts, the first and last values are null
    	public DoublyLinkedList( )
    	{
    		first = null;
    		last = null;
    	}

    	//If empty the first node is equal to null value
    	public boolean isEmpty( )
    	{
    		return (first == null);
    	}

    	//If the first node is empty, insert value.  Else, insert into the next node
    	public void insertHead(Link insert)
    	{
    		if(isEmpty())
    			first = insert;

    		else
    		{
    			insert.next = first;
    			first = insert;
    		}
    	}
    }
}