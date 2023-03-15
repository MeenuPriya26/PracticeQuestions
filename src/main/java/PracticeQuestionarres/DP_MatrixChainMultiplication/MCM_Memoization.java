package PracticeQuestionarres.DP_MatrixChainMultiplication;

import java.util.Arrays;

public class MCM_Memoization {
	public static void main(String[] args) {
		int[] arr = { 40, 20, 30, 10, 30 };
		int i = 1;
		int n = arr.length;
		int j = arr.length - 1;
		int[][] t=new int[n+1][n+1];
		for(int[] v:t) {
			Arrays.fill(v, -1);
		}
		  System.out.println(i); System.out.println(j);
		  System.out.println("Min cost is"+solve(arr, i, j,t));
		 
		
	}

	static int solve(int[] arr, int i, int j,int[][] t) {
		int min = Integer.MAX_VALUE;
		int temp=0;
		  if (i >= j) { return 0; }
		 
		if(t[i][j]!=-1) {
			return t[i][j];
		}
		for (int k = i; k <= j - 1; k++) {
			temp = solve(arr, i, k,t) + solve(arr, k + 1, j,t) + (arr[i - 1] * arr[k] * arr[j]);
		}
		if (temp < min) {
			min = temp;
		}
		t[i][j]=min;
		return t[i][j];
	}
}
