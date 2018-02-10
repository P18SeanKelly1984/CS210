public static void main(String args[])
{
	LinkList theLinkedList = new LinkList();
	
	LinkList.insertFirstLink("Don Quixote", 500);
	LinkList.insertFirstLink("A Tale of Two Cities", 200);
	LinkList.insertFirstLink("The Lord of the Rings", 150);
	LinkList.insertFirstLink("Harry Potter and the Sorceror's Stone", 107);

	theLinkedList.removeFirst();

	theLinkedList.display();
	
	System.out.println(theLinkedList.find("The Lord of the Rings").bookName
	+ " was found.");
	
	theLinkedList.removeLink("The Lord of the Rings");
	
	theLinkedList.display();
}

public class Link 
{
	public String bookName;
	public int millionsSold;
	
	public Link next;
	
	public Link(String bookName, int millionsSold)
	{
		this.bookName = bookName;
		this.millionsSold = millionsSold;
	}
	
	public void display()
	{
		System.out.println(bookName + ": " + millionsSold + ",000,000");
	}

	class LinkList
	{
		public Link firstLink;
		
		LinkList()
		{
			firstLink = null;
		}
		
		public boolean isEmpty()
		{
			return(firstLink == null);
		}
		
		public void insertFirstLink(String bookName, int millionsSold)
		{
			Link newLink = new Link(bookName, millionsSold)
			{
				newLink.next = firstLink;
				firstLink = newLink;
			}
		}
		
		public void removeFirst()
		{
			Link Linkreference = firstLink;
			
			if(!isEmpty())
			{
				firstLink = firstLink.next;
			}
			else
			{
				System.out.println("Empty LinkedList");
			}
		}
		
		return linkReference;
	}
	
	public void display()
	{
		Link theLink = firstLink;
		
		while(theLink != null)
		{
			theLink.display();
			
			System.out.println("Next Link: " + theLink.next);
			
			theLink = theLink.next;
		}
	}
	
	public Link removeLink(String bookName)
	{
		Link currentLink = firstLink;
		Link previousLink = firstLink;
		
		while(currentLink.bookName != bookName)
		{
			if(currentLink.next == null)
			{
				return null;
			}
			else
			{
				previousLink = current;
				currentLink = currentLink.next;
			}
				
		}
		
		if(currentLink == firstLink)
		{
			firstLink = firstLink.next;
		}
		else
		{
			previousLink.next = currentLink.next;
		}
		
		return currentLink;
			
	}
	
}
