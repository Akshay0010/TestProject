package NewProject;

import java.util.Scanner;

public class Test1 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter numbers");
		int num =sc.nextInt();
		
		boolean prime = true;
		
		while(num>0)
		{
			for(int i=2; i<num; i++)
			{
				if(num%i==0)
				{
					prime = false;
					break;
					
				}
			}
			
			System.out.println(prime);	
		}
		
		
	}

}
