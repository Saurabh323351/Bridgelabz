package bridgelabz.programs.functional;

import com.bridgelab.utility.Utility;
public class QuadraticMain {

	public static void main(String[] args) {
// ax^2+bX+c=0(quadratic Equation)
		
		System.out.println("Enter the Coefficient of the Quadratic Equation");
		int a=Utility.getInt();
		int b=Utility.getInt();	
		int c=Utility.getInt();
		
	Utility.getRoots(a, b, c); 	
		
	}

}
