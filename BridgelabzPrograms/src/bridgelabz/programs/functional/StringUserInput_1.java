package bridgelabz.programs.functional;

import com.bridgelaz.utiltiy.*;
public class StringUserInput_1 {
	public static void main(String arg[]) {
		Utility utility =new Utility();
		
		//Intilizing variables
		String template = "Hello <<UserName>>, How are you?";
		System.out.println(" Please Enter the String");
		String name=utility.inputString();
		
		//Method is used replace a string
		String output=utility.replace(template,name);
		System.out.println(output);
	}
}



