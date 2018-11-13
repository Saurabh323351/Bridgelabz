/******************************************************************************
 *  Purpose:To determine Year is Leap are not .
 *
 *  @author  Saurabh
 *  @version 1.0
 *  @since   13-11-2018
 *
 ******************************************************************************/

package bridgelabz.programs.functional;

import com.bridgelab.utility.Utility;

public class LeapYear {

	public static void main(String[] args) {
		System.out.println("Enter year to check for Leap year or not");

		// calling method of Utility class and initializing to year
		int year = Utility.getInt();

		// calling method of Utility class
		Utility.isLeepYear(year);

	}
}
