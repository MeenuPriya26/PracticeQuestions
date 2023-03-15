package PracticeQuestionarres.DP_MatrixChainMultiplication;

public class EvaluateExprToTBP_Recursive {
	public static void main(String[] args) {
		String s = "T^F&T";
		/* String s = "T|F&T"; */

		boolean isTrue = true;
		int n = s.length();
		int i = 0;
		int j = n - 1;
		System.out.println(solveTBP(s, i, j, isTrue));
	}

	static int solveTBP(String s, int i, int j, boolean isTrue) {
		int ans = 0;
		if (i > j) {
			return 0;
		}
		if (i == j) {
			
			  if (isTrue == true) { if(s.charAt(i)=='T') return 1; else return 0; } else {
			  if(s.charAt(i)=='F') return 1; else return 0; }
			 
		}

		for (int k = i + 1; k <= j - 1; k = k + 2) {
			int lT = solveTBP(s, i, k - 1, true);
			int lF = solveTBP(s, i, k - 1, false);
			int rT = solveTBP(s, k + 1, j, true);
			int rF = solveTBP(s, k + 1, j, false);

			if (s.charAt(k) == '&') {
				if (isTrue == true)
					ans += lT * rT;
				else
					ans += lT * rF + lF * rT + lF * rF;
			}

			else if (s.charAt(k) == '|') {
				if (isTrue == true)
					ans += lT * rT + lT * rF + lF * rT;
				else
					ans += lF * rF;
			}

			else if (s.charAt(k) == '^') {
				if (isTrue == true)
					ans += lT * rF + lF * rT;
				else
					ans += lT * rT + lF * rF;
			}

		}
		return ans;
	}
}
