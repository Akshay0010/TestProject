package ProgramPractice;

import java.util.HashMap;
import java.util.Map.Entry;

public class StringOccurence {

	public static void main(String[] args) {
		
	// input = aabbbcccc
	// output = a2b3c4
		
	String str = "bbbmmmmmuuuu";
	char stryArray[] = str.toCharArray();
	
	HashMap<Character,Integer> map = new HashMap<>();
	
	for (char c : stryArray)
	{
		if(map.containsKey(c))
		{
			map.put(c, map.get(c)+1);
		}else
		{
			map.put(c, 1);
		}
	}
	
	for(Entry<Character, Integer> e: map.entrySet())
	{
		System.out.println(e.getKey()+"="+e.getValue());
	}

	}

}
