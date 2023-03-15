package PracticeQuestionarres.DP_01Knapsack;

public class MinSubsetSumDifference {
	public static void main(String[] args) {
		int[] arr = { 1,2,7};
		//int[] arr = { 1,6,11,5};
		int Range=0;
		for(int i=0;i<arr.length;i++) {
			Range+=arr[i];
		}
		System.out.println(Range);
		int mn=Integer.MAX_VALUE;
		for(int i=0;i<arr.length;i++) {
			mn=Math.abs(Math.min(mn,Range-(2*arr[i])));
		}
		System.out.println(mn);
	}

}
