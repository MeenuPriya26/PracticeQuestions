package PracticeQuestionarres.VisaInterviewQns;

public class MissingNo {
public static void main(String[] args) {
	int n=7;
	int a[]= {1,2,4,5,6,7};
	int actualSum=(n*(n+1))/2;
	int currSum=0;
	for(int i=0;i<n-1;i++) {
		currSum+=a[i];
	}
	int missingNo=actualSum-currSum;
	System.out.println(missingNo);
	
}
}
