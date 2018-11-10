/******************************************************************************
 *  Compilation:  javac -d bin StringUserInput_1.java
 *  Execution:    java -cp bin  bridgelabz.programs.functional.StringUserInput_1
 *  
 *  Purpose: To replace user string with given string.
 *
 *  @author  BridgeLabz
 *  @version 1.0
 *  @since   10-11-2018
 *
 ******************************************************************************/

package bridgelabz.programs.functional;
import com.bridgelab.utility.Utility;

public class StringUserInput_1 {
	public static void main(String arg[]) {
	
		
		// initializing variables
		String template = "Hello <<UserName>>, How are you?";
		//taking input from user
		System.out.println(" Please Enter the String");
		String name=Utility.getString();
		
		//this method is used to replace a string
		String output=Utility.replace(template,"<<UserName>>",name);
		System.out.println(output);
	}
}





