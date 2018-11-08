package bridgelabz.programs.functional;
import java.util.Scanner;
public class Triplet {

	public static void getTriplet(int numberRange) {
		
		int count=0,totalCount=0; 
		int[] userNumber=new int[numberRange];
		System.out.println("Enter values");
		Scanner sc=new Scanner(System.in);
		for(int i=0;i<numberRange;i++)
			userNumber[i]=sc.nextInt();
		
		int k=0,add=0,jthValue=0;
		 int[] tripletStore=new int[userNumber.length]; 
		for(int i=0;i<userNumber.length;i++) {
			
			for(int j=i+1;j<userNumber.length;j++) {
				 
				if(i==count) {
					add=userNumber[i]+userNumber[j];
					 jthValue=userNumber[j];
					count++;
				}
				
				if(j+1<userNumber.length) {
				if(add+userNumber[j+1]==0) {
System.out.println(userNumber[i]+" "+jthValue+" "+userNumber[j+1]);
System.out.println("--------");
totalCount++;
				}
				}
			}
			
		}
	System.out.println("Total triplet Possible => "+totalCount);	
}
	
	public static void main(String[] args) {
		System.out.println("Enter Number of values u want to put ");
		int n=new Scanner(System.in).nextInt();
		Triplet.getTriplet(n);

	}

}
