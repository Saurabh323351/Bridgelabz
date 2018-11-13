/******************************************************************************
 *  Purpose:To determine Elapsed time in StopWatch.
 *
 *  @author  Saurabh
 *  @version 1.0
 *  @since   13-11-2018
 *
 ******************************************************************************/

package bridgelabz.programs.functional;

import com.bridgelab.utility.Utility;

public class StopWatch {

	public static void main(String[] args) {
		System.out.println("-----StopWatch -----");
		System.out.println("1.Start");
		System.out.println("2.Stop");

		// Taking input from user from predefined set
		int value = Utility.getInt();

		// calling method of Utility class
		Utility.getElapsedTime(value);

	}

}
