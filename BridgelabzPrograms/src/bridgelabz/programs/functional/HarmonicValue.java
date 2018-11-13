/******************************************************************************
 *  Purpose:To find the Nth Harmonic value.
 *
 *  @author  Saurabh
 *  @version 1.0
 *  @since   13-11-2018
 *
 ******************************************************************************/

package bridgelabz.programs.functional;

import com.bridgelab.utility.Utility;;

public class HarmonicValue {

	public static void main(String[] args) {
		System.out.println("Enter Harmonic value");

		// Taking value from user
		int N = Utility.getInt();

		// calling method of Utility class and initializing to N
		N = Utility.noCheck(N);

		// calling method of Utility class
		Utility.nthHarmonicValue(N);
	}

}
