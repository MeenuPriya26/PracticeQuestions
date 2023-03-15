package PracticeQuestionarres.RecursionProblems;

public class Factorial {
public static void main(String[] args) {
	int n=5;
	int res=fact(n);
	System.out.println(res);

}
static int fact(int n) {
	if(n==1) {
		return 1;
	}
	int res=n*fact(n-1);
	return res;
}
}
