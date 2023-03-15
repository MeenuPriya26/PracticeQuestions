package PracticeQuestionarres.DP_LCS;

public class ShortestCommonSuperSequence {
	public static void main(String[] args) {
		String x="aggtab";
		char[] xarr=x.toCharArray();
		String y="gxtxayb";
		char[] yarr=y.toCharArray();
		int n=x.length();
		int m=y.length();
		int[][] t=new int[n+1][m+1];
		int LCSCount=LCSTopDown(xarr,yarr,n,m,t);
		int len=0;
		len=n+m-LCSCount;
		System.out.println("Length of shortest common super sequence"+len);
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
