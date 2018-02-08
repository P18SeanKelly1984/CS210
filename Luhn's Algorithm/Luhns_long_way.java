package Previous_Labs;


//For the conversion process between strings, chars and ints, libraries are imported, List and ArrayList
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Luhns_long_way
{

	public static void main(String[] args) 
	{
	    Scanner sc = new Scanner(System.in);
	    
	    //instructions for if true or false
	    boolean repeat;
	    
	    //Sequence list of integers, named digits
	    List<Integer> digits = new ArrayList<Integer>();

	    do 
	    {
	    	//boolean repeat set to false
	        repeat = false;
	        
	        //instruct user
	        System.out.println("Enter card number: ");
	        
	        //input of String numbers
	        String input = sc.next();

	        //Use a for loop to iterate through the input of numbers
	        for (int i = 0; i < input.length(); i++) 
	        {        	
	        	//create a for loop to split string into chars
	            char c = input.charAt(i);
	            
	            //include constraints to keep the char number values between 0 and 9
	              if (c < '0' || c > '9') 
	              {
	            	//only execute while (repeat) when values are 0 to 9
	                repeat = true;
	                
	                //Optional, remove all elements of the digits sequence
	               digits.clear();
	                
	                break;
	                
	               //fills list with integer values from the char c characters from the for loop
	              } 
		            else 
		            {
		                digits.add(Integer.valueOf(c - '0'));
		            }
	            
	        	}
	    } 
	    
	    //execute WHILE when DO has set repeat to true
	    while (repeat);

	    //create an array using the SIZE of DIGITS to determine the length
	    int[] array = new int[digits.size()];
	    
	 
	    //converts elements in array list to integer values
	    for (int i = 0; i < array.length; i++) {
	        array[i] = Integer.valueOf(digits.get(i));
	    }
	    
	    //check if valid and if so output to console, feeding from check method
	    boolean valid = check(array);
	    //if valid is true, in other words check(array) == 0 is returned, print Valid
	    if(valid)
	    {
	    System.out.println("Valid");
	    }
	    //else if check(array) is not returned the card is declared invalid
	    else
	    {
	    	System.out.println("Invalid");
	    }
	    
	    sc.close();
	}

	
	//code to check authenticity of typed in digits
	public static boolean check(int[] digits) 
	{
	    int sum = 0;
	    
	    //find length of digits and convert into a integer called length
	    int length = digits.length;
	    
	    //run another for loop to run through second and third lines of calculations
	    for (int i = 0; i < length; i++) 
	    {	
	      // get digits in reverse order
	      int digit = digits[length - i - 1];
	
	      // every 2nd number multiply by 2
	      if (i % 2 == 1) 
	      {
	          digit *= 2;
	      }
	      
	      //check if sum value plus digit is greater than 9 and if so minus 9, else is the value of digit
	      sum += digit > 9 ? digit - 9 : digit;
	    }
	    
	    //if mod 10 results in 0 the card is genuine
	    return sum % 10 == 0;
	  }
}