package PracticeQuestionarres.AmazonCodingPracticeQns;

import java.util.HashSet;

public class SumOf2EltsPresentInArray {
public static void main(String[] args) {
	int arr[]={5,7,1,12,8,4,5};
	int sum=10;
	System.out.println(solve(arr,sum));
}

private static boolean solve(int[] arr,int sum) {
	boolean ans=false;
	HashSet<Integer> set= new HashSet<Integer>();
	for(int i=0;i<arr.length;i++) {
		if(set.contains(sum-arr[i])) {
			ans= true;
		}
		set.add(arr[i]);
	}
	return ans;
}
}
