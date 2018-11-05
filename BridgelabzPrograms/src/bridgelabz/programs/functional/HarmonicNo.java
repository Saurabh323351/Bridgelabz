package bridgelabz.programs.functional;
import java.util.Scanner;
public class HarmonicNo {

	public static int noCheck(int n) {
		if(n==0) {
			System.out.println("enter value greater than 0 ");
			n=new Scanner(System.in).nextInt();
		}
		
		if(n>0)
			return n;
			
		return noCheck(n);
		
		
	}
	
	
	public static void nthHarmonicValue(int n) {
		float sum=0;
		for(float i=1;i<=n;i++) {
		sum+=1/i; 	
		}
		System.out.println("Nth Harmonic value "+sum);
	}
	

}
