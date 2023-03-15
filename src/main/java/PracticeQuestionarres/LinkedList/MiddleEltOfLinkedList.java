package PracticeQuestionarres.LinkedList;



public class MiddleEltOfLinkedList {

	Node head;

	static class Node {
		int data;
		Node next;

		Node(int d) {
			data = d;
			next = null;
		}
	}

	public void push(int new_data) {
		Node new_node = new Node(new_data);
		new_node.next = head;
		head = new_node;
	}

	public void insertAfter(Node prev_node, int new_data) {
		if (prev_node == null) {
			System.out.println("Prev node cannot be null");
			return;
		}
		Node new_node = new Node(new_data);
		new_node.next = prev_node.next;
		prev_node.next = new_node;
	}

	public void append(int new_data) {
		Node new_node = new Node(new_data);
		if (head == null) {
			head = new Node(new_data);
			return;
		}
		new_node.next = null;
		Node last = head;
		while (last.next != null) {
			last = last.next;
		}
		last.next = new_node;
	}

	public void printList() {
		Node tnode = head;
		while (tnode != null) {
			System.out.print(tnode.data + " ");
			tnode = tnode.next;
		}
	}

	public int findLength() {
		int len = 0;
		Node temp = head;
		while (temp != null) {
			temp = temp.next;
			len++;
		}
		System.out.println("Length is" + " " + len);
		return len;
	}

	public void findMiddleElt() {
		int middlePos=0;
		if(head!=null) {
		int len=findLength();
			middlePos=len/2;
			Node temp=head;
			while(middlePos!=0) {
				temp=temp.next;
				middlePos--;
			}
			System.out.print("The middle element is ["
                    + temp.data + "]");
   System.out.println();
		}	
	}

	public static void main(String[] args) {

		MiddleEltOfLinkedList llist = new MiddleEltOfLinkedList();
		/*
		 * llist.append(6); llist.push(7); llist.push(1); llist.append(4);
		 * llist.insertAfter(llist.head.next, 8);
		 */
		for (int i = 5; i >= 1; i--) {
			llist.push(i);

		}
		System.out.println("\nCreated Linked list is: ");
		llist.printList();
		System.out.println();
		llist.findLength();
		llist.findMiddleElt();
	}

}
