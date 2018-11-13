/******************************************************************************
 *  Purpose:To Determine WindChill or Effective Temperature.
 *
 *  @author  Saurabh
 *  @version 1.0
 *  @since   13-11-2018
 *
 ******************************************************************************/

package bridgelabz.programs.functional;

import com.bridgelab.utility.Utility;

public class WindChill {
	static {
		System.out.println("Enter temperature<= 50 and Velocity =>3 and <=120");
	}

	static {
		System.out.println("Enter temperature<= 50 and Velocity =>3 and <=120");
	}

	public static void main(String[] args) {

		// Converting values from String to Integer
		double t = Double.parseDouble(args[0]);
		double v = Double.parseDouble(args[1]);

		// calling method of Utility class
		Utility.getWindChill(t, v);
	}

}
