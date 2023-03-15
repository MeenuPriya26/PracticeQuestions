package PracticeQuestionarres.RecursionProblems;

import java.util.HashSet;
import java.util.Set;


public class PrintSubsets {
	public static void main(String[] args) {
	    Set<String> uniqueSubset = new HashSet<>();
		String ip = "ABCD";
		String op = "";
		solve(ip, op,uniqueSubset);
		System.out.println("Unique Subset"+uniqueSubset);
	}

	static void solve(String ip, String op,Set<String> uniqueSubset ) {
		if (ip.length() == 0) {
			uniqueSubset.add(op);
			System.out.println(op);
			return;
		}
		String op1 = op;
		String op2 = op + ip.substring(0, 1);
		ip = ip.substring(1);
		solve(ip, op1,uniqueSubset);
		solve(ip, op2,uniqueSubset);
	}
}
