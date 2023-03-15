package PracticeQuestionarres.DP_MatrixChainMultiplication;

import java.util.Arrays;

public class PPMemoizedOptimization {
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
		int left = 0;
		int right = 0;
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
			if (t[i][k] != -1)
				left = t[i][k];
			else {
				left = solve(s, i, k, t);
				t[i][k] = left;
			}
			if (t[k + 1][j] != -1)
				right = t[k + 1][j];
			else {
				right = solve(s, k + 1, j, t);
				t[k + 1][j] = right;
			}

			temp = 1 + left+right;
		}
		if (temp < min) {
			min = temp;
		}
		t[i][j] = min;
		return min;
	}

	private static boolean isPalindrome(String s, int i, int j) {
		if (i == j) {
			return true;

		}
		if (i > j)
			return true;

		while (i < j) {
			if (s.charAt(i) != s.charAt(j)) {
				return false;

			} else {
				i++;
				j--;
			}
		}

		return true;
	}
}
