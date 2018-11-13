package com.bridgelab.utility;

import java.util.Random;
import java.util.Scanner;

public class Utility {
//creating object of Scanner class
	static Scanner sc = new Scanner(System.in);

	
	/**This method is used to take integer input from user
	 * @return integer value
	 */
	public static int getInt() {

		int integer = sc.nextInt();
		return integer;

	}

	/**This method is used to take long input from user
	 * @return long value
	 */
	public static long getLong() {

		long longValue = sc.nextLong();
		return longValue;

	}
	
	/**This method is used to take double input from user
	 * @return double value
	 */
	public static double getDouble() {
		
		double doubleValue=sc.nextDouble();
		return doubleValue;
	}

	/**This method is used to take float input from user
	 * @return float value
	 */
	public static float getFloat() {
 		float floatValue = sc.nextFloat();
		return floatValue;
 	}
	
	/**This method is used to take String input from user
	 * @return String 
	 */
	public static String getString() {

		String string = sc.nextLine();
		return string;

	}

	/**This method is used to replace Given String with the user
	 *  String
	 * @param string  Given Sentence or String
	 * @param str     this variable will refer to that part of string of sentence that we  want to replace
	 * @param replaceWith  string given by user
	 * @return
	 */
	public static String replace(String string, String str, String replaceWith) {

		String ansString = string.replace(str, replaceWith);
		return ansString;
	}

	/**This method is used to get percentage of head and tail 
	 * in given no of turns
	 * @param n No.of turns
  	 */
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

	
	
	/**This method is used to determine whether 
	 * given year is Leap or not
	 * @param year year enter by user
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

	/**This method is used to get all values of power of 2 
	 * within given range
	 * @param limit range given by user 
	 */
	public static void power_2(int limit){
		   
		for(int i=0;i<=limit;i++) {
			int value =(int)Math.pow(2, i);
			
			System.out.println(value);}
	}
	
	
	
	/** This method is used to ensure 
	 * that entered value is greater than zero
	 * @param n value entered by user
	 * @return noCheck(n);
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
	
	
	/**This method is used to get nth Harmonic value 
	 * @param n
	 */
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
		
		int totalCount=0; 
		int[] userNumber=new int[numberRange];
		System.out.println("Enter values");
		for(int i=0;i<numberRange;i++)
			userNumber[i]=getInt();
		
		int add=0,jthValue=0;
		for(int i=0;i<userNumber.length;i++) {
			
			for(int j=i+1;j<userNumber.length;j++) {
				 
				
					add=userNumber[i]+userNumber[j];
					 jthValue=userNumber[j];
					
								
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
	 * WindChill program
	 * 
	 * @param t
	 * @param v
	 */
	public static void getWindChill(double t,double v) {
	
	if(t>50 ||(v<3 || v>120 )) {
		System.out.println("enter temperature value <=50 & Velocity >3 & <=120"); 
		t=getDouble();
		v=getDouble();
		if(t>50 ||(v<3 || v>120 ))
		getWindChill(t, v);
	}
	
	if(t<=50 &&(v>=3 || v<=120 )) {
	
	double windChill=35.74+0.6215*t+(.4275*t-35.75)*Math.pow(v,0.16);
	System.out.println(windChill);}
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

	public static int[] getPrime() {
		int[] primeArray = new int[1000];
		boolean isPrime = true;
		int count = 0;
		for (int i = 0; i <= 1000; i++) {
			if (i == 0 || i == 1)
				continue;

			isPrime = true;
			for (int j = 2; j <= Math.sqrt(i); j++) {

				if (i % j == 0)
					isPrime = false;
			}

			if (isPrime) {
				//System.out.println(i);
				primeArray[count++] = i;
			}
		}
		return primeArray;
	}

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
				if (reverse == i)
					storePalindrome[count1++] = i;
			}
		}
		System.out.println("Prime Numbers that are Palindrome are as follows");

		for (int i = 0; i < storePalindrome.length; i++) {

			if (storePalindrome[i] > 0)
				System.out.println(storePalindrome[i]);

		}

	}

	/**Prime No that are Anagram
	 * 
	 */
	public static void getPrimeAnagram() {

	int count1=0;	
		 int[] primeArray=Utility.getPrime(); 
		 
		  for(int i=0;i<primeArray.length;i++)
		 { if(primeArray[i]!=0) 
			count1++;
		 }
		  int[] x=new int[count1]; 
		  
		  for(int i=0;i<x.length;i++)
			 { if(primeArray[i]!=0) 
				x[i]=primeArray[i];
			 }
		 
		 

/*	int[] x = {
				2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97, 101,
				103, 107, 109, 113, 127, 131, 137, 139, 149, 151, 157, 163, 167, 173, 179, 181, 191, 193, 197, 199, 211,
				223, 227, 229, 233, 239, 241, 251, 257, 263, 269, 271, 277, 281, 283, 293, 307, 311, 313, 317, 331, 337,
				347, 349, 353, 359, 367, 373, 379, 383, 389, 397, 401, 409, 419, 421, 431, 433, 439, 443, 449, 457, 461,
				463, 467, 479, 487, 491, 499, 503, 509, 521, 523, 541, 547, 557, 563, 569, 571, 577, 587, 593, 599, 601,
				607, 613, 617, 619, 631, 641, 643, 647, 653, 659, 661, 673, 677, 683, 691, 701, 709, 719, 727, 733, 739,
				743, 751, 757, 761, 769, 773, 787, 797, 809, 811, 821, 823, 827, 829, 839 };
*/
		
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
				System.out.println(x[p]);}

		}

	
	}
	
	

	}


	
	