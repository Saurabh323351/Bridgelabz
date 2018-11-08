package bridgelabz.programs.functional;

public class QuadraticEquation {

	public static void getRoots(int a,int b,int c) {
		
	int delta=((b*b)-(4*a*c));
		double firstRoot=(-b+Math.sqrt(delta))/2*a;
		double secondRoot=(-b-Math.sqrt(delta))/2*a;
	System.out.println("First Root of x = "+firstRoot+" Second Root of x ="+secondRoot);
	}
}
