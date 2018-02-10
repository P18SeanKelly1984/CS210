public static int findLoopLength(LinkedList myList)
{
	//If there is nothing in myList, return nothing
	if(myList.isEmpty){
		return 0;
	}
	//start at the beginning
	Link current = myList.first;
	
	//generate an array with the value of 100
	Link arr[] = new Link[100];
	
	//start the count at 0
	count = 0;
	
	//while the current link has information in it
	while(current.next != null)
	{	//set the array
		arr[count] = current;
		
		//search for a link with the same value to see if we are in a loop or not
		for(int i = 0; i < count; i++)
		{   
			//if we found it
			if(arr[i] == current)
			{
				return count - i;
			}
			//keep counting updates
			count++;
			
			//go to the next link
			current = current.next;
		}
	}
	//otherwise it isn't a loop
	return 0;	
}
	
	
public Link Delete(int x)
{
	Link current = head;
	
	while(current.value != x)
	{
		current = current.next;
	}
	
	if(current == head)
	{
		deleteHead();
	}
	
	if(current == tail)
	{
		deleteTail();
	}
	
	else()
	{
		current.next.previous = current.previous;
		current.previous.next = current.next;
	}
	
	return current;
}
	
	



















