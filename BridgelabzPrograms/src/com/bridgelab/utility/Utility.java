package com.bridgelab.utility;

import java.util.Random;
import java.util.Scanner;

public class Utility {
//creating object of Scanner class
	static Scanner sc = new Scanner(System.in);

	/**
	 * This method is used to take integer input from user
	 * 
	 * @return integer value
	 */
	public static int getInt() {

		int integer = sc.nextInt();
		return integer;

	}

	/**
	 * This method is used to take long input from user
	 * 
	 * @return long value
	 */
	public static long getLong() {

		long longValue = sc.nextLong();
		return longValue;

	}

	/**
	 * This method is used to take double input from user
	 * 
	 * @return double value
	 */
	public static double getDouble() {

		double doubleValue = sc.nextDouble();
		return doubleValue;
	}

	/**
	 * This method is used to take float input from user
	 * 
	 * @return float value
	 */
	public static float getFloat() {
		float floatValue = sc.nextFloat();
		return floatValue;
	}

	/**
	 * This method is used to take String input from user
	 * 
	 * @return String
	 */
	public static String getString() {

		String string = sc.nextLine();
		return string;

	}

	/**
	 * This method is used to replace Given String with the user String
	 * 
	 * @param string      Given Sentence or String
	 * @param str         this variable will refer to that part of string of
	 *                    sentence that we want to replace
	 * @param replaceWith string given by user
	 * @return
	 */
	public static String replace(String string, String str, String replaceWith) {

		// Using predefined method of String class
		String ansString = string.replace(str, replaceWith);
		return ansString;
	}

	/**
	 * This method is used to get percentage of head and tail in given no of turns
	 * 
	 * @param n No.of turns
	 */
	public static void getProbability(int n) {

		// creating object of Random class of java.util package
		Random r = new Random();
		float heads = 0;

		// loop will iterate till user value
		for (int i = 1; i <= n; i++) {

			// it generates random value less than 2
			int side = r.nextInt(2);

			// considering 1 as head
			if (side == 1) {
				heads++;
			}
		}

		// finding head percentage
		float headpercet = heads / n * 100;

		float tailpercent = 100 - headpercet;
		System.out.println("Percentage of head :" + headpercet);
		System.out.println("Percentage of tail :" + tailpercent);

	}

	/**
	 * This method is used to determine whether given year is Leap or not
	 * 
	 * @param year year enter by user
	 */
	public static void isLeepYear(int year) {

		int count = 0, q = year, r = 0;

		// Counting digits of year entered to ensure 4 digit
		while (q > 0) {
			r = q % 10;
			q = q / 10;
			count++;
		}

// comparing count value with 4 to ensure count have 4 digits		
		if (count == 4) {

			// Condition for Leap Year
			if (year % 100 == 0 && year % 400 == 0)
				System.out.println(year + " is a Leap year");
			else
				System.out.println(year + " in not a leap year");
		}

		else {
			System.out.println("Year must have four digit ,So Enter 4 digit");
			year = getInt();

			// Using Recursion i.e calling same within itself
			isLeepYear(year);
		}
	}

	/**
	 * This method is used to get all values of power of 2 within given range
	 * 
	 * @param limit range given by user
	 */
	public static void power_2(int limit) {

		// loop will iterate until user value
		for (int i = 0; i <= limit; i++) {

			// finding power of 2 using Math.pow() function
			int value = (int) Math.pow(2, i);

			System.out.println(value);
		}
	}

	/**
	 * This method is used to ensure that entered value is greater than zero
	 * 
	 * @param n value entered by user
	 * @return noCheck(n);
	 */
	public static int noCheck(int n) {

		// checking if n value is less than zero
		if (n <= 0) {
			System.out.println("enter value greater than 0 ");
			n = getInt();
		}

		if (n > 0)
			return n;

		return noCheck(n);
	}

	/**
	 * This method is used to get nth Harmonic value
	 * 
	 * @param n user value
	 */
	public static void nthHarmonicValue(int n) {
		float sum = 0;

		// loop will iterate until user value
		for (float i = 1; i <= n; i++) {

			// adding reciprocal of all user value
			sum += 1 / i;
		}
		System.out.println("Nth Harmonic value " + sum);
	}

	/**
	 * This method is used to get All Prime Factors of given Number
	 * 
	 * @param n user value
	 */
	public static void getPrimeFactor(int n) {
		boolean isPrime = true;
		// int n=147;
		int N = n;

		// Finding all primes Numbers till user value
		for (int i = 2; i <= n; i++) {
			isPrime = true;

			// iterating loop to check each value of i is Prime or not
			for (int j = 2; j <= Math.sqrt(i); j++)
				if (n % j == 0) {
					isPrime = false;
				}

			/**
			 * if number is prime ,then only come inside this if block
			 */
			if (isPrime) {
				N = n;// user value ,for which we have to find Prime factors

				/**
				 * iterating while loop until remainder is Zero if i divides user
				 * value(example-12) ,then i is our prime factor, if again divide then again i
				 * is our Prime factor.
				 * 
				 */
				while (N % i == 0) {

					// updating N value
					N = N / i;

					// Printing Prime Factors of user value
					System.out.println(i);
				}
			}
		}
	}

	/**
	 * This is used to get win percentage and loss percentage in gambling
	 * 
	 * @param stake
	 * @param goal
	 * @param times no of times user wants to play
	 */
	public static void gamblingResult(int stake, int goal, float times) {
		float wincount = 0, losecount = 0;
		Random r = new Random();

		// iterating loop till no of times user Entered
		for (int i = 1; i <= times; i++) {

			// this will generate numbers less than two means 0 or 1
			int j = r.nextInt(2);

			// Considering 1 as win
			if (j == 1)
				wincount++;
			else
				losecount++;// considering Zero as lose

		}
		// Performing Type casting from float to integer
		int wincountcasting = (int) wincount;
		System.out.println("No of times wins =>" + wincountcasting);

		System.out.println(
				"win Percentage =>" + (wincount / times) * 100 + " " + "Lose Percentage " + (losecount / times) * 100);

	}

	/**
	 * This method is used to generate distinct coupans
	 * 
	 * @param distinctCoupan No. of coupans user wants
	 */
	public static void coupanNoGenaerator(int distinctCoupan) {
		// Assigning array size as distinctCoupan i.e user value
		int[] distinctCoupanArray = new int[distinctCoupan];

		// To check random generated is distinct or not
		boolean isDistinct = true;

		// To count Number of random number generated
		int randomNoCount = 0;

		// To keep record of Number of Coupans we have generated
		int coupanCount = 0, k = 0;

		// creating object of Random class to generate random numbers
		Random r = new Random();

		/**
		 * loop will iterate till coupanCount is less than user value i.e
		 * distinctCoupan, because coupanCount is starting with zero
		 */
		while (coupanCount < distinctCoupan) {
			isDistinct = true;
			int randomNo = r.nextInt();
			randomNoCount++;

			/*
			 * comparing random number generated with each value in array, if Random number
			 * is distinct then we store in distinctCounArray, otherwise not
			 */
			for (int i = 0; i < distinctCoupanArray.length; i++) {

				// comparison of random number in all array value or
				// checking is random no is less than zero
				if (randomNo == distinctCoupanArray[i] || randomNo < 0)
					isDistinct = false;
			}

			/**
			 * if random number generated is unique then only , it will enter into if block
			 */
			if (isDistinct) {
				if (k < distinctCoupanArray.length)

					// incrementing index of array
					distinctCoupanArray[k++] = randomNo;

				// counting distinct coupans
				coupanCount++;
			}

		}
		System.out.println("Random Number Needed to get Required Distinct Coupans => " + randomNoCount);
		System.out.println("These are the Distinct Coupans");

		// Printing distinct Coupans
		for (int j = 0; j < distinctCoupanArray.length; j++)
			System.out.println(distinctCoupanArray[j]);
	}

	/**
	 * This method is used to get input in two dimensional array and print elements
	 * of array
	 * 
	 * @param M no. of Rows
	 * @param N no. of Column
	 */
	public static int[][] get2DArrayInput(int M, int N) {

		int[][] input2DArray = new int[M][N];
		System.out.println("Now enter values");

		// initializing user values to 2D array
		for (int i = 0; i < M; i++) {

			for (int j = 0; j < N; j++) {

				input2DArray[i][j] = getInt();
			}
		}

		// returning array having user value
		return input2DArray;

	}

	/**
	 * This method is used to get all possible triplet within given range
	 * 
	 * @param numberRange No. of values user wants to put
	 */
	public static void getTriplet(int numberRange) {
		// To count total Triplet generated
		int totalCount = 0;

		/**
		 * This array contains all user value from which we have to find Possible no of
		 * Triplets
		 */
		int[] userNumber = new int[numberRange];
		System.out.println("Enter values");

		// initializing array with user value
		for (int i = 0; i < numberRange; i++)
			userNumber[i] = getInt();

		// this add will have addition of i and jthValue

		int add = 0;
		/**
		 * we are storing array value of j index in jthValue , because we print jthValue
		 * if triplet is Found
		 */
		int jthValue = 0;
		for (int i = 0; i < userNumber.length; i++) {

			for (int j = i + 1; j < userNumber.length; j++) {

				// adding value in array at i and j index
				add = userNumber[i] + userNumber[j];
				// storing array value of j index in jthValue
				jthValue = userNumber[j];

				if (j + 1 < userNumber.length) {
					// pointing value in array next to j index
					if (add + userNumber[j + 1] == 0) {
						System.out.println(userNumber[i] + " " + jthValue + " " + userNumber[j + 1]);
						System.out.println("--------");
						totalCount++;
					}
				}
			}

		}
		System.out.println("Total triplet Possible => " + totalCount);
	}

	/**
	 * This method is used to get Euclidean distance for given X and Y coordinates
	 * 
	 * @param x x-coordinate
	 * @param y y-coordinate
	 */
	public static void getDistance(int x, int y) {

		// Finding EuclideanDiatance using static squareRoot function of Math class
		double EuclideanDistance = Math.sqrt(x * x + y * y);
		System.out.println("Your Euclidean Distance is => " + EuclideanDistance);
	}

	/**
	 * This method is used to get Elapsed time in StopWatch
	 * 
	 * @param i value given by user within specified Set of Values
	 */
	public static void getElapsedTime(int i) {
		long millisec1 = 0;
		long millisec2 = 0;
		if (i == 1) {
			System.out.println("Started");

			// using static method of System class to get current time
			millisec1 = System.currentTimeMillis();
		}
		i = getInt();
		if (i == 2) {
			System.out.println("Stopped");
			millisec2 = System.currentTimeMillis();

			// Printing Elapsed time
			System.out.println("Elapsed Time is " + (millisec2 - millisec1) / 1000 + " sec");

		}

	}

	/**
	 * This method is used to get roots of given Quadratic Equation ax^2+bx+c=0
	 * 
	 * @param a coefficient of x^2
	 * @param b coefficient of x
	 * @param c constant
	 */
	public static void getRoots(int a, int b, int c) {

		// finding delta using formula
		int delta = ((b * b) - (4 * a * c));

		// finding roots using formula
		double firstRoot = (-b + Math.sqrt(delta)) / 2 * a;
		double secondRoot = (-b - Math.sqrt(delta)) / 2 * a;
		System.out.println("First Root of x = " + firstRoot + " Second Root of x =" + secondRoot);
	}

	/**
	 * This method is used to get Effective Temperature (WindChill )
	 * 
	 * @param t temperature
	 * @param v velocity
	 */
	public static void getWindChill(double t, double v) {

		// checking if user value is less than specified range
		if (t > 50 || (v < 3 || v > 120)) {
			System.out.println("enter temperature value <=50 & Velocity >3 & <=120");
			t = getDouble();
			v = getDouble();
			if (t > 50 || (v < 3 || v > 120))
				getWindChill(t, v);// using recursion
		}

		if (t <= 50 && (v >= 3 || v <= 120)) {

			// find windChill using formula
			double windChill = 35.74 + 0.6215 * t + (.4275 * t - 35.75) * Math.pow(v, 0.16);
			System.out.println(windChill);
		}
	}

	/**
	 * This method is used to determine whether given two Strings are anagram of
	 * each other or not
	 * 
	 * @param s1 first String
	 * @param s2 second String
	 */
	public static void isAnagram(String s1, String s2) {
		String spaceS1 = "";
		String spaceS2 = "";
		/**
		 * removing space from String s1 if any space is present in user string
		 */
		for (int i = 0; i < s1.length(); i++) {
			char ch = s1.charAt(i);
			if (ch == ' ')
				continue;
			spaceS1 += ch;
		}
		s1 = "";

		// converting user String into small letters
		s1 = spaceS1.toLowerCase();
		/**
		 * removing space from String s1 if any space is present in user string
		 */
		for (int i = 0; i < s2.length(); i++) {
			char ch = s2.charAt(i);
			if (ch == ' ')
				continue;
			spaceS2 += ch;
		}
		s2 = "";
		// converting user String into small letters
		s2 = spaceS2.toLowerCase();

		// this char array is used to store each character of s1 String
		char[] storeCharS1 = new char[s1.length()];
		// this char array is used to store each character of s2 String
		char[] storeCharS2 = new char[s2.length()];

		// storing each character of string s1 in char array
		for (int i = 0; i < storeCharS1.length; i++) {
			char ch = s1.charAt(i);
			storeCharS1[i] = ch;
		}

		// storing each character of string s2 in char array
		for (int i = 0; i < storeCharS2.length; i++) {
			char ch = s2.charAt(i);
			storeCharS2[i] = ch;
		}

		// Sorting character arrays1 using bubble sort
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
		// concatenating characters to string s1
		for (int i = 0; i < storeCharS1.length; i++)
			s1 += storeCharS1[i];

		// Sorting character arrays2 using bubble sort
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
		// concatenating characters to string s2
		for (int i = 0; i < storeCharS2.length; i++)
			s2 += storeCharS2[i];

		// comparing Strings s1 and s2
		if (s1.equals(s2))
			System.out.println("Both Strings are Anagram of each other");
		else
			System.out.println("Both Strings are not Anagram of each other");

	}

