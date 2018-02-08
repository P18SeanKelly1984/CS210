package Previous_Labs;

/*
 * Find the length of the loop in the linked list
 * CONSTRAINTS: 0 <= Number of links <= 100
*/

import java.util.Scanner;

public class Lab9_LengthOfLoop 
{
	public static void main(String args[] ) throws Exception 
	{
		Scanner sc = new Scanner(System.in);
 		int num = Integer.parseInt(sc.nextLine());
 		Link[] array = new Link[num];

 		for(int i = 0; i < num; i++)
 		{
 			array[i] = new Link(sc.nextLine());
 		}

 		while(sc.hasNext())
 		{
 			int select = sc.nextInt();
 			
 			//Need a stopping condition when using hasNext() with standard input
 			if(select == -1) 
 			{
 				break;
 			}

 			int next = sc.nextInt();
 			if(next != -1)
 			{
 				array[select].next=array[next];
 			}

 		}
 		
 		LinkedList mylist = new LinkedList();
 		if(num > 0)
 		{
 			mylist.first = array[0];
 		}


 		System.out.println(findLoopLength(mylist));
 		
 		sc.close();
	}

	//This is the method we had to write
 	public static int findLoopLength(LinkedList myList)
 	{
 		//Return 0 if the list is empty
        if(myList.isEmpty())
        {
            return 0; 
        }

        //Make current equal to the first element in the list
        Link current = myList.first; 
        
        int count = 0;
        
        //It says in the constraints the list will never be bigger than 100
        Link arr[] = new Link[100]; 

        //While the list is not pointing to null
        while(current.next != null)
        {
        	//Populate the array with the links from the list
            arr[count] = current; 

            //Check if we have seen the current element before(i.e if it's in the array)
            for(int i = 0; i < count; i++)
            {
            	
                if(arr[i] == current)
                {
                	//The length of the loop is the index of current minus the index of the repeated element
                    return count - i;                	
                }           

	            //Increment counter for each iteration of the loop
	            count++; 
	            
	            //Make current the next element in the list
	            current = current.next; 
            }
        }
        
        //If you walk through the entire list and complete the while loop then there is no loop in the list
        return 0; 
   }
}

class Link
{
	public String data;
	public Link next;

	public Link(String input)
	{
		data = input;
		next = null;
	}
}

class LinkedList 
{
	public Link first;

	//Before inserts, the first value is null
	public LinkedList( )
	{
		first = null;
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