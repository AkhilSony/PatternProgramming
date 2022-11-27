package core_java.assignmentSoln;

public class IneuronPattern {
     public static void main(String[] args) {
		int n=10;
    	 for (int i = 0; i < n; i++) {
 			for (int j = 0; j < n; j++) {

 				if (i==0 && j<n-1 || j==(n-1)/2 || i==n-1 && j<n-1) //I
 				{
 					System.out.print("*");
 				} else {
 					System.out.print(" ");
 				}

 			}
 			
 			for (int j = 0; j < n; j++) {

 				if (j==0 && j<n-1 || j==(n*3)/4|| i==j && i<(n*3)/4 && j<(n*3)/4 ) //N
 				{
 					System.out.print("*");
 				} else {
 					System.out.print(" ");
 				}

 			}
 			
 			
 			for (int j = 0; j < n; j++) {

 				if (j==0 ||i==0 && j<(3*n)/4|| i==(n-1)/2 && j<(n-1)/2|| i==n-1 && j<(3*n)/4) //E
 				{
 					System.out.print("*");
 				} else {
 					System.out.print(" ");
 				}

 			}
 			
 			for (int j = 0; j < n; j++) {

 				if (j == 0 && i != n - 1 || (i == n - 1) && j > 0 && j < (n * 3) / 4
						|| (j == (n * 3) / 4) && i != n - 1) //U
 				{
 					System.out.print("*");
 				} else {
 					System.out.print(" ");
 				}

 			}
 			
 			for (int j = 0; j < n; j++) {

				if (j==0 && i!=0 ||i==0 && j>0 && j<(n*3)/4 
						|| j==(n*3)/4 && i<(n-1)/2 ||i==(n-1)/2 && j<(3*n)/4||i-j==(n-1)/2) // R
				{
					System.out.print("*");
				} else {
					System.out.print(" ");
				}

			}
 			
 			for (int j = 0; j < n; j++) {

				if (j==n/4 && i!=0 && i!=n-1 || i==0 && j>n/4 && j<(3*n)/4 
						||i==n-1 && j>n/4 && j<(3*n)/4 ||j==(3*n)/4 && i!=0 && i!=n-1) //O
				{
					System.out.print("*");
				} else {
					System.out.print(" ");
				}

			}
 			
 			
 			for (int j = 0; j < n; j++) {

 				if (j==0 && j<n-1 || j==(n*3)/4|| i==j && i<(n*3)/4 && j<(n*3)/4 ) //N
 				{
 					System.out.print("*");
 				} else {
 					System.out.print(" ");
 				}

 			}
 			
    	 System.out.println();
	}
}
     
     }
