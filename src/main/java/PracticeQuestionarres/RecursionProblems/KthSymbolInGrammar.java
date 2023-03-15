package PracticeQuestionarres.RecursionProblems;

public class KthSymbolInGrammar {
public static void main(String[] args) {
	int n =3;
	int k=2;
	int mid=(int) (Math.pow(2, n-1))/2;
	System.out.println(mid);
	int res=solve(n,k);
	System.out.println("OP is "+res);
	/*
	 * int y=0; int w=~y; System.out.println(w);
	 */
}
static int solve(int n,int k) {
	int ans=0;
	  int mid=(int) (Math.pow(2, n-1)/2); 
	  if(n==1 && k==1) { return 0; }
	  if(k<=mid) {
		  ans=(solve(n-1,k)); 
	  }
	  else if(k>mid) {
		  ans= ~(solve(n-1,k-mid));
	  }
	return ans;
	  
	 
	
	
	
}
}
