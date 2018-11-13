package com.bridgelabz.algorithm;
import com.bridgelab.utility.Utility;
public class PrimeNoWithinRange {

	public static void main(String[] args) {

		int[] primeArray=Utility.getPrime();
		for(int i=0;i<primeArray.length;i++) {
			if(primeArray[i]>0) 
		System.out.println(primeArray[i]);
			
			
		}
	}
	
}

