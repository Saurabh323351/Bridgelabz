/******************************************************************************
 *  Purpose:To Print values from 2 Dimensional Array.
 *
 *  @author  Saurabh
 *  @version 1.0
 *  @since   13-11-2018
 *
 ******************************************************************************/

package bridgelabz.programs.functional;

import com.bridgelab.utility.Utility;

public class TwoDArrayInput {

	public static void main(String[] args) {
		System.out.println("Enter no of Rows");

		// Taking input of Rows from user
		int M = Utility.getInt();
		System.out.println("Enter no of Column");

		// Taking input for no of column from user
		int N = Utility.getInt();
		// calling method of Utility class
		int[][] input2DArray=Utility.get2DArrayInput(M, N);
		

		
for(int i=0;i<M;i++) {
			
			for(int j=0;j<N;j++) {
		 
				System.out.print(input2DArray[i][j]+" ");
			}
			System.out.println("");
		}

	}

}
