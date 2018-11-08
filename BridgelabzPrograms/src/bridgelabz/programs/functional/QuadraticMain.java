package bridgelabz.programs.functional;
import java.util.Scanner;
public class QuadraticMain {

	public static void main(String[] args) {
// ax^2+bX+c=0(quadratic Equation)
		
		System.out.println("Enter the Coefficient of the Quadratic Equation");
  Scanner sc=new Scanner(System.in);	
		int a=sc.nextInt();
		int b=sc.nextInt();	
		int c=sc.nextInt();
		
	QuadraticEquation.getRoots(a, b, c); 	
		
	}

}
