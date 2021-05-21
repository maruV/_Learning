public class MatrixArithmetic {
	
	public static void main(String[] args) {
		//int[][] A = {{3,2}, {0,4}};
		//nt[][] B = {{1,0}, {5,3}};
		int[][] A = {{7, 4, 6, 2},
				    {32, 14, 26, 24},
				    {10, 4, 8, 22},
				   {12, 14 ,16, 18}};
                //INT[][] B = {{				   
			
		
		
		
		//printArray(A);
		//System.out.println();
		//printArray(B);
		//System.out.println();
		printArray(add(A, A));
		System.out.println();
		printArray(subtract(A, A));
		System.out.println();
		printArray(multiply(A, A));
	}
	
	public static void printArray(int[][] array) {
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				if (j < array.length - 1) {
					System.out.print(array[i][j] + ",");
				} else {
					System.out.print(array[i][j]);
				}		
			}
			System.out.println();
		}
	}
	
	public static int[][] add(int[][] A, int[][] B) {
		int[][] C = new int[A.length][A[0].length];
		int m = A.length;
		//int n = B.length;
		int p = C.length;
		
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < p; j++) {
				C[i][j] = A[i][j] + B[i][j];
			}
		}
		return C;	
	}
	
	public static int[][] subtract(int[][] A, int[][] B) {
		int[][] C = new int[A.length][A[0].length];
		int m = A.length;
		//int n = B.length;
		int p = C.length;
		
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < p; j++) {
				C[i][j] = A[i][j] - B[i][j];
			}
		}
		return C;	
	}
	
	public static int[][] multiply(int[][] A, int[][] B) {
		int[][] C = new int[A.length][A[0].length];//
		int m = A.length;
		int n = B.length;
		int p = C.length;
		
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < p; j++) {
				//System.out.println("C[i][j] = " + C[i][j]);
				for (int k = 0; k < n; k++) {
					C[i][j] += A[i][k]*B[k][j];
				}
			}
		}
		return C;	
	}
}