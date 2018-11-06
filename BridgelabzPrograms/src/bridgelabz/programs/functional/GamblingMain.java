package bridgelabz.programs.functional;

import java.util.Scanner;

//import javax.swing.plaf.synth.SynthSeparatorUI;

public class GamblingMain {

	public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
		System.out.println("Enter your Stake");
		int a=sc.nextInt();
		System.out.println("Enter your Goal");
		int b=sc.nextInt();
		System.out.println("Enter no of Times you want to play");
		float c=sc.nextInt();
		GamblingLogic.gamblingResult(a, b, c);
		
	}

}
