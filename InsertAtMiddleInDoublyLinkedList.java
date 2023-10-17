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
	
	
	
	
	static Node InsertAtTail(Node tail, int d) {
		
		Node temp = new Node(d);
		
		tail.next = temp;
		
		temp.prev = tail;
		
		tail = temp;
		return tail;
	}
	
	static Node InsertInMiddle(Node head, Node tail, int middle, int d) {
		
		if(middle == 1) {
			
			InsertAtHead(head, d);
			
		}
		
		
		
		
		Node temp = head;
		
		
		int count = 1;
		
		while(count < middle - 1) {
			temp = temp.next;
			count++;			
		}
		if(temp.next == null) {
			
			InsertAtTail(tail, d);
		}
		
		Node nodeToInsert = new Node(d);
		
		
		
		nodeToInsert.next = temp.next;
		temp.next.prev = nodeToInsert;
		
		temp.next = nodeToInsert;
		
		nodeToInsert.prev = temp;
		return temp;
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
		
		
		
		Node tail = node1;
		
		tail = InsertAtTail(tail, 1);
		
		
		printList(head);
		
		
		Node nodeToInsert = node1;
		
		nodeToInsert =  InsertInMiddle(head, tail, 4, 8);
		
		printList(head);
   

	}

}
