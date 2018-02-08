package Previous_Labs;

/*
 * Find the link in the list that causes it to loop
 * CONSTRAINTS: 0 <= Number of links <= 100
*/
import java.util.Scanner;

public class Lab9_LinkThatCausesLoop
{
	public static void main(String args[]) throws Exception 
	{
		Scanner sc = new Scanner(System.in);
		
		//Input gets converted into an integer number from characters
 		int num = Integer.parseInt(sc.nextLine());
 		
 		//Declare a new linked list as an array the size of num
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
 				array[select].next = array[next];
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
 	public static String findLoopLength(LinkedList myList)
 	{
        if(myList.isEmpty())
        	//Return empty if the list is empty
            return "empty"; 

        //Make current equal to the first element in the list
        Link current = myList.first; 
        
        //We need to keep track of the previous element
        Link previous = myList.first; 
        int count = 0;
        
        //It says in the constraints the list will never be bigger than 100
        Link arr[] = new Link[100]; 

        while(current.next != null)
        {
	        	//Populate the array with the links from the list
	            arr[count] = current; 
	
	            for(int i = 0; i < count; i++)
	            {          	
	            	//Check if we have seen the current element before(i.e if it's in the array)
	                if(arr[i] == current) 
	                {
	                	//Return the data of the link that causes us to loop
	                    return previous.data;                 	
	                }
	
		            //Increment counter for each iteration of the loop
		            count++; 
		            
		            //Make previous the current element in the list
		            previous = current; 
		            
		            //Make current the next element in the list
		            current = current.next; 
		        }
	        
	        //If you walk through the entire list and 
	        //complete the while loop then there is no loop in the list
	        return "OK"; 
        }

 	
}

public class Link
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
			{
				first = insert;
			}
	
			else
			{
				insert.next = first;
				first = insert;
			}
		}
	}
}
