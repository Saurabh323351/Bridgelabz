package bridgelabz.programs.functional;

public class WindChillMain {
static {
System.out.println("Enter temperature<= 50 and Velocity =>3 and <=120");
}
	
	public static void main(String[] args) {
   double t=Double.parseDouble(args[0]);
   double v=Double.parseDouble(args[1]);	
   
   WindChill.getWindChill(t, v);
	}

}
