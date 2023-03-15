package PracticeQuestionarres.DP_MatrixChainMultiplication;

import java.util.Arrays;

public class PPMemoization {
	public static void main(String[] args) {
		String s = "nitik";
		int n = s.length();
		int i = 0;
		int j = n - 1;
		int[][] t = new int[n + 1][n + 1];
		for (int[] v : t) {
			Arrays.fill(v, -1);
		}
		System.out.println(solve(s, i, j, t));
	}

	static int solve(String s, int i, int j, int[][] t) {
		int min = Integer.MAX_VALUE;
		int temp = 0;
		if (i >= j) {
			return 0;
		}
		if (isPalindrome(s, i, j) == true) {
			return 0;
		}
		if (t[i][j] != -1) {
			return t[i][j];
		}
		for (int k = i; k <= j - 1; k++) {
			temp = 1 + solve(s, i, k, t) + solve(s, k + 1, j, t);
		}
		if (temp < min) {
			min = temp;
		}
		t[i][j] = min;
		return min;
	}

	private static boolean isPalindrome(String s, int i, int j) {
		/*
		 * StringBuilder sb = new StringBuilder(s); if
		 * (s.equals(sb.reverse().toString())) { return true; } else { return false; }
		 */
   if(i==j) {
	   return true;
	 
   }
   if(i>j)
	   return true;
   
   while(i<j) {
	   if(s.charAt(i)!=s.charAt(j)) {
		   return false;
		   
	   }else
	   {
		   i++;
		   j--;
	   }
   }
   
	return true;   
	}
}
