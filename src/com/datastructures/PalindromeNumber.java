package com.datastructures;

public class PalindromeNumber {

	public static void main(String[] args) {
		int num = 121;
		int reverse= reverse(num);
		System.out.println(reverse);
		if(num==reverse) {
			System.out.println("Palindrome");
		}
		else
		{
			System.out.println("Not Plaindrome");
		}

	}

	public static int reverse(int number) {

		int rev = 0;
		while (number != 0) {

			rev = rev * 10 + number % 10;
			number = number / 10;
		}
		return rev;

	}
}
