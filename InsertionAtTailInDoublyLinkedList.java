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
		
		
	
	
	
	
	
	static Node InsertAtTail(Node tail, int d) {
		
		Node temp = new Node(d);
		
		tail.next = temp;
		
		temp.prev = tail;
		
		tail = temp;
		return tail;
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
		
		
	
		
		printList(head);
		
		
		
		Node tail = node1;
		
		tail = InsertAtTail(tail, 1);
		
		
		printList(head);

	}

}
