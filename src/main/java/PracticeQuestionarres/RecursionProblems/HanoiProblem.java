package PracticeQuestionarres.RecursionProblems;

public class HanoiProblem {
	public static void main(String[] args) {
		int N = 3;
		int S = 1;
		int H = 2;
		int D = 3;
		int count=0;
		solve(S, D, H, N,count);
		System.out.println(count);
	}

	static void solve(int S, int D, int H, int N,int count) {
		count++;
		if (N == 1) {
			System.out.println("Moving Plate " + N + "From :" + S + "To" + D);
			return;
		}
		count++;
		solve(S, H, D, N - 1,count);
		System.out.println("Moving Plate " +"From :" + S + "To" + D);
		solve(H, D, S, N - 1,count);
		
	}
}
