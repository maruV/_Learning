public class VishalMaruProgII {
	
	public static void main(String[] args) {
		
		int[][] s = {{3,2}, {0,4}};
		int[][] t = {{1,0}, {5,3}};
		
		int[][] a = {{5, 5, 6, 7},
				    {1, 3, 7, 8},
				    {2, 3 ,5 ,6},
				    {9, 5, 3, 5}};

		int[][] b = {{1, 1, 1, 1},
				    {2, 2, 2, 2},
				    {5, 6, 7, 8},
				    {5, 1, 3, 2}};			
		
		
		
		//printArray(A);
		//System.out.println();
		//printArray(B);
		//System.out.println();
		
		printArray(S_Multiply(s, t));
		printArray(S_Multiply(a, b));
		
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
				for (int k = 0; k < n; k++) {
					C[i][j] += A[i][k]*B[k][j];
				}
			}
		}
		return C;	
	}
	
	// Method for dividing a matrix into 4 equal parts 
	
	public static void Divide(int[][] A, int[][] A11, int[][] A12, int[][] A21, int[][] A22)
	{
		int k = A.length;
		int h = k/2;
		
		for (int i = 0; (i+h) < k; i++)
		{
			for (int j = 0; (j+h) < k; j++)
			{
				A11[i][j] = A[ i ][ j ];
				A12[i][j] = A[ i ][ j + h ];
				A21[i][j] = A[ i + h ][ j ];
				A22[i][j] = A[ i + h ][ j + h ];
			}
		}
	}
	
	// Method for combining the separated matrix into one matrix again.
	
	public static int[][] Combine(int[][] A11, int[][] A12, int[][] A21, int[][] A22)
	{
		int[][] A = new int[2 * A11.length][2 * A11.length];
		int k = A.length;
		int h = k/2;
		
		for(int i = 0; (i+h) < k; i++)
		{
			for(int j = 0; (j+h) < k; j++)
			{
				A[ i ][ j ]              = A11[i][j];
				A[ i ][ j + h ]        = A12[i][j];
				A[ i + h][ j ]         = A21[i][j];
				A[ i + h ][ j + h ]  = A22[i][j];
			}
		}
		
		return A;
		
	}
	
	
	//  Recursive Strassen Multiplication
	
	public static int[][] S_Multiply(int[][] A, int[][] B)
	{
		int k = A.length;
		int[][] C = new int[k][k]; 
		
		if ( k == 1)
		{
			C[0][0] = A[0][0] * B[0][0];
		}
		else
		{
			int[][] A11 = new int[k][k];
			int[][] A12 = new int[k][k];
			int[][] A21 = new int[k][k];
			int[][] A22 = new int[k][k];
			int[][] B11 = new int[k][k];
			int[][] B12 = new int[k][k];
			int[][] B21 = new int[k][k];
			int[][] B22 = new int[k][k];
			
			Divide(A, A11, A12, A21, A22);
			Divide(B, B11, B12, B21, B22);
			
			int[][] M1 = S_Multiply(add(A11, A22), add(B11, B22));
			int[][] M2 = S_Multiply(add(A21, A22), B11);
			int[][] M3 = S_Multiply(A11, subtract(B12, B22));
			int[][] M4 = S_Multiply(A22, subtract(B21, B11));
			int[][] M5 = S_Multiply(add(A11, A12), B22);
			int[][] M6 = S_Multiply(subtract(A21, A11), add(B11, B12));
			int[][] M7 = S_Multiply(subtract(A12, A22), add(B21, B22));
			
			int[][] C11 = subtract(add(M1, M4), add(M5, M7));
			int[][] C12 = add(M3, M5);
			int[][] C21 = add(M2, M4);
			int[][] C22 = add(subtract(M1, M2), add(M3, M6));
			
			C = Combine(C11, C12, C21, C22);
		}	
			return C;
	}
}