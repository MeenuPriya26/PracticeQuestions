package PracticeQuestionarres.DP_01Knapsack;

import java.util.Arrays;

public class Knapsack_01_Memoization {

	public static void main(String[] args) {
		int[] wt= {1,3,4,5};
		int[] val= {1,4,5,7};
		int n=wt.length;
		int W=7;
		int[][] t=new int[n+1][W+1];
		for(int[] v: t) {
			Arrays.fill(v, -1);
		}
		System.out.println("Max profit obtained is"+Knapsack(wt, val, W, n,t));
	}
	static int Knapsack(int[] wt,int[] val,int W,int n,int[][] t) {
		if(n==0 || W==0) {
			return 0;
		}
		if(t[n][W]!=-1)
		{
			return t[n][W];
		}
		if(wt[n-1]<=W) {
			t[n][W]= Math.max((val[n-1])+Knapsack(wt, val, W-wt[n-1], n-1,t),
					Knapsack(wt, val, W, n-1,t));
		}
		else if(wt[n-1]>W) {
			t[n][W]= Knapsack(wt, val, W, n-1,t);
		}
		return t[n][W];
	}

}
