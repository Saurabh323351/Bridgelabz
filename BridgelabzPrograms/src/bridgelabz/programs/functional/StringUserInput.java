
/******************************************************************************
 *  Purpose:To replace String from given User String.
 *
 *  @author  Saurabh
 *  @version 1.0
 *  @since   13-11-2018
 *
 ******************************************************************************/

package bridgelabz.programs.functional;

import com.bridgelab.utility.Utility;

public class StringUserInput {
	public static void main(String arg[]) {

		// initializing variables
		String template = "Hello <<UserName>>, How are you?";
		// taking input from user
		System.out.println(" Please Enter the String");
		String name = Utility.getString();

		// calling method Utility class
		String output = Utility.replace(template, "<<UserName>>", name);
		System.out.println(output);
	}
}
