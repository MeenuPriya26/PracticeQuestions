package PracticeQuestionarres.RecursionProblems;

public class PermutationWithSpaces {
	public static void main(String[] args) {
		
		String ip = "ABC";
		int n=ip.length();
		String op = "";
		op = ip.substring(0, 1);
		ip = ip.substring(1, n);
		solve(ip, op); 
		 
	}

	static void solve(String ip, String op) {
		if (ip.length() == 0) {
			System.out.println(op); 
			return;
		}
		String op1 = op + " " + ip.substring(0, 1);
		String op2 = op + ip.substring(0, 1);
		ip = ip.substring(1);
		solve(ip, op1); solve(ip, op2);
		 

	}

}
