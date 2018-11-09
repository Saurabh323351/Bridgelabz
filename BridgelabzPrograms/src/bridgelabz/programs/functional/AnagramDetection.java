package com.bridgelaz.utiltiy;

public class AnagramDetection {

	public static void main(String[] args) {
System.out.println("Enter first String");		
  String s1=Utility.getString();
  System.out.println("Enter Second String"); 
  String s2=Utility.getString();
  Utility.isAnagram(s1, s2);
	}

}

