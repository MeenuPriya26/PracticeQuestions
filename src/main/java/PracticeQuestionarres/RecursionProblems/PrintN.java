package PracticeQuestionarres.RecursionProblems;

public class PrintN {
public static void main(String[] args) {
	int n =7;
	printNmethod(n);
}

static int printNmethod(int n) {
	if (n==1)
	{
		System.out.println(1);
		return 1;
		
		
	}
	int result =printNmethod(n-1);
	System.out.println(n);
	return result;
}
}
