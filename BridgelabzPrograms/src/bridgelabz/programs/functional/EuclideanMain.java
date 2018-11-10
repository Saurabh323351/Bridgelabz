package bridgelabz.programs.functional;

import com.bridgelab.utility.Utility;

public class EuclideanMain {
static {
	System.out.println("enter x and y through command line");

}
	
	public static void main(String[] args) {

		int x=Integer.parseInt(args[0]);
		int y=Integer.parseInt(args[1]);
Utility.getDistance(x,y);
	
	}

}
