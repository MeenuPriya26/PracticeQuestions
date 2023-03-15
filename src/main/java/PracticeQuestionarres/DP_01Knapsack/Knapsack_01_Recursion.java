package PracticeQuestionarres.DP_01Knapsack;

public class Knapsack_01_Recursion {
	public static void main(String[] args) {
		int[] wt = { 2,5,3,1};
		int[] val = {3,5,9,8};
		int n = wt.length;
		int W = 7;
		int maxProfit = Knapsack(wt, val, W, n);

		System.out.println(maxProfit);
	}

	static int Knapsack(int[] wt, int[] val, int W, int n) {
		int maxProfit = 0;
		if (n == 0 || W == 0) {
			return 0;
		}
		if (wt[n - 1] <= W) {
			maxProfit = Math.max((val[n - 1]) + Knapsack(wt, val, W - wt[n - 1], n - 1), Knapsack(wt, val, W, n - 1));
		} else if (wt[n - 1] > W) {
			maxProfit = Knapsack(wt, val, W, n - 1);
		}
		return maxProfit;
	}
}
