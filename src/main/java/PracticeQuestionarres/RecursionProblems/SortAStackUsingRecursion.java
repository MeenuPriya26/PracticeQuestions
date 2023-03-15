
package PracticeQuestionarres.RecursionProblems;

import java.util.Stack;

public class SortAStackUsingRecursion {
	public static void main(String[] args) {
		Stack<Integer> stack = new Stack<Integer>();
		stack.push(5);
		stack.push(1);
		stack.push(0);
		stack.push(2);

		int n = stack.size();
		System.out.println(n);
		System.out.println("Printing stack");
		for (int i = 0; i < n; i++) {

			System.out.println(stack.pop());
		}
		System.out.println("Post Sorting");
		sort(stack);
		for (int i = 0; i < n; i++) {

			System.out.println(stack.pop());
		}
		

	}

	static void sort(Stack<Integer> stack) {

		if (stack.size() == 1) {
			return;
		}

		int temp = stack.peek();
		stack.pop();
		sort(stack);
		insert(stack, temp);
	}

	static void insert(Stack<Integer> stack, int temp) {
		if (stack.size() == 0 || temp > stack.peek()) {
			stack.push(temp);
			return;
		}
		int val = stack.peek();
		stack.pop();
		insert(stack, temp);
		stack.push(val);

	}

}
