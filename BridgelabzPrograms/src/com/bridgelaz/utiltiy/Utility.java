package com.bridgelaz.utiltiy;

import java.util.Scanner;

public class Utility {
	
static	Scanner sc=new Scanner(System.in);
	/*
	*//**
	 * This method is used to input as a string 
	 * 
	 * @return
	 *//*
	public String inputString() {
		Scanner scanner =new Scanner(System.in);
		String demo=scanner.next();
		return null;
	}	
	
	
	*//**
	 * This method is used to replace the string given 
	 * input provided by the user.  
	 * @param template String is predefined    
	 * @param name 
	 * @return
	 *//*
	public String replace(String template ,String name) {
		
		String output=template.replace("<<UserName>>",name);
		System.out.println(output);
		return output;
	}
*/
	
public static int getInt(){
	
	int integer=sc.nextInt();
	return integer;
	
}

public static long getLong(){
	
	
	long longValue=sc.nextLong();
	return longValue;
	
}
public static String getString(){
	
	String string=sc.nextLine();
	return string;
	
}

public static void isAnagram(String s1,String s2) {
	
	char[] storeCharS1=new char[s1.length()];
	char[] storeCharS2=new char[s2.length()];
	
	for(int i=0;i<storeCharS1.length;i++) {
		char ch=s1.charAt(i);
		storeCharS1[i]=ch;
		}
	
	for(int i=0;i<storeCharS2.length;i++) {
		char ch=s2.charAt(i);
		storeCharS2[i]=ch;
		}
	
	for(int i=0;i<storeCharS1.length;i++) {
		
		for(int j=i+1;j<storeCharS2.length;j++) {
			
			if(storeCharS1[i]>storeCharS1[j]) {
				
				char ch=storeCharS1[i];
				storeCharS1[i]=storeCharS1[j];
				storeCharS1[j]=ch;
			}
		}
	}
	
	s1="";
	for(int i=0;i<storeCharS1.length;i++)
		s1+=storeCharS1[i];
	
	
	
	
	for(int i=0;i<storeCharS2.length;i++) {
		char ch=s2.charAt(i);
		storeCharS2[i]=ch;
		}
	
	for(int i=0;i<storeCharS2.length;i++) {
		
		for(int j=i+1;j<storeCharS2.length;j++) {
			
			if(storeCharS2[i]>storeCharS2[j]) {
				
				char ch=storeCharS2[i];
				storeCharS2[i]=storeCharS2[j];
				storeCharS2[j]=ch;
			}
		}
	}
	
	s2="";
	for(int i=0;i<storeCharS2.length;i++)
		s2+=storeCharS2[i];
	
	if(s1.equals(s2))
		System.out.println("Both Strings are Anagram of each other");
	else
System.out.println("Both Strings are not Anagram of each other");
	
	
}

}
