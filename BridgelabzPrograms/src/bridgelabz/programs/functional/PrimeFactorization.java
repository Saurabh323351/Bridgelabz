package bridgelabz.programs.functional;

public class PrimeFactorization {

	public static void getPrimeFactor(int n) {
		boolean isPrime=true;
		//int n=147;
		int N=n;
		
			
			
			for(int i=2;i<=n;i++){
           isPrime=true;
           for(int j=2;j<=Math.sqrt(i);j++)
				if(n%j==0) {
					isPrime=false;
					 }
				
			
			if(isPrime) {
				N=n;
				while(N%i==0) {
					N=N/i;
				System.out.println(i);}
			}
			}	
	}
			
			
		

	}


