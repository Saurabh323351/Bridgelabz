package bridgelabz.programs.functional;

import com.bridgelab.utility.Utility;

public class Power
{
	static int N;

	public static void main(String[] args) {
		System.out.println("Enter range through command prompt");
		N = Integer.parseInt(args[0]);
		Utility.power_2(N);

	}

}
