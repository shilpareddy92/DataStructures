package com.datastructures;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class DuplicateelementsInArray {

	public static void main(String[] args) {
		// Approach 1
		
		String str[] = {"java","hi","java","hello","hey"};
		
		for(int i=0;i<str.length;i++)
		{
			for(int j=i+1;j<str.length;j++)
			{
				if(str[i].contains(str[j]))
				{
					System.out.println("Duplicate elememt is "+str[i]);
				}
			}
		}
		
		// Approach 2
		Set<String> set= new HashSet<String>();
		for(String name : str)
		{
			if(set.add(name) == false)
			{
				System.out.println("Duplicate elememt is "+name);
			}
		}
		
		// Approach 2
		
		Map<String,Integer> map=  new HashMap<String,Integer>();
		for(String name : str)
		{
			Integer count = map.get(name);
			if(count == null)
			{
				map.put(name, 1);
			}
			else
			{
				map.put(name, ++count);
			}
		}
		
		
		Set<Entry<String,Integer>> entryset = map.entrySet();
		for(Entry<String,Integer> entry : entryset)
		{
			if(entry.getValue() > 1)
			{
				
				System.out.println("Duplicate elememt is "+entry.getKey());
			}
		}
		

	}

}
