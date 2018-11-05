package bridgelabz.programs.functional;
import java.util.Scanner;

public class StringUserInput_1 {
	
static	String s="Hello <<UserName>>, How are you?";
	
	public static void replaceString() {
		System.out.println("Enter Your String");
		Scanner sc=new Scanner(System.in);
		String userstring=sc.nextLine();
		sc.close();
		String replacestr=s.replace("<<UserName>>",userstring);
		System.out.println(replacestr);  
	}

}



