/******************************************************************************
 *  Purpose:To know the probability of head and tail.
 *
 *  @author  Saurabh
 *  @version 1.0
 *  @since   13-11-2018
 *
 ******************************************************************************/

package bridgelabz.programs.functional;

import com.bridgelab.utility.Utility;

public class FlipCoin {

	public static void main(String[] args) {
		System.out.println("Enter Number of times to flip coin");

// Taking input from user
		int N = Utility.getInt();

// calling method of Utility class
		Utility.getProbability(N);
	}

}
