package bridgelabz.programs.functional;

public class EuclideanMain {
static {
	System.out.println("enter x and y through command line");

}
	
	public static void main(String[] args) {

		System.out.println(args[0]+" "+args[1]);
		int x=Integer.parseInt(args[0]);
		int y=Integer.parseInt(args[1]);
	EuclideanDistance.getDistance(x,y);
	
	}

}
