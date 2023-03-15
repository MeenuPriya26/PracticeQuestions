package PracticeQuestionarres.DP_LCS;

public class SequencePatternMatching {
	public static void main(String[] args) {
		String x = "AXY";
		char[] xarr = x.toCharArray();
		String y = "ADXCPY";
		char[] yarr = y.toCharArray();
		int n = x.length();
		int m = y.length();
		int[][] t = new int[n + 1][m + 1];
		boolean ans=false;
		System.out.println(LCSTopDown(xarr, yarr, n, m, t));
		if(LCSTopDown(xarr, yarr, n, m, t)==x.length()) {
			 ans=true;
			System.out.println("X is a subsequence of Y"+ans);
		}
		else
		{
			ans=false;
			System.out.println("X is a subsequence of Y"+ans);
		}
	}

	static int LCSTopDown(char[] x, char[] y, int n, int m, int[][] t) {
		for (int i = 0; i < n + 1; i++) {
			for (int j = 0; j < m + 1; j++) {
				if (i == 0 || j == 0) {
					t[i][j] = 0;
				}
			}
		}

		for (int i = 1; i < n + 1; i++) {
			for (int j = 1; j < m + 1; j++) {
				if (x[i - 1] == y[j - 1]) {
					t[i][j] = 1 + t[i - 1][j - 1];
				} else
					t[i][j] = Math.max(t[i][j - 1], t[i - 1][j]);
			}
		}
		return t[n][m];
	}
}
