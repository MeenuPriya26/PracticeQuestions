package PracticeQuestionarres.DP_LCS;

public class LCSUsingRecursion {
	public static void main(String[] args) {
		String x = "abcdgh";
		char xarr[]=x.toCharArray();
		
		String y = "abedfhr";
		char yarr[]=y.toCharArray();
		int n = x.length();
		int m = y.length();
		System.out.println("Op is:" + LCS(xarr, yarr, n, m));
		 	}

	static int LCS(char[] x, char[]  y, int n, int m) {
		if (n == 0 || m == 0) {
			return 0;
		}
		
		  if (x[n-1] == y[m-1]) { return 1 + LCS(x, y, n - 1, m - 1); }
		 
		
		else {
			return Math.max(LCS(x, y, n, m-1), LCS(x, y, n-1, m));
		}
	}
}
