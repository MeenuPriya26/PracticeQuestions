package PracticeQuestionarres.BitManipulation;

public class CheckKthBitisSetorNot {
public static void main(String[] args) {
	int k=3;
	int mask=1;
	int n=52;
	int pos=1;
	
		mask<<=k;
		
	
	if((mask & n) !=0) {
		System.out.println("Kth bit is set");
	}
	else
		System.out.println("Kth bit is not set");
}
}
