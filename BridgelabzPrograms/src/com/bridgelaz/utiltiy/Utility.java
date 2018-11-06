package com.bridgelaz.utiltiy;

import java.util.Scanner;

public class Utility {
	
	/**
	 * This method is used to input as a string 
	 * 
	 * @return
	 */
	public String inputString() {
		Scanner scanner =new Scanner(System.in);
		String demo=scanner.next();
		return null;
	}	
	
	
	/**
	 * This method is used to replace the string given 
	 * input provided by the user.  
	 * @param template String is predefined    
	 * @param name 
	 * @return
	 */
	public String replace(String template ,String name) {
		
		String output=template.replace("<<UserName>>",name);
		System.out.println(output);
		return output;
	}
}
