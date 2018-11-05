package bridgelabz.programs.functional;
import java.util.Random;
public class FlipCoin {
	public static void getProbability(int n) {
  
	Random r = new Random(); 
    float heads = 0;
    for (int i = 1; i <=n; i++) { 
       int side = r.nextInt(2);// it generates random value less than 2
    
        if (side == 1) {
            heads++;
        } 
    } 
    float headpercet=heads/n*100;
    
    float tailpercent=100-headpercet;
    System.out.println("Percentage of head :" +headpercet); 
    System.out.println("Percentage of tail :" + tailpercent);

}
}