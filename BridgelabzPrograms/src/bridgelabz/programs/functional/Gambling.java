/******************************************************************************
 *  Purpose:To Find percentage of Win and Loss.
 *
 *  @author  Saurabh
 *  @version 1.0
 *  @since   13-11-2018
 *
 ******************************************************************************/

package bridgelabz.programs.functional;

import com.bridgelab.utility.Utility;

public class Gambling {

	public static void main(String[] args) {
		System.out.println("Enter your Stake");
		// Taking value of stake from user
		int a = Utility.getInt();
		System.out.println("Enter your Goal");

		// Taking value of goal from user
		int b = Utility.getInt();
		System.out.println("Enter no of Times you want to play");

		// Taking value for no. of turns from the user
		float c = Utility.getInt();

		// calling method of Utility class
		Utility.gamblingResult(a, b, c);

	}

}
