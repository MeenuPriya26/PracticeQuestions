package PracticeQuestionarres.SlidingWindow;

public class MaxSumSubarrayOfSizeK {
public static void main(String[] args) {
	int[] arr= {2,5,1,8,2,9,1};
	int n=arr.length;
	int i=0;
	int j=0;
	int sum=0;
	int k=3;
	int mx=Integer.MIN_VALUE;
	while(j<n) {
		sum=sum+arr[j];
		if(j-i+1<k) {
			j++;
		}
		else if (j-i+1==k) {
			mx=Math.max(mx, sum);
			sum=sum-arr[i];
			i++;
			j++;
		}
	}
	System.out.println(mx);
}
}
