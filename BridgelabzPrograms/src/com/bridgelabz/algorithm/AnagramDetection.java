/******************************************************************************
 *  Purpose:To Find whether two strings are Anagram of each other.
 *
 *  @author  Saurabh
 *  @version 1.0
 *  @since   13-11-2018
 *
 ******************************************************************************/

package com.bridgelabz.algorithm;

import com.bridgelab.utility.Utility;

public class AnagramDetection {

	public static void main(String[] args) {
		System.out.println("Enter first String");

		// Taking input from user for first string
		String s1 = Utility.getString();
		System.out.println("Enter Second String");

		// Taking input from user for first string
		String s2 = Utility.getString();

		// calling method of Utility class
		Utility.isAnagram(s1, s2);

	}

}
