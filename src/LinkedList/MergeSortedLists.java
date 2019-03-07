package LinkedList;

import LinkedList.KeepAkelasOnly.LLNode;

public class MergeSortedLists {
	
	public class LLNode {
		int data;
		LLNode next;

		LLNode(int data) {
			this.data = data;
			this.next = null;
		}
	}

	public LLNode insert(LLNode head, int data) {
		LLNode temp = new LLNode(data);

		if (head == null) {
			head = temp;
		} else {
			LLNode curr = head;
			while (curr.next != null) {
				curr = curr.next;
			}
			curr.next = temp;
		}

		return head;
	}

	public void printList(LLNode head) {
		LLNode curr = head;
		while (curr != null) {
			System.out.println(curr.data);
			curr = curr.next;
		}
	}
	
	LLNode mergeSorted(LLNode h1, LLNode h2)
	{
		if(h1 == null && h2 == null) {
			return null;
		}
		
		if(h1 != null && h2 == null) {
			return h1;
		}
		if(h1 == null && h2 != null) {
			return h2;
		}
		
		LLNode curr1 = h1;
		LLNode curr2 = h2;
		LLNode prev1 = null; LLNode prev2 = null;
		
		while(curr1 != null && curr2 != null) {
			
			if(curr1.data > curr2.data) {
				if(prev1 != null) {
					prev1.next = curr2;
					LLNode temp = curr2.next;
					curr2.next = curr1;
					curr2 = temp;
				}
				else {
					LLNode temp = curr2.next;
					curr2.next = curr1;
					h1 = curr2;
					curr2 = temp;
					
				}
				
			}
			else {
				prev1 = curr1;
				curr1 = curr1.next;
			}
		}
		
		if(curr2 != null) {
			prev1.next = curr2;
		}
		
		return h1;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MergeSortedLists obj = new MergeSortedLists();
		LLNode head1 = null;
		head1 = obj.insert(head1, 3);
		head1 = obj.insert(head1, 4);
		head1 = obj.insert(head1, 6);
		
		LLNode head2 = null;
		head2 = obj.insert(head2, 2);
		head2 = obj.insert(head2, 5);
		
		//obj.printList(head1);obj.printList(head2);
		
		head1 = obj.mergeSorted(head1, head2);
		
		obj.printList(head1);
		
	}

}
