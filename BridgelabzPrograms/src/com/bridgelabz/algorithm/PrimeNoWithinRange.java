/******************************************************************************
 *  Purpose:To Find All Prime Numbers within Given Range.
 *
 *  @author  Saurabh
 *  @version 1.0
 *  @since   13-11-2018
 *
 ******************************************************************************/

package com.bridgelabz.algorithm;

import com.bridgelab.utility.Utility;

public class PrimeNoWithinRange {

	public static void main(String[] args) {

		// calling method of Utility class and initializing primeArray from array return
		// by method
		int[] primeArray = Utility.getPrime();

		// Printing the array values
		for (int i = 0; i < primeArray.length; i++) {
			if (primeArray[i] > 0)// Printing values greater that zero
				System.out.println(primeArray[i]);

		}
	}

}
