package Previous_Labs;

	/*
	 * Of three numbers find the number furthest away from the other two.
	 * This is Phil's solution.
	*/
	import java.util.*;
	
	public class Lab2A_furthest_away
	{
		public static void main(String args[] ) throws Exception 
		{
			Scanner sc = new Scanner(System.in);

			int one = sc.nextInt();
			int two = sc.nextInt();
			int three = sc.nextInt();

			int min = Math.min(Math.min(one, two), three);
			int max = Math.max(Math.max(one, two), three);
			int middle = one + two + three - min - max;
			
			
			//if(Math.abs(min - middle)==Math.abs(max - middle)) 

			//If the min is further away from the middle than the max the min is the outlier
			if(Math.abs(min - middle) > Math.abs(max - middle)) 
				System.out.println(min);

			//If the max is further away from the middle than the min the max is the outlier
			else 
			System.out.println(max);
			sc.close();
		}
	}


