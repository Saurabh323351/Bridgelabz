package com.bridgelab.utility;

import java.util.Scanner;

public class Utility {

	static Scanner sc = new Scanner(System.in);
	/*
	*//**
		 * This method is used to input as a string
		 * 
		 * @return
		 */

	/*
	 * public String inputString() { Scanner scanner =new Scanner(System.in); String
	 * demo=scanner.next(); return null; }
	 * 
	 * 
	 *//**
		 * This method is used to replace the string given input provided by the user.
		 * 
		 * @param template String is predefined
		 * @param name
		 * @return
		 *//*
			 * public String replace(String template ,String name) {
			 * 
			 * String output=template.replace("<<UserName>>",name);
			 * System.out.println(output); return output; }
			 */

	public static int getInt() {

		int integer = sc.nextInt();
		return integer;

	}

	public static long getLong() {

		long longValue = sc.nextLong();
		return longValue;

	}

	public static String getString() {

		String string = sc.nextLine();
		return string;

	}

	public static void isAnagram(String s1, String s2) {
		String spaceS1 = "";
		String spaceS2 = "";
		// removing space from String s1
		for (int i = 0; i < s1.length(); i++) {
			char ch = s1.charAt(i);
			if (ch == ' ')
				continue;
			spaceS1 += ch;
		}
		s1 = "";

		s1 = spaceS1.toLowerCase();
		for (int i = 0; i < s2.length(); i++) {
			char ch = s2.charAt(i);
			if (ch == ' ')
				continue;
			spaceS2 += ch;
		}
		s2 = "";
		s2 = spaceS2.toLowerCase();

		char[] storeCharS1 = new char[s1.length()];
		char[] storeCharS2 = new char[s2.length()];

		for (int i = 0; i < storeCharS1.length; i++) {
			char ch = s1.charAt(i);
			storeCharS1[i] = ch;
		}

		for (int i = 0; i < storeCharS2.length; i++) {
			char ch = s2.charAt(i);
			storeCharS2[i] = ch;
		}

		for (int i = 0; i < storeCharS1.length; i++) {

			for (int j = i + 1; j < storeCharS2.length; j++) {

				if (storeCharS1[i] > storeCharS1[j]) {

					char ch = storeCharS1[i];
					storeCharS1[i] = storeCharS1[j];
					storeCharS1[j] = ch;
				}
			}
		}

		s1 = "";
		for (int i = 0; i < storeCharS1.length; i++)
			s1 += storeCharS1[i];

		for (int i = 0; i < storeCharS2.length; i++) {
			char ch = s2.charAt(i);
			storeCharS2[i] = ch;
		}

		for (int i = 0; i < storeCharS2.length; i++) {

			for (int j = i + 1; j < storeCharS2.length; j++) {

				if (storeCharS2[i] > storeCharS2[j]) {

					char ch = storeCharS2[i];
					storeCharS2[i] = storeCharS2[j];
					storeCharS2[j] = ch;
				}
			}
		}

		s2 = "";
		for (int i = 0; i < storeCharS2.length; i++)
			s2 += storeCharS2[i];

		if (s1.equals(s2))
			System.out.println("Both Strings are Anagram of each other");
		else
			System.out.println("Both Strings are not Anagram of each other");

	}

	public static void getPrime() {
		boolean isPrime = true;
		for (int i = 0; i <= 1000; i++) {
			if (i == 0 || i == 1)
				continue;

			isPrime = true;
			for (int j = 2; j <= Math.sqrt(i); j++) {

				if (i % j == 0)
					isPrime = false;
			}

			if (isPrime)
				System.out.println(i);
		}
	}

	public static void getPrimePalindromeAnagram() {

		int[] storePrime = new int[1000];
		int count = 0, count1 = 0, count2 = 0;
		int index = 0;
		int[] storePalindrome = new int[1000];
		int[] sortedPrime = new int[1000];
		boolean isPrime = true;
		for (int i = 0; i <= 1000; i++) {
			if (i == 0 || i == 1)
				continue;

			isPrime = true;
			for (int j = 2; j <= Math.sqrt(i); j++) {

				if (i % j == 0)
					isPrime = false;
			}

			if (isPrime) {
				// System.out.println(i);
				storePrime[count++] = i;
				sortedPrime[count2++] = i;
			}

			if (isPrime) {
				int num = i, remainder = 0;
				int reverse = 0;
				while (num > 0) {
					remainder = num % 10;
					num = num / 10;
					reverse = reverse * 10 + remainder;
				}
				if (reverse == i)
					storePalindrome[count1++] = i;
			}
		}
		// System.out.println("Prime Numbers that are Palindrome are as follows");

		for (int i = 0; i < storePalindrome.length; i++) {
			/*
			 * if (storePalindrome[i] > 0) 
			 * System.out.println(storePalindrome[i]);
			 */

		}

		for (int i = 0; i < sortedPrime.length; i++) {

			int primeNo = storePrime[i];
			int arraySize = 0;
			int sum = 0;
			int count3 = 0;
			while (primeNo > 0) {
				primeNo = primeNo / 10;
				arraySize++;
			}
			primeNo = storePrime[i];
			int[] pSeparation = new int[arraySize];
			while (primeNo > 0) {

				int r = primeNo % 10;
				primeNo = primeNo / 10;
				pSeparation[count3++] = r;

			}

			for (int j = 0; j < pSeparation.length; j++) {

				for (int k = j + 1; k < pSeparation.length; k++) {

					if (pSeparation[j] > pSeparation[k]) {

						int temp = pSeparation[j];
						pSeparation[j] = pSeparation[k];
						pSeparation[k] = temp;
					}
				}
			}

			
			int sortedNo = 0;
			for (int j = 0; j < pSeparation.length; j++)
				sortedNo = sortedNo * 10 + pSeparation[j];
			

			sortedPrime[index++] = sortedNo;

		}

		/*for (int j = 0; j < sortedPrime.length; j++)
			System.out.println(storePrime[j]);
	*/
	
int count4=0;
		
for (int j = 0; j < sortedPrime.length-1; j++) {
			count4=0;
			for (int k = j + 1; k < sortedPrime.length; k++) {
if ((sortedPrime[j]==sortedPrime[k]) && (j != k) && sortedPrime[j]!=0 ) {
					System.out.println(storePrime[j]+" " +storePrime[k]);
					count4++;
				}
			}
		/*if(count4>=1)
			System.out.println(storePrime[j]);	
		*/}

	}

}
