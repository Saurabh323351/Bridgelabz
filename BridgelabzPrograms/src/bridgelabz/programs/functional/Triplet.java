package bridgelabz.programs.functional;

public class Triplet {

	public static void getTriplet() {
		
		int numberRange=7;
		int[] userNumber={1,-2,1,3,-2,-1};int k=0;
		 int[] tripletStore=new int[userNumber.length]; 
		for(int i=0;i<userNumber.length;i++) {
			
			for(int j=i+1;j<userNumber.length;j++) {
				 
				if(j+1<userNumber.length) {
				if(userNumber[i]+userNumber[j]+userNumber[j+1]==0) {
				tripletStore[k++]=userNumber[i];
				tripletStore[k++]=userNumber[j];
				tripletStore[k++]=userNumber[j+1];
				}
				}
			}
		}
	
	for(int i=0;i<tripletStore.length;i++)
		System.out.println(tripletStore[i]);
		
		
	}
	
	public static void main(String[] args) {
		Triplet.getTriplet();

	}

}
