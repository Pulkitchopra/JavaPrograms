 class Node{

	int data;
	Node prev;
	
	
	
	
	Node next;
	
	Node(int d){
		
		data = d;
		
		prev = null;
		
		next = null;
		
	}
}
	 
	 
	 
	 
	public class LinkedList {	
		
		
	
	static Node InsertAtHead( Node head,  int d ) {
		
		
		
		Node temp = new Node(d);
		
		temp.next = head;
		
		head.prev = temp;
		
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
		
		Node node1 = new Node(8);
			
		Node head = node1;
		
		head = InsertAtHead(head, 8);
		
	
		
		printList(head);
		
	}

}
