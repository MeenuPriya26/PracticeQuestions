package PracticeQuestionarres.VisaInterviewQns;

public class isSubArray {
public static void main(String[] args) {
	int A[] = { 2, 3, 0, 5, 1, 1, 2 };
	int B[] = { 3, 0,5, 1 };
	int n=A.length;
	int m=B.length;
	if(isSubArrayOrNot(A,B,n,m))
		System.out.println("YES");
	else 
		System.out.println("NO");

}

private static boolean isSubArrayOrNot(int[] A, int[] B ,int n ,int m) {
	
	int i=0;int j=0;
	while(i<n && j<m)
	{
		if(A[i]==B[j]) {
			i++;
			j++;
			if(j==m)
				return true;
		}
		else {
			i=i-j+1;
			j=0;
		}
	}
	return false;

}
}
