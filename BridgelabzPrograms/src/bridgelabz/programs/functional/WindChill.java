package bridgelabz.programs.functional;
import java.util.Scanner;
public class WindChill {

	public static void getWindChill(double t,double v) {
	Scanner sc=new Scanner(System.in);	
	
	if(t>50 ||(v<3 || v>120 )) {
		System.out.println("enter temperature value <=50 & Velocity >3 & <=120"); 
		t=sc.nextDouble();
		v=sc.nextDouble();
		if(t>50 ||(v<3 || v>120 ))
		getWindChill(t, v);
	}
	
	if(t<=50 &&(v>=3 || v<=120 )) {
	
	double windChill=35.74+0.6215*t+(.4275*t-35.75)*Math.pow(v,0.16);
	System.out.println(windChill);}
	}
}
