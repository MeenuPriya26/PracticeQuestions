package PracticeQuestionarres.DP_LCS;

public class NoOfInsertionToMakeStringPalindromic {
	public static void main(String[] args) {
		String a="aebcbda";
		StringBuffer sb=new StringBuffer("agbcba");
		String a_rev=sb.reverse().toString();
		char[] xarr=a.toCharArray();
		char[] yarr=a_rev.toCharArray();
		int n=a.length();
		int m=a_rev.length();
		int[][] t=new int[n+1][m+1];
		int LPS_length=LCSTopDown(xarr,yarr,n,m,t);
		System.out.println("Length of Longest Palindromic substring is:"+LPS_length);
		int insert=n-LPS_length;
		System.out.println("No of insertion to make string palindromic is"+insert);
		
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
