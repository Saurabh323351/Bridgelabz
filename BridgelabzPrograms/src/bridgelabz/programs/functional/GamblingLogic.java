package bridgelabz.programs.functional;
import java.util.Random;
public class GamblingLogic {

	public static void gamblingResult(int stake,int goal,float times){
		float wincount=0,losecount=0;
		Random r= new Random();
		for(int i=1;i<=times;i++) {
			
			int j=r.nextInt(2);
			
			if(j==1)
				wincount++;
			else
				losecount++;
				
		}
	int	wincountcasting=(int)wincount;
		System.out.println("No of times wins =>"+wincountcasting);
		
		System.out.println("win Percentage =>"+(wincount/times)*100+" "+"Lose Percentage "+(losecount/times)*100);
		
		
		
	}
}
