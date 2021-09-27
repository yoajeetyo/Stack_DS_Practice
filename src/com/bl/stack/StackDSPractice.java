package com.bl.stack;

public class StackDSPractice<k> {
	
	public ListNode top;
	private int size;
		
		private class ListNode{
			private int data;
			private ListNode next;
			
			public ListNode(int data) {
				this.data = data;
				this.next =  null;
			}
		}
		
		public void display() {
			ListNode current =top;
			while(current != null) {
				System.out.print(current.data+ " ");
				current = current.next;
			}
		}	
		
		public void push(int data) {
				
			ListNode listNode = new ListNode(data);
			listNode.next = top;
			top = listNode;
			size++;
		}
		
		public static void main(String[] args) {
			StackDSPractice<Integer> stack = new StackDSPractice();
			stack.push(70);
			stack.push(30);
			stack.push(56);
			stack.display();
		}
}