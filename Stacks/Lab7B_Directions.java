package Solutions_2017;

import java.util.Scanner;

/**
Problem Statement

In this task you will get a set of instructions to get from a home location 
to a destination location. You have to give the instructions which begin at 
the destination location and return to the home location. In other words, you 
need to reverse the directions. Sometimes a mistake will be make with the directions, 
meaning that the latest direction should be deleted. The possible set of directions 
is "Go North", "Go South", "Go East" and "Go West". Another possible instruction is 
"Go Back" which means to undo the latest step. The instruction "Arrived" means the 
sequence of directions is complete.

The way to solve this problem is to push all the instructions onto the stack, pop when 
you get "Go Back", and then pop them all off at the end (flipping North <-> South and
 East <-> West) to have a reversed set of instructions to get you home. 


You can copy and paste the code for a Stack class from the notes and alter it to work 
with Strings (or maybe use chars or ints if you want to represent the instructions 
in a different format).

NOTE: You will never be asked to "Go Back" without at least 1 previous valid direction

Input Format
A sequence of n lines which can consist of "Go North", "Go South", "Go East", "Go West",
 "Go Back" and "Arrived" 

Output Format
A reversed set of instructions, each instruction on a separate line, which can consist 
of "Go North", "Go South", "Go East", and "Go West"

Constraints
1≤n≤100
 
Sample Input
Go North
Go North
Go West
Go Back
Arrived

Sample Output
Go South
Go South

(courtesy of Peter Beattie)
**/
public class Lab7B_Directions
{
	public static void main(String args[] ) throws Exception 
	{
        Scanner scan = new Scanner(System.in);

        Stack st = new Stack();

        String line[] = scan.nextLine().split(" ");
    

        while(line[0].matches("Arrived") == false)
        {
            if(line[1].matches("Back"))
            {
                st.pop();
            }     

            else
            {
                st.push(line[1]);
            }

            line = scan.nextLine().split(" ");
        }
    

        while(st.isEmpty() == false)
        {
            String s = st.pop();

            if(s.matches("North")) System.out.println("Go South");

            else if(s.matches("South")) System.out.println("Go North");

            else if(s.matches("West")) System.out.println("Go East");

            else if(s.matches("East")) System.out.println("Go West");
        }
        
        scan.close();
    } 

    public static class Node 
    {
        String data;
        Node next;      

        public Node(String s)
        {
            data = s;
        }
    }

    public static class Stack 
    {
        Node head;      

        public void push(String s)
        {
            if(head == null)
            {
                head = new Node(s);
                return;
            }

            Node oldhead = head;
            head = new Node(s);
            head.next = oldhead;
            return;
        }
       
        
        public String pop()
        {
            if(head == null)
            {
                return " ";
            }

            Node returnHead = head;
            head = head.next;
            return returnHead.data;
        }

        public boolean isEmpty()
        {
            return (head == null);
        }
    }
}