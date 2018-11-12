package com.bridgelab.utility;

import java.util.Random;
import java.util.Scanner;

/**
 * @author bridgeit
 *
 */
/**
 * @author bridgeit
 *
 */
public class Utility {

	static Scanner sc = new Scanner(System.in);

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

	public static String replace(String string, String str, String replaceWith) {

		String ansString = string.replace(str, replaceWith);
		return ansString;
	}

	public static void getProbability(int n) {

		Random r = new Random();
		float heads = 0;
		for (int i = 1; i <= n; i++) {
			int side = r.nextInt(2);// it generates random value less than 2

			if (side == 1) {
				heads++;
			}
		}
		float headpercet = heads / n * 100;

		float tailpercent = 100 - headpercet;
		System.out.println("Percentage of head :" + headpercet);
		System.out.println("Percentage of tail :" + tailpercent);

	}

	
	
	/**
	 * @param year
	 */
	public static void isLeepYear(int year) {

		int count = 0, q = year, r = 0;
		while (q > 0) {
			r = q % 10;
			q = q / 10;
			count++;
		}

		if (count == 4) {

			if (year % 100 == 0 && year % 400 == 0)
				System.out.println(year + " is a Leap year");
			else
				System.out.println(year + " in not a leap year");
		}

		else {
			System.out.println("Year must have four digit ,So Enter 4 digit");
			year = getInt();
			isLeepYear(year);
		}
	}

	/**here we can know powers of 2
	 * @param limit
	 */
	public static void power_2(int limit){
		   
		for(int i=0;i<=limit;i++) {
			int value =(int)Math.pow(2, i);
			
			System.out.println(value);}
	}
	
	
	
	/** HarmonicNo program
	 * @param n
	 * @return
	 */
	public static int noCheck(int n) {
		if(n<=0) {
			System.out.println("enter value greater than 0 ");
			n=new Scanner(System.in).nextInt();
		}
		
		if(n>0)
		return n;
		
		return noCheck(n);
	}
	
	
	public static void nthHarmonicValue(int n) {
		float sum=0;
		for(float i=1;i<=n;i++) {
		sum+=1/i; 	
		}
		System.out.println("Nth Harmonic value "+sum);
	}
	 
	
	
	
	/**Prime Factorization
	 * @param n
	 */
	public static void getPrimeFactor(int n) {
		boolean isPrime=true;
		//int n=147;
		int N=n;
		
			
			
			for(int i=2;i<=n;i++){
           isPrime=true;
           for(int j=2;j<=Math.sqrt(i);j++)
				if(n%j==0) {
					isPrime=false;
					 }
				
			
			if(isPrime) {
				N=n;
				while(N%i==0) {
					N=N/i;
				System.out.println(i);}
			}
			}	
	}
		
	
	
	/** Gambling Program
	 * @param stake
	 * @param goal
	 * @param times
	 */
	public static void gamblingResult(int stake,int goal,float times){
		float wincount=0,losecount=0;
		Random r= new Random();
		for(int i=1;i<=times;i++) {
			
			int j=r.nextInt(2);
			
			if(j==1)
				wincount++;
			else
				losecount++;
				
		}
	int	wincountcasting=(int)wincount;
		System.out.println("No of times wins =>"+wincountcasting);
		
		System.out.println("win Percentage =>"+(wincount/times)*100+" "+"Lose Percentage "+(losecount/times)*100);
		
		
		
	}
	
	
	

	/**CoupanNo  
	 * @param distinctCoupan
	 */
	public static void coupanNoGenaerator(int distinctCoupan) {
		int[] distinctCoupanArray=new int[distinctCoupan];
		boolean isDistinct=true;int randomNoCount=0;int coupanCount=0,k=0;
		Random r=new Random();
	while(coupanCount<distinctCoupan){
		isDistinct=true;
		int randomNo=r.nextInt();
		randomNoCount++;
		
		for(int i=0;i<distinctCoupanArray.length;i++) {
			
			if(randomNo==distinctCoupanArray[i]|| randomNo<0 )
				isDistinct=false;
		}
		
		if(isDistinct) {
			if(k<distinctCoupanArray.length)
			distinctCoupanArray[k++]=randomNo;
			coupanCount++;
			}
			
	
	}
	System.out.println("Random Number Needed to get Required Distinct Coupans => "+randomNoCount);
	System.out.println("These are the Distinct Coupans");
	for(int j=0;j<distinctCoupanArray.length;j++)
	System.out.println(distinctCoupanArray[j]);
	}
	
	public static void get2DArrayInput(int M,int N ) {
		
		int[][] input2DArray=new int[M][N];
		System.out.println("Now enter values");	
		for(int i=0;i<M;i++) {
			
			for(int j=0;j<N;j++) {
				
				input2DArray[i][j]=getInt();
			}
		}
		
	
for(int i=0;i<M;i++) {
			
			for(int j=0;j<N;j++) {
		 
				System.out.print(input2DArray[i][j]+" ");
			}
			System.out.println("");
		}
	}
	
	/**10th program,this triplet code can have some problem ,i have to see again properly
	 * @param numberRange
	 */
	public static void getTriplet(int numberRange) {
		
		int count=0,totalCount=0; 
		int[] userNumber=new int[numberRange];
		System.out.println("Enter values");
		Scanner sc=new Scanner(System.in);
		for(int i=0;i<numberRange;i++)
			userNumber[i]=sc.nextInt();
		
		int k=0,add=0,jthValue=0;
		 int[] tripletStore=new int[userNumber.length]; 
		for(int i=0;i<userNumber.length;i++) {
			
			for(int j=i+1;j<userNumber.length;j++) {
				 
				if(i==count) {
					add=userNumber[i]+userNumber[j];
					 jthValue=userNumber[j];
					count++;
				}
				
				if(j+1<userNumber.length) {
				if(add+userNumber[j+1]==0) {
System.out.println(userNumber[i]+" "+jthValue+" "+userNumber[j+1]);
System.out.println("--------");
totalCount++;
				}
				}
			}
			
		}
	System.out.println("Total triplet Possible => "+totalCount);	
}
	
	
	/** EuclideanDistance
	 * @param x
	 * @param y
	 */
	public static void getDistance(int x, int y) {
		
		  double EuclideanDistance=Math.sqrt(x*x+y*y);
		  System.out.println("Your Euclidean Distance is => "+EuclideanDistance);
		}
	
	
	public static void getElapsedTime(int i) {
		long millisec1=0;
		long millisec2=0;
		if(i==1) {
			System.out.println("Started");
			millisec1=System.currentTimeMillis();
			}
		i=getInt();
		if(i==2) {
			System.out.println("Stopped");
			millisec2=System.currentTimeMillis();
		System.out.println("Elapsed Time is "+(millisec2- millisec1)/1000+" sec");
		
	
		}

		
	}
	
	
	/**QuadraticEquation
	 * @param a
	 * @param b
	 * @param c
	 */
	public static void getRoots(int a,int b,int c) {
		
		int delta=((b*b)-(4*a*c));
			double firstRoot=(-b+Math.sqrt(delta))/2*a;
			double secondRoot=(-b-Math.sqrt(delta))/2*a;
		System.out.println("First Root of x = "+firstRoot+" Second Root of x ="+secondRoot);
		}
	
	
	
	
	
	
	
	/**
	 * @param s1
	 * @param s2
	 */
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
		 System.out.println("Prime Numbers that are Palindrome are as follows");

		for (int i = 0; i < storePalindrome.length; i++) {
			
			  if (storePalindrome[i] > 0) { 
				 // System.out.println(storePalindrome[i]);
			  }

		}

		for (int i = 0; i < storePrime.length; i++) {
			String primeNo = "";
			primeNo=storePrime[i]+"";
			//System.out.println(primeNo);
			
			
			char[] storeCharS1 = new char[5];
			char[] storeCharS2 = new char[5];
/*
			for (int i = 0; i < storeCharS1.length; i++) {
				char ch = primeNo.charAt(i);
				storeCharS1[i] = ch;
			}

			for (int i = 0; i < storeCharS2.length; i++) {
				char ch = primeNo.charAt(i);
				storeCharS2[i] = ch;
			}


	}*/
	
			}
	}
}

