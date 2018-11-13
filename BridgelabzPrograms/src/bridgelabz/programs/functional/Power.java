/******************************************************************************
 *  Purpose:To Find Powers of 2 .
 *
 *  @author  Saurabh
 *  @version 1.0
 *  @since   13-11-2018
 *
 ******************************************************************************/

package bridgelabz.programs.functional;

import com.bridgelab.utility.Utility;

public class Power {
	// static variable
	static int N;

	public static void main(String[] args) {
		System.out.println("Enter range through command prompt");

		// Converting String to Integer
		N = Integer.parseInt(args[0]);

		// calling method of Utility class
		Utility.power_2(N);

	}

}
