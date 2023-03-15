package PracticeQuestionarres.RecursionProblems;

import java.util.Stack;

public class DeleteMiddleEltInStack {
	public static void main(String[] args) {
		Stack<Integer> stack = new Stack<Integer>();
		stack.push(1);
		stack.push(2);
		stack.push(3);
		stack.push(4);
		stack.push(5);
		/*
		 * System.out.println("Printing Stack"); for(int i=0;i<5;i++) {
		 * System.out.println(stack.pop()); }
		 */
		int k = (stack.size() / 2) + 1;

		deleteMiddleElt(stack, k);

		System.out.println("Printing Stack"+stack);
		/*
		 * stack.pop(); System.out.println("Post popping"+stack);
		 */
	
	}

	static void deleteMiddleElt(Stack<Integer> stack, int k) {
		if (stack.size()==0) {
			return;
		}
		if (k == 1) {
			stack.pop();
			return;
		}
		int y=stack.peek();
		stack.pop();
		deleteMiddleElt(stack, k - 1);
		stack.push(y);

	}
}
