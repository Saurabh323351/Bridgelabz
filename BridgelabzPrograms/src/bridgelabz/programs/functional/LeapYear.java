package bridgelabz.programs.functional;
import com.bridgelab.utility.Utility;
public class LeapYear {

	public static void main(String[] args) {
		System.out.println("Enter year to check for Leap year or not");
		int year = Utility.getInt();
		Utility.isLeepYear(year);
		}
}
