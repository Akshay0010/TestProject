package ProgramPractice;

import java.util.Scanner;

public class ReverseInteger {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter number = ");
		int num = scn.nextInt();
		
		int rev = 0;
		
		while(num!=0) {
			
			rev = rev *10 + num%10;
			num= num/10;
		}
		
		System.out.println(rev);

	}
	

}
