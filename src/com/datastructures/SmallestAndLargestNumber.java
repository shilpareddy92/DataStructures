package com.datastructures;

public class SmallestAndLargestNumber {

	public static void main(String[] args) {
		int a[] = {1,10,20,30,40,50,100};
		
		int min =Integer.MAX_VALUE;
		int max= Integer.MIN_VALUE;
		
		for(int i=0;i<a.length;i++) {
			
			if(a[i]<min)
			{
				min= a[i];
			}
			else if(a[i]>max)
			{
				max= a[i];
			}
		}
		
		System.out.println(min);
		System.out.println(max);
		
	}
		

}
