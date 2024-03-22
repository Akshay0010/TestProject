package ProgramPractice;

import java.util.Scanner;

public class ReverseString {

	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);
		System.out.println("Enter string = ");
		String str = scn.nextLine();
		String rev = "";

		int leng = str.length();

		for (int i = leng - 1; i >= 0; i--) {

			rev = rev + str.charAt(i);

		}

		System.out.println(rev);
	}

	
	
}
