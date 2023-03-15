package PracticeQuestionarres.DP_MatrixChainMultiplication;

import java.util.HashMap;
import java.util.Map;

public class EvaluateExprToTBP_Memoization {
	public static void main(String[] args) {
		String s = "T^F&T";

		boolean isTrue = true;
		int n = s.length();
		int i = 0;
		int j = n - 1;
		int[][] t = new int[n + 1][n + 1];
		Map<String, Integer> mp = new HashMap<String, Integer>();
		System.out.println(solveTBP(s, i, j, isTrue, t, mp));
	}

	static int solveTBP(String s, int i, int j, boolean isTrue, int[][] t, Map<String, Integer> mp) {
		int ans = 0;
		if (i > j) {
			return 0;
		}
		if (i == j) {
			if (isTrue == true) {
				if (s.charAt(i) == 'T')
					return 1;
				else
					return 0;
			} else {
				if (s.charAt(i) == 'F')
					return 1;
				else
					return 0;
			}
		}
		if (t[i][j] != 0) {
			return t[i][j];
		}
		String key = i + "" + j + "" + isTrue;
		if (!mp.containsKey(key)) {
			return mp.put(key,mp.get(key));
		}
		for (int k = i + 1; k <= j - 1; k = k + 2) {
			int lT = solveTBP(s, i, k - 1, true, t, mp);
			int lF = solveTBP(s, i, k - 1, false, t, mp);
			int rT = solveTBP(s, k + 1, j, true, t, mp);
			int rF = solveTBP(s, k + 1, j, false, t, mp);

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
		mp.put(key, ans);
		return ans;
	}
}
