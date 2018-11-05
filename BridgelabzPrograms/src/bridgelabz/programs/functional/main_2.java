package bridgelabz.programs.functional;
import java.util.Scanner;
public class main_2 {

	public static void main(String[] args) {
System.out.println("Enter Number of times to flip coin");
		int N=new Scanner(System.in).nextInt();
         FlipCoin.getProbability(N);
	}

}
