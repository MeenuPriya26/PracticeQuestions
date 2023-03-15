package PracticeQuestionarres.BitManipulation;

public class RightmostDiffBit {
public static void main(String[] args) {
	int mask=1;
	int counter=1;
	int a=52;
	int b=4;
	while((mask & a) == (mask & b)) {
		mask<<=1;
		counter++;
	}
	System.out.println(counter);
	int m=4;
	positionofRightMostBit(m);
	
}

 static void positionofRightMostBit(int m) {
	 int mask=1;
		int counter=1;
		
		while((mask & m) == 0) {
			mask<<=1;
			counter++;
		}
		System.out.println(counter);
}

}
