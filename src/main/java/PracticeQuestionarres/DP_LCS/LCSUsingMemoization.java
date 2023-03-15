package PracticeQuestionarres.DP_LCS;

import java.util.Arrays;

public class LCSUsingMemoization {
public static void main(String[] args) {
	String x="abcdgh";
	char[] xarr=x.toCharArray();
	String y="abedfhr";
	char[] yarr=y.toCharArray();
	int n=x.length();
	int m=y.length();
	int[][] t=new int[n+1][m+1];
	for(int[] v:t) {
		Arrays.fill(v, -1);
	}
	System.out.println(LCSMemoize(xarr,yarr,n,m,t));
}
static int LCSMemoize(char[] x,char[] y,int n,int m,int[][] t) {
	if(n==0 || m==0) {
		return 0;
	}
	if(t[n][m]!=-1) {
		return t[n][m];
	}
	if(x[n-1]==y[m-1]) {
		t[n][m]=1+LCSMemoize(x,y,n-1,m-1,t);
	}
	else {
		t[n][m]=Math.max(LCSMemoize(x, y,n-1,m,t),LCSMemoize(x,y,n,m-1,t));
	}
	return t[n][m];	
}
}
