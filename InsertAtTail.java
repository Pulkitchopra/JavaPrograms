class Node{
	
	int data;
	Node next;
	
	
	
	
	Node(int d){	
		data = d;
		next = null;
		
	}
}


public class ArrayQuestions {
	
	
	
	
	
	
		
		public static void printList(Node head) {
			
			Node temp = head;
			
			while(temp != null) {
					
				System.out.print(temp.data + " ");
				
				temp = temp.next;
			}
		}
		
		static Node InsertAtTail(Node tail, int d) {
			
			Node temp = new Node(d);
			tail.next = temp;
			
			tail = temp;
			return tail;		
		}
		
		
	public static void main(String[] args) {
		
		Node node1 = new Node(0);
		
		Node tail = node1;
		
		tail = InsertAtTail(tail, 3);
		
		
		printList(tail);
			

	}
}
