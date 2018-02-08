package Previous_Labs;

// Given an interest rate and a bank balance calculate how much will be in the 
//account after a given number of years
import java.util.Scanner;
public class Lab10_Interest
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
 		int y = sc.nextInt();
 		double i = sc.nextDouble();
 		double x = sc.nextDouble();
 		System.out.println(String.format( "%.2f", compound(y,i,x)));
 		
 		sc.close();
	}

	//This method is equivalent to balance * Math.pow(factor, years)
	public static double compound(int years, double interest, double balance)
	{
		if(years == 0) //base case
			return balance;
		
		//Balance * factor = balance with interest added
		double factor = (interest/100) + 1; 
		double three = balance;
		double two = interest;
		int one = years - 1;

		return(factor * compound(one, two, three));
	}
}