package PracticeQuestionarres.GSQns;

import java.util.ArrayList;
import java.util.List;

public class ArrayBurstQn {
public static void main(String[] args) {
	int bL=3;
	List<String> inputArray=new ArrayList<String>();
	/* inputArray.add("8"); */
	inputArray.add("a");
	inputArray.add("b");
	inputArray.add("c");
	inputArray.add("c");
	inputArray.add("c");
	inputArray.add("d");
	inputArray.add("e");
	inputArray.add("e");
	
	/*
	 * 8 a b c c c d e e 3
	 */
	System.out.println(getShrunkArray(inputArray,bL));
}

public static List<String> getShrunkArray(List<String> inputArray, int burstLength) {
	int i = 0;
	while (i < inputArray.size()) {
		if (i < 0)
			i = 0;
		int count = 1, j = i+1;
		while (j < inputArray.size() && inputArray.get(j).equals(inputArray.get(i))) {
			count++;
			j++;
		}
		if (count >= burstLength) {
			while (count-- > 0) {
				inputArray.remove(i);
			}
			i-=2;
		}
		i++;
	}
	return inputArray;
}
}
