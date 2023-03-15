package PracticeQuestionarres.DP_MatrixChainMultiplication;

public class MCM_Recursive {
	public static void main(String[] args) {
		int[] arr = { 40, 20, 30, 10, 30 };
		int i = 1;
		int n = arr.length;
		int j = arr.length - 1;
		  System.out.println(i); System.out.println(j);
		  System.out.println("Min cost is"+solve(arr, i, j));
		 
		
	}

	static int solve(int[] arr, int i, int j) {
		int min = Integer.MAX_VALUE;
		int temp = 0;
		if (i >= j) {
			return 0;
		}
		for (int k = i; k <= j - 1; k++) {
			temp = solve(arr, i, k) + solve(arr, k + 1, j) + (arr[i - 1] * arr[k] * arr[j]);
		}
		if (temp < min) {
			min = temp;
		}
		return min;
	}
}
