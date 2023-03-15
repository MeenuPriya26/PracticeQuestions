package PracticeQuestionarres.Heap;

import java.util.PriorityQueue;

public class KthSmallestElt {
public static void main(String[] args) {
	int[] arr= {7,10,4,3,20,15};
	PriorityQueue<Integer> maxh = new PriorityQueue<Integer>();
	int k=3;
	int n=arr.length;
	for(int i=0;i<n;i++) {
		maxh.add(arr[i]);
		if(maxh.size()>k) {
			maxh.poll();
		}
	}
	System.out.println(maxh.peek());
}
}
