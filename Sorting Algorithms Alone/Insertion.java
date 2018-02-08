package Sorting;

import java.util.Arrays;

//Silly names given to aid in memorisation.  harry = array, hot = record and cold = temp
public class Insertion
{
  public static void main(String args[])
  {
    int[] harry = {1, 65, 8, 3, 18, 15, 53};

    //Cycle through the array beginning at element 1
    for(int i = 1; i < harry.length; i++)
    { 	
    	int hot = i;
    	
    	//Cold is the temporary backup
    	int cold = harry[i];
	
	    	//Loop to shift elements to make space
	    	while((hot > 0) && harry[hot - 1] >= cold)
	    	{
	    		//shift elements up to make room for insertion
	    		harry[hot] = harry[hot - 1];
	    		
	    		//Move downwards
	    		hot--;
	    	}
	    //Make the temp value the element value
    	harry[hot] = cold;
    }
    
    System.out.println(Arrays.toString(harry));
  }

}