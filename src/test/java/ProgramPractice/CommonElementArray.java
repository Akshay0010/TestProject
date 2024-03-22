package ProgramPractice;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class CommonElementArray {

	public static void main(String[] args) {
		
		int[] arr1= {2,3,5,8,9,43,12};
		int[] arr2 = { 4,3,8,7,9,12};
		
		// output = {3,8}
		
		List<Integer> map = new ArrayList<>();
		for(int i=0; i<arr1.length; i++)
		{
			for(int j=0; j<arr2.length; j++)
			{
				if((arr1[i]==arr2[j]))
				{
					map.add(arr1[i]);
					break;
				}
			}
		}
		
		System.out.println(map);
	}

}
