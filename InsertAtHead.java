public class LinkedList {	

	
	Node head;
	
	public class Node{
		
		
		
		
		
		int data;
		Node next;
		
		
		Node(int d){
			
			data = d;
			next = null;		
		}
	}
	public void InsertAtHead( int d ) {
		
		
		
		Node temp = new Node(d);
		
		temp.next = head;
		
		head = temp;
	}
	

	public void printList() {
		
		Node temp = head;
		
		while(temp != null) {
			
			System.out.print(temp.data + " ");
			
			temp = temp.next;
		}
	}
	
	
	
	

	public static void main(String[] args) {
		
       LinkedList list = new LinkedList();
		
		list.InsertAtHead(6);
		list.InsertAtHead(8);
		list.InsertAtHead(16);
		
		list.printList();

	}

}
