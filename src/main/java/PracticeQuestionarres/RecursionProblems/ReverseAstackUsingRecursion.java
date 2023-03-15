package PracticeQuestionarres.RecursionProblems;

import java.util.Stack;

public class ReverseAstackUsingRecursion {
	public static void main(String[] args) {
		Stack<Integer> stack = new Stack<Integer>();
		stack.push(1);
		stack.push(2);
		stack.push(3);
		stack.push(4);
		stack.push(5);
		int s=stack.size();
		System.out.println(stack);
		reverseStack(stack);
		System.out.println("Post reversal :"+stack);
	
	}

	static void reverseStack(Stack<Integer> stack) {
		if (stack.size() == 1) {
			return;
		}
		int first = stack.peek();
		stack.pop();
		reverseStack(stack);
		insert(stack, first);
		return;
	}

	static void insert(Stack<Integer> stack, int first) {
		if (stack.size() == 0) {
			stack.push(first);
			return;
		}
		int second = stack.peek();
		stack.pop();
		insert(stack, first);
		stack.push(second);
		return;
	}
}
