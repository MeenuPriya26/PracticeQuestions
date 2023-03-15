package PracticeQuestionarres.DP_LCS;

public class LCSUsingTopDownApproach {
public static void main(String[] args) {
//	String x="abcdgh";
	String x="heap";
	char[] xarr=x.toCharArray();
	//String y="abedfhr";
	String y="pea";
	char[] yarr=y.toCharArray();
	int n=x.length();
	int m=y.length();
	int[][] t=new int[n+1][m+1];
	System.out.println(LCSTopDown(xarr,yarr,n,m,t));
}
static int LCSTopDown(char[] x,char[] y,int n,int m,int[][] t) {
	for(int i=0;i<n+1;i++) {
		for(int j=0;j<m+1;j++) {
			if(i==0 || j==0) {
				 t[i][j]=0;
			}
		}
	}
	
	for(int i=1;i<n+1;i++) {
		for(int j=1;j<m+1;j++)
		{
			if(x[i-1]==y[j-1]) {
				t[i][j]=1+t[i-1][j-1];
			}
			else 
				t[i][j]=Math.max(t[i][j-1],t[i-1][j]);
		}
	}
	return t[n][m];
}
}
