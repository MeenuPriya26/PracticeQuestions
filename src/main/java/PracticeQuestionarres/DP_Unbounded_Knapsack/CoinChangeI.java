package PracticeQuestionarres.DP_Unbounded_Knapsack;

public class CoinChangeI {
	public static void main(String[] args) {
	int[] coin = { 1,2}; 
	int sum= 4;
	int n=coin.length;
	int[][] t = new int[n + 1][sum + 1];

	
	  System.out.println("Total no of ways of selecting coin is  :" + Knapsack(coin, sum, n, t));
	}
	static int Knapsack(int[] coin,int sum,  int n, int[][] t) {
		for (int i = 0; i < n + 1; i++) {
			for (int j = 0; j < sum+ 1; j++) {
				if (i == 0 ) {
					t[i][j] = 0;
				}
				if(j==0) {
					t[i][j] = 1;
				}
			}
		}
		for (int i = 1; i < n + 1; i++) {
			for (int j = 1; j < sum + 1; j++) {
				if (coin[i - 1] <= j) {
					t[i][j] = t[i][j - coin[i - 1]]+ t[i - 1][j];
				} else if (coin[i - 1] > j) {
					t[i][j] = t[i - 1][j];
				}
			}
		}
		return t[n][sum];
	}
}
