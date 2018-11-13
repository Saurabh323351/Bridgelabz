/******************************************************************************
 *  Purpose:To Find the Euclidean Distance from  the given X & Y coordinates.
 *
 *  @author  Saurabh
 *  @version 1.0
 *  @since   13-11-2018
 *
 ******************************************************************************/

package bridgelabz.programs.functional;

import com.bridgelab.utility.Utility;

public class EuclideanDistance {
	static {
		System.out.println("enter x and y through command line");

	}

	public static void main(String[] args) {

		// Converting String to integer
		int x = Integer.parseInt(args[0]);
		int y = Integer.parseInt(args[1]);

		// calling method of Utility class
		Utility.getDistance(x, y);

	}

}
