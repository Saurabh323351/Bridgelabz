/******************************************************************************
 *  Purpose:To Generate Distinct Coupans.
 *
 *  @author  Saurabh
 *  @version 1.0
 *  @since   13-11-2018
 *
 ******************************************************************************/

package bridgelabz.programs.functional;

import com.bridgelab.utility.Utility;

public class CoupanNo {

	public static void main(String[] args) {
		System.out.println("Enter no of distanct coupan you want");
		// initializing variable n
		int n = Utility.getInt();

		// calling method of Utility class
		Utility.coupanNoGenaerator(n);
	}

}