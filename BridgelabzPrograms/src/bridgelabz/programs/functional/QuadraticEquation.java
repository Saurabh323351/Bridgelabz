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

public class QuadraticEquation {

	public static void main(String[] args) {
// ax^2+bX+c=0(quadratic Equation)

		System.out.println("Enter the Coefficient of x^2");
		// Taking input from user of Coefficient a
		int a = Utility.getInt();

		System.out.println("Enter the Coefficient of x");
		// Taking input from user of Coefficient b
		int b = Utility.getInt();

		System.out.println("Enter the constant c");
		// Taking input from user of Coefficient c
		int c = Utility.getInt();

		//calling method of Utility class
		Utility.getRoots(a, b, c);

	}

}
