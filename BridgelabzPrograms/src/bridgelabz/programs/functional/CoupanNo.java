package bridgelabz.programs.functional;
import java.util.Random;
import java.util.Scanner;
public class CoupanNo {
	

	public static void coupanNoGenaerator(int distinctCoupan) {
		int[] distinctCoupanArray=new int[distinctCoupan];
		boolean isDistinct=true;int randomNoCount=0;int coupanCount=0,k=0;
		Random r=new Random();
	while(coupanCount<distinctCoupan){
		isDistinct=true;
		int randomNo=r.nextInt();
		randomNoCount++;
		
		for(int i=0;i<distinctCoupanArray.length;i++) {
			
			if(randomNo==distinctCoupanArray[i]|| randomNo<0 )
				isDistinct=false;
		}
		
		if(isDistinct) {
			if(k<distinctCoupanArray.length)
			distinctCoupanArray[k++]=randomNo;
			coupanCount++;
			}
			
	
	}
	System.out.println("Random Number Needed to get Required Distinct Coupans => "+randomNoCount);
	System.out.println("These are the Distinct Coupans");
	for(int j=0;j<distinctCoupanArray.length;j++)
	System.out.println(distinctCoupanArray[j]);
	}
	
	
	public static void main(String[] args) {
Scanner sc=new Scanner(System.in);
		System.out.println("Enter no of distanct coupan you want");
      int n=sc.nextInt();
		CoupanNo.coupanNoGenaerator(n);   
	}

} 