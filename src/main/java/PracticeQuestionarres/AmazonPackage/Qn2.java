package PracticeQuestionarres.AmazonPackage;

import java.util.ArrayList;
import java.util.List;

public class Qn2 {
	public static  List<Integer> numberOfItems(String s, List<Integer> startIndices, List<Integer> endIndices) {
        int n = s.length();
        int[] dp = new int[n];
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '|') {
                dp[i] = count;
            } else {
                count++;
            }
        }
        List<Integer> ans = new ArrayList<>();
        for (int i = 0; i < startIndices.size(); i++) {
        	int start = startIndices.get(i)-1;
        	int end = endIndices.get(i)-1;

            while (s.charAt(start) != '|') start++;
            while (s.charAt(end) != '|') end--;
            if (start < end) {
                ans.add(dp[end] - dp[start]);
            } else {
                ans.add(0);
            }
        }
        return ans;
    }
	public static void main(String[] args) {
		String s="|**|*|*";
		List<Integer> startIndices=new ArrayList<>();
		startIndices.add(1);
		startIndices.add(1);
		System.out.println(startIndices);
		List<Integer> lastIndices=new ArrayList<>();
		lastIndices.add(5);
		lastIndices.add(6);
		System.out.println(lastIndices);
		System.out.println(numberOfItems(s,startIndices,lastIndices));
	}
}
