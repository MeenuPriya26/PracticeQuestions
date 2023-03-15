package PracticeQuestionarres.RecursionProblems;

public class PermuttaionWithCaseChange {
public static void main(String[] args) {
	String ip="abc";
	String op="";
	solve(ip,op);
}
static void solve(String ip,String op) {
	if(ip.length()==0) {
		System.out.println(op);
		return;
	}
	String op1=op+ip.substring(0,1);
	String op2=op+ip.substring(0,1).toUpperCase();
	ip=ip.substring(1);
	/*
	 * System.out.println(op1+op2+ip);
	 */	solve(ip,op1);
	solve(ip,op2);

}
}
