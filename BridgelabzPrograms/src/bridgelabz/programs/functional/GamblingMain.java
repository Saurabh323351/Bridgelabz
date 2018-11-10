package bridgelabz.programs.functional;
import com.bridgelab.utility.Utility;


public class GamblingMain {

	public static void main(String[] args) {
		System.out.println("Enter your Stake");
		int a=Utility.getInt();
		System.out.println("Enter your Goal");
		int b=Utility.getInt();
		System.out.println("Enter no of Times you want to play");
		float c=Utility.getInt();
		Utility.gamblingResult(a, b, c);
		
	}

}
