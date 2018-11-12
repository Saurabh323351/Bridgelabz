package bridgelabz.programs.functional;
import com.bridgelab.utility.Utility;
public class StopWatch {

	public static void main(String[] args) {
        System.out.println("-----StopWatch -----"); 
		System.out.println("1.Start");
         System.out.println("2.Stop");
     	
		int value=Utility.getInt();
		Utility.getElapsedTime(value);
		
	}

}
