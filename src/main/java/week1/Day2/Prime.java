package week1.Day2;

public class Prime { 

		static boolean isPrime(int n) 
		{ 
			// Corner case 
			if (n <= 1) 
				return false; 

			// Check from 2 to n-1 
			for (int i = 2; i < n; i++) 
				if (n % i == 0) 
					return false; 

			return true; 
		} 

		// Main Method 
		public static void main(String args[]) 
		{ 
			int n;
			if (isPrime(n=11)) 
				System.out.println(n + " is Prime number"); 
			else
				System.out.println(n + " is not a Prime number"); 
			if (isPrime(n=15)) 
				System.out.println(n + " is Prime number"); 
			else
				System.out.println(n + " is not a Prime number"); 
		} 
	}

