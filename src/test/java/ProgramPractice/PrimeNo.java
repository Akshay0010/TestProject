package ProgramPractice;

import java.util.Scanner;

public class PrimeNo {
	
	// Prime number is a number that is divisible by only 1 and itself

	public static void main(String[] args) {
		
		Scanner scn =  new Scanner(System.in);
		System.out.println("Enter a number");
		int num =  scn.nextInt();
		System.out.println(num);
		scn.close();
		
		
		if(primeNumbercheck(num))
		{
			System.out.println(num + "is a prime no");
		}else 
		{
			System.out.println(num+ "is not a prime no");
		}
		
	}
		
		
		public static boolean primeNumbercheck(int num) {
			
		
		
		if(num<=1)
		{
			return false;
		}
		
		for (int i = 2; i<=num/2; i++)
		{
			if(num%i==0) {
				return false;
			}
		}
		return true;
	}

	
}