	/**
	 * This method is used to get all prime Numbers within 1000 Range
	 * 
	 * @return This method will return an Array containing all Prime Numbers
	 */
	public static int[] getPrime() {
		int[] primeArray = new int[1000];
		boolean isPrime = true;
		int count = 0;
		for (int i = 0; i <= 1000; i++) {
			if (i == 0 || i == 1)
				continue;

			// checking for Prime numbers or not
			isPrime = true;
			for (int j = 2; j <= Math.sqrt(i); j++) {

				if (i % j == 0)
					isPrime = false;
			}

			if (isPrime)
				primeArray[count++] = i;

		}
		return primeArray;
	}

	/**
	 * This method is used to get all Prime Numbers that are Palindrome
	 */
	public static void getPrimePalindrome() {

		int[] storePrime = new int[1000];
		int[] storePalindrome = new int[1000];
		boolean isPrime = true;
		int count = 0, count1 = 0;
		for (int i = 0; i <= 1000; i++) {
			if (i == 0 || i == 1)
				continue;

			isPrime = true;
			for (int j = 2; j <= Math.sqrt(i); j++) {

				if (i % j == 0)
					isPrime = false;
			}

			if (isPrime) {

				storePrime[count++] = i;

			}

			if (isPrime) {
				int num = i, remainder = 0;
				int reverse = 0;
				while (num > 0) {
					remainder = num % 10;
					num = num / 10;
					reverse = reverse * 10 + remainder;
				}
				// comparing reverse with i value
				if (reverse == i)
					storePalindrome[count1++] = i;
			}
		}
		System.out.println("Prime Numbers that are Palindrome are as follows");

		for (int i = 0; i < storePalindrome.length; i++) {
			/**
			 * storePlaindrome is integer array , so we are printing value greater than zero
			 */
			if (storePalindrome[i] > 0)
				System.out.println(storePalindrome[i]);

		}

	}

	/**
	 * This method is used to get All Prime numbers that are Anagram
	 * 
	 */
	public static void getPrimeAnagram() {

		int count1 = 0;
		
		// initializing array using getPrime method of Utility class
		int[] primeArray = Utility.getPrime();

		// Counting non- zero elements of primeArray
		for (int i = 0; i < primeArray.length; i++) {
			if (primeArray[i] != 0)
				count1++;
		}
		//creating array with count1 length
		int[] x = new int[count1];

		//initializing integer array with non-zero elements of primeArray
		for (int i = 0; i < x.length; i++) {
			if (primeArray[i] != 0)
				x[i] = primeArray[i];
		}

		
// creating string array with integer array length 
		String[] sAray = new String[x.length]; 
		String[] compareAray = new String[x.length];
		for (int i = 0; i < x.length; i++) {

			sAray[i] = Integer.toString(x[i]);
		}
		int i = 0, j = 0, count = 0;
		String s3 = "";

		for (int m = 0; m < sAray.length; m++) {
			String s1 = sAray[m];

			char[] ch2 = new char[s1.length()];

			for (i = 0; i < s1.length(); i++) {

				char ch = s1.charAt(i);
				ch2[i] = ch;
			}
			for (j = 0; j < ch2.length; j++) {
				for (int k = j + 1; k < ch2.length; k++) {

					if (ch2[j] > ch2[k]) {

						char temp = ch2[j];
						ch2[j] = ch2[k];
						ch2[k] = temp;
					}

				}
			}
			s1 = "";
			for (i = 0; i < ch2.length; i++)
				s1 = s1 + ch2[i];

			compareAray[m] = s1;

		}

		System.out.println("THe Prime Numbers that are Anagram of each other are as follows");
		for (int p = 0; p < compareAray.length; p++) {

			count = 0;
			for (int q = p + 1; q < compareAray.length; q++) {
				if (compareAray[p].equals(compareAray[q]) & (compareAray[p].equals("")) == false) {

					System.out.println(x[q]);
					compareAray[q] = "";
					count++;

				}
			}
			if (count > 0) {
				System.out.println(x[p]);
			}

		}

	}

}
