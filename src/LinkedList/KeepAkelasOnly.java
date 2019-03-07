package LinkedList;

public class KeepAkelasOnly {

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

	public LLNode keepAkelas(LLNode head) {
		
		LLNode curr = head;
		LLNode prev = null;
		
		//while(curr )
		while(curr != null && curr.next != null) {
			
			int value = curr.data;
			while(value == curr.next.data) {
				
			}
			
			prev = curr;
			curr = curr.next;
		
			
		}
		
		
		return head;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		KeepAkelasOnly obj = new KeepAkelasOnly();
		LLNode head = null;
		head = obj.insert(head, 1);
		head = obj.insert(head, 1);
		head = obj.insert(head, 2);
		head = obj.insert(head, 2);
		head = obj.insert(head, 4);
		head = obj.insert(head, 4);
		head = obj.insert(head, 7);
		head = obj.insert(head, 9);
		head = obj.insert(head, 11);
		head = obj.insert(head, 11);
		obj.printList(head);

		head = obj.keepAkelas(head);
		System.out.println("akela");
		obj.printList(head);
	}

}
