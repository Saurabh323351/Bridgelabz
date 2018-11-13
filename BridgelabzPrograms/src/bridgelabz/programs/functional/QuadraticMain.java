/******************************************************************************
 *  Purpose:To Find the Quadratic roots of Given Quadratic Equation.
 *
 *  @author  Saurabh
 *  @version 1.0
 *  @since   13-11-2018
 *
 ******************************************************************************/

package bridgelabz.programs.functional;

import com.bridgelab.utility.Utility;

public class QuadraticMain {

	public static void main(String[] args) {
// ax^2+bX+c=0(quadratic Equation)

		System.out.println("Enter the Coefficient of the Quadratic Equation");
		// Taking input from user of Coefficient a
		int a = Utility.getInt();

		// Taking input from user of Coefficient b
		int b = Utility.getInt();

		// Taking input from user of Coefficient c
		int c = Utility.getInt();

		//calling method of Utility class
		Utility.getRoots(a, b, c);

	}

}
