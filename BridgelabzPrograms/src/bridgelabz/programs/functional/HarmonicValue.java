package bridgelabz.programs.functional;
import com.bridgelab.utility.Utility;;
public class HarmonicValue{

	public static void main(String[] args) {
   System.out.println("Enter Harmonic value");
		int N=Utility.getInt();
  N=Utility.noCheck(N);
   Utility.nthHarmonicValue(N);
	}

}

