package Previous_Labs;

//Check if a given word is a Palindrome
import java.util.Scanner;
public class Lab10_Palindrome
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
 		String mystring = sc.nextLine();
 		System.out.println(check(mystring));
 		
 		sc.close();
	}
	
	public static String check(String myString)
	{
		//check if first and last letters are the same
		if(myString.charAt(0) != myString.charAt(myString.length()-1)) 
			return "FALSE";

		else if(myString.length() <= 2) //Base case
			return "TRUE";

		String substring = myString.substring(1, myString.length()-1);

		//Remove the first and last letters and check this new string
		return check(substring); 
	}
}