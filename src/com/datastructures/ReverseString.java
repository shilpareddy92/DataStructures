package com.datastructures;

public class ReverseString {

	public static void main(String args[]) {
//Approach1
		String str = "shilpa";
		String reverse = "";

		for (int i = str.length() - 1; i >= 0; i--) {
			reverse = reverse + str.charAt(i);
		}
		System.out.println(reverse);
		
		
		
		//Approach2
		StringBuffer b= new StringBuffer(str);
		System.out.println(b.reverse());
	}

}
