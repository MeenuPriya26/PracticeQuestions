package PracticeQuestionarres.AmazonCodingPracticeQns;

import java.util.ArrayList;
import java.util.List;

public class MissingNoInArray {
	
		public static void main(String[] args) {
			List<Integer> input=new ArrayList<>();
			input.add(3);
			input.add(7);
			input.add(1);
			input.add(2);
			input.add(8);
			input.add(4);
			input.add(5);

			System.out.println(find_missing(input));
			
		}

		private static int find_missing(List<Integer> input) {
			int givenSum=0;
			int missingNo=0;
			int n=input.size()+1;
			int expectedSum=(n*(n+1))/2;
			for(int i=0;i<input.size();i++) {
				givenSum+=input.get(i);
			}
			return missingNo=expectedSum-givenSum;
		}
}

