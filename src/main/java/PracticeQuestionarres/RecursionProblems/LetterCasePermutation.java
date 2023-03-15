package PracticeQuestionarres.RecursionProblems;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class LetterCasePermutation {
	private static final String[] NUMBERS = { "0", "1", "2", "3", "4", "5", "6", "7", "8", "9" };

	public static void main(String[] args) {
		Set<String> set=new HashSet<String>();
		String op = "";
		String ip = "a1B2";
		solve(ip, op,set);
		System.out.println(set);
	}

	static void solve(String ip, String op,Set<String> set) {
		if (ip.length() == 0) {
			set.add(op);
			return;
		}
		String temp = "";
		temp += ip.charAt(0);
		if (!Arrays.asList(NUMBERS).contains(temp)) {
			String op1 = op + ip.substring(0, 1).toLowerCase();
			String op2 = op + ip.substring(0, 1).toUpperCase();
			ip = ip.substring(1);
			solve(ip, op1,set);
			solve(ip, op2,set);
		} else {
			String op1 = op + ip.substring(0, 1);
			ip = ip.substring(1);
			solve(ip, op1,set);
		}
	}
}
