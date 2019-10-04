package com.datastructures;

public class Junkcharacter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str1 = "shil3#33&80pa";
		String str2= "*&%$#%&()344fthjrsSDRR";
		
		str1=str1.replaceAll("[^a-zA-z0-9]", "");
		System.out.println(str1);
		
		str2=str2.replaceAll("[^a-zA-z0-9]", "");
		System.out.println(str2);
		

	}

}
