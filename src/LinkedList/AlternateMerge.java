package LinkedList;


public class AlternateMerge {
	public class LLNode{
		int data;
		LLNode next;
		
		LLNode(int data){
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
	
	public LLNode alternateMerge(LLNode head1, LLNode head2) {
		
		LLNode curr1 = head1;
		LLNode curr2 = head2;
		
		while(curr1 != null && curr2 != null) {
			LLNode temp = curr1.next;
			curr1.next = curr2;
			LLNode temp1 = curr2.next;
			curr2.next = temp;
			curr1 = temp;
			curr2 = temp1;
		}
		
		if(curr1 != null) {
			curr2 = curr1;
		}
		
		return head1;
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AlternateMerge obj = new AlternateMerge();
		
		LLNode head = null;
		head = obj.insert(head, 1);
		head = obj.insert(head, 2);
		head = obj.insert(head, 3);
		
		LLNode head1 = null;
		head1 = obj.insert(head1, 7);
		head1 = obj.insert(head1, 8);
		head1 = obj.insert(head1, 9);
		head = obj.insert(head, 4);
		
		head = obj.alternateMerge(head, head1);
		obj.printList(head);
	}

}
