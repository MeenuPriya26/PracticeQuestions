package PracticeQuestionarres.SlidingWindow;

import java.util.ArrayList;
import java.util.List;

public class MaxOfAllSubarraysOfSizek {
public static void main(String[] args) {

	int[] arr= {1,3,-1,-3,5,3,6,7};
	int n=arr.length;
	int i=0;
	int j=0;
	int sum=0;int mx=Integer.MIN_VALUE;
	int k=3;
	List<Integer> list=new ArrayList<Integer>();
	while(j<n) {
		int max=Math.max(mx, arr[j]);
		list.add(max);
		if(j-i+1<k) {
			j++;
		}
		else if (j-i+1==k) {
			
			
			i++;
			j++;
		}
	}
	System.out.println(list);

}
}
