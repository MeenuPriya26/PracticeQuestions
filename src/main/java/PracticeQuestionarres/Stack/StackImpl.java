package PracticeQuestionarres.Stack;

import java.util.Stack;

public class StackImpl {
public static void main(String[] args) {
	Stack<Integer> stack= new Stack<Integer>();
	stack_push(stack);
	stack_pop(stack);
	stack_push(stack);
	stack_peek(stack); 
	stack_search(stack,2); 
	stack_search(stack,6);
	 
	
}
static void stack_push(Stack<Integer> stack){
	System.out.println("Pushing element in stack");
	for(int i=0;i<5;i++) {
		Integer x=stack.push(i);
		System.out.println(x);
	}
}
	
	static void stack_pop(Stack<Integer> stack) {
		System.out.println("Poping elt in stack");
		for(int i=0;i<5;i++) {
			Integer y =stack.pop();
			System.out.println(y);
		}
	}
	
	static void stack_peek(Stack<Integer> stack) {
		Integer y= stack.peek();
		System.out.println("Peek elt in stack is: "+y);
	}
	
	static void stack_search(Stack<Integer> stack,int elt) {
		int pos=stack.search(elt);
		if(pos==-1)
			System.out.println("Elt not found");
		else
			System.out.println("Elt found at pos"+pos);
		
	}
	


}
