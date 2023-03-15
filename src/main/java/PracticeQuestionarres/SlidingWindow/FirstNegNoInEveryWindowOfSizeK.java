package PracticeQuestionarres.SlidingWindow;

import java.util.ArrayList;
import java.util.List;

public class FirstNegNoInEveryWindowOfSizeK {
public static void main(String[] args) {
	/*
	 * int[] arr= {2,-5,1,-8,2,9,1};
	 */	
	int[] arr= {12,-1,-7,8,-15,30,16,28};
	int n=arr.length;
	List<Integer> list=new ArrayList<Integer>();
	List<Integer> ans=new ArrayList<Integer>();
	int i=0;
	int j=0;
	int k=3;
	while(j<n) {
		if(arr[j]<0)
			list.add(arr[j]);
		if(j-i+1<k) {
			j++;
		}
		else if (j-i+1==k) {
		if(list.size()==0)
			ans.add(0);
		else 
			ans.add(list.get(0));
		if(list.contains(arr[i])) {
			list.remove(0);
		}
			i++;
			j++;
		}
	}
	System.out.println(ans);
}
}
