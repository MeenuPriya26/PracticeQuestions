package PracticeQuestionarres.GSQns;

public class CountStepsWays {
public static void main(String[] args) {
	int s=5;
	int n=s+1;
	System.out.println(fib(n));
}

private static int fib(int n) {
	if(n<=1)
		return n;
	
	return fib(n-1)+fib(n-2);
}
}
