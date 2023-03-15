package PracticeQuestionarres.DP_LCS;

import java.util.Arrays;

public class LongestCommonSubstring {
public static void main(String[] args) {
	String x="abcde";
	String y="abfce";
	char[] x_arr=x.toCharArray();
	char[] y_arr=y.toCharArray();
	int n=x.length();
	int m=y.length();
	int[][] t=new int[n+1][m+1];
	System.out.println(LCSubstring(x_arr,y_arr,n,m,t));
}
static int LCSubstring(char[] x,char[] y,int n,int m,int[][] t) {
	int max=0;
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
				max=Math.max(t[i][j], max);
			}
			else 
				t[i][j]=0;
		}
		
	}
	
	return max;
}
}
