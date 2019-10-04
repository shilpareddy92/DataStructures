package com.datastructures;

public class PrimeNumbers {

	public static void main(String[] args) {

		System.out.println(isPrime(5));
		System.out.println(isPrime(7));
		System.out.println(isPrime(9));
		getPrimeNumbers(7);
		
	}
	
static boolean isPrime(int num)
{
	if(num<=1)
	{
		return false;
	}
	for (int i = 2; i <num; i++) {
		if(num% i== 0)
		{
			return false;
		}

	}
	return true;
}

static boolean getPrimeNumbers(int num)
{
	for(int i=2;i<=num;i++) {
		if(isPrime(i)){
			System.out.println(i);
			}
		
	}
	return false;
	
}

}
