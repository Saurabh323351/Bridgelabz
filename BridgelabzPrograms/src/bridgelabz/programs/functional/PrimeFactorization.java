/******************************************************************************
 *  Purpose:To Find all Prime factors of a given Number.
 *
 *  @author  Saurabh
 *  @version 1.0
 *  @since   13-11-2018
 *
 ******************************************************************************/

package bridgelabz.programs.functional;

import com.bridgelab.utility.Utility;

public class PrimeFactorization {

	public static void main(String[] args) {

		System.out.println("Enter value to see all Prime Factor");

		// Taking input from user
		int num = Utility.getInt();

		// calling method of Utility class
		Utility.getPrimeFactor(num);
	}

}
