class Node{
	
	int data;
	Node next;
	
	
	
	
	Node(int d){	
		data = d;
		next = null;
		
	}
}


public class ArrayQuestions {
	
	
	
	
	
	
	
       static Node InsertAtHead( Node head, int d ) {
		
		
			
			Node temp = new Node(d);
			
			temp.next = head;
			
			head = temp;
			return head;
			
		
		}
		
		public static void printList(Node head) {
			
			Node temp = head;
			
			while(temp != null) {
				
				
				
				System.out.print(temp.data + " ");
				
				temp = temp.next;
			}
		}
		
	
	
	public static void main(String[] args) {
		
		
		Node head = null;
		
		head = InsertAtHead(head, 8);
		head = InsertAtHead(head, 9);
		
		printList(head);
	
		

	}
}
