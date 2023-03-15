package PracticeQuestionarres.DP_Unbounded_Knapsack;

public class RodCuttingProblem {
	public static void main(String[] args) {
		 int[] length = { 1,2, 3, 4, 5,6,7,8 }; 
		int[] price = { 1,5,8,9,10,17,17,20};
		
		int N= 8;
		/*
		 * int[] length=new int[N]; for(int i=1;i<=N;i++) { length[i]=i;
		 * System.out.println(length[i]); }
		 */
		int[][] t = new int[N + 1][N + 1];

		
		  System.out.println("Max profit is :" + Knapsack(length, price, N, t));
		 	}

	static int Knapsack(int[] length, int[] price, int N, int[][] t) {
		for (int i = 0; i < N + 1; i++) {
			for (int j = 0; j < N + 1; j++) {
				if (i == 0 || j == 0) {
					t[i][j] = 0;
				}
			}
		}
		for (int i = 1; i < N + 1; i++) {
			for (int j = 1; j < N + 1; j++) {
				if (length[i - 1] <= j) {
					t[i][j] = Integer.max(price[i - 1] + t[i][j - length[i - 1]], t[i - 1][j]);
				} else if (length[i - 1] > j) {
					t[i][j] = t[i - 1][j];
				}
			}
		}
		return t[N][N];
	}

}
