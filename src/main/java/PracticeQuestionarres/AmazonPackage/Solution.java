package PracticeQuestionarres.AmazonPackage;


import java.util.*;

class Solution {
	public static void main(String[] args) {
		List<Integer> arr=new ArrayList<>();
		arr.add(3);
		arr.add(7);
		arr.add(5);
		arr.add(6);
		arr.add(2);
		System.out.println(arr);
System.out.println(minimalHeaviestSetA(arr));
	}

	public static List<Integer> minimalHeaviestSetA(List<Integer> arr) {
		int totalWeight=0;
		int n=arr.size();
//		PriorityQueue<Integer> pq = new PriorityQueue<>((o1, o2) -> Integer.compare(o2, o1));
		PriorityQueue<Integer> pq= new PriorityQueue<>((o1,o2)-> Integer.compare(o2, o1));
		for(Integer x:arr) {
			totalWeight+=x;
			pq.offer(x);
		}
		int currentWt=0;
		int remWt=0;
		ArrayList<Integer> ans=new ArrayList<>();
		for(int i=0;i<n;i++) {
			int highestElt=pq.poll();
			currentWt=currentWt+highestElt;
			ans.add(highestElt);
			remWt=totalWeight-currentWt;
			
		if(currentWt>remWt)
			break;
		}
		return ans;
	}
	
}
