package PracticeQuestionarres.RecursionProblems;

public class PrintNto1 {

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
	System.out.println(n);
	int result =printNmethod(n-1);
	return result;
}


}
