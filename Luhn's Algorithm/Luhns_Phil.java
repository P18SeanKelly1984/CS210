package Solutions_2017;

import java.util.Scanner;

public class Luhns_Phil 
{
	public static void main(String[] args)
	{
		
     Scanner sc = new Scanner(System.in);

     	//take in a string of numbers that is the creditcard
        String number = sc.nextLine();

        //declare an integer called total
        int total = 0;

        //Use a for loop for String to integer conversion
        //A String is made up of single char characters
        for(int i = 0; i < number.length() - 1; i++)
        {
        	//using the for loop to convert each char in the string to an integer
        	int digit = Integer.parseInt("" + number.charAt(number.length() - i - 2));

        	//even numbers
            if( i % 2 == 0)
            {
            	//multiply even numbers by 2
                digit = digit * 2;
            }

            //if they are greater than 9, minus 9
            if(digit > 9)
            {
                digit -= 9;
            }
            
            //add up the total
            total += digit;
        }
        
        	//If after all calculations the total can be modulus by ten, card is authentic
	        if((total + Integer.parseInt("" + number.charAt(number.length() - 1))) % 10 == 0)
	        {
	            System.out.println("VALID");
	        }
	        
	        //else it is invalid
	        else
	        {
	            System.out.println("INVALID");
	        }
	    
	    sc.close();
    }
}
