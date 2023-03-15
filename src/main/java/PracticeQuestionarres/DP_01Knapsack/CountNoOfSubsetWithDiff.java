package PracticeQuestionarres.DP_01Knapsack;

public class CountNoOfSubsetWithDiff {
public static void main(String[] args) {
	int[] arr= {1,2,2,3};
	int diff=1;
	int sum=0;
	for(int i=0;i<arr.length;i++) {
		sum+=arr[i];
	}
	//System.out.println(sum);
	int S1=0;
	S1=(diff+sum)/2;
	int n =arr.length;
	int[][] t=new int[n+1][S1+1];
	System.out.println(CountOfSubsetSum(arr,S1,n,t));
}
static int CountOfSubsetSum(int[] arr, int S1, int n, int[][] t) {
	for (int i = 0; i < n + 1; i++) {
		for (int j = 0; j < S1 + 1; j++) {
			if (i == 0 ) {
				t[i][j] = 0;
			}
			if(j==0) {
				t[i][j] = 1;
			}
		}
	}
	for (int i = 1; i < n + 1; i++) {
		for (int j = 1; j < S1 + 1; j++) {
			if (arr[i - 1] <= j) {
				t[i][j] = t[i-1][j - arr[i-1]] + t[i - 1][j];
			} else {
				t[i][j] = t[i - 1][j];
			}
		}
	}
	return t[n][S1];
}
}
