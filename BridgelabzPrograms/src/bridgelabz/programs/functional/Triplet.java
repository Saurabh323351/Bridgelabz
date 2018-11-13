/******************************************************************************
 *  Purpose:To Find Possible No of Triplet from given range of values .
 *
 *  @author  Saurabh
 *  @version 1.0
 *  @since   13-11-2018
 *
 ******************************************************************************/

package bridgelabz.programs.functional;

import com.bridgelab.utility.Utility;

public class Triplet {

	public static void main(String[] args) {
		System.out.println("Enter Number of values u want to put ");

		// Taking input from user
		int n = Utility.getInt();

		// calling method of Utility class
		Utility.getTriplet(n);

	}

}
