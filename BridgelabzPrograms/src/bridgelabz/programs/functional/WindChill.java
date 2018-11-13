package bridgelabz.programs.functional;
import com.bridgelab.utility.Utility;
public class WindChill{
static {
System.out.println("Enter temperature<= 50 and Velocity =>3 and <=120");
}
	
static {
System.out.println("Enter temperature<= 50 and Velocity =>3 and <=120");
}
	
	public static void main(String[] args) {
   double t=Double.parseDouble(args[0]);
   double v=Double.parseDouble(args[1]);	
   
   Utility.getWindChill(t, v);
	}

}
