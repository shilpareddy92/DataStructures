package com.datastructures;

public class ReverseInteger {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//Approach 1
		int num=  12345;
		int reverse =0;
		
		while(num!=0)
		{
			reverse= reverse*10+num%10;
			//added  comments
			
			num= num/10;
		}
		
		System.out.println("reverse is "+reverse);
		
		//Approach 2
		int num1=  123456;
	System.out.println(new StringBuffer(String.valueOf(num1)).reverse());
		
		
	}

}
