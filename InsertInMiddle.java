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
  
		
		static Node InsertInMiddle(Node head, Node tail, int middle, int d) {
			
			if( middle == 1 ) {
				InsertAtHead(head, d);
			}
			
			Node temp = head;
			int count = 1;
			
			while(count < middle - 1) {
				temp = temp.next;
				count++;
			}
				
			Node nodeToInsert = new Node(d);
			nodeToInsert.next = temp.next;
		
			temp.next = nodeToInsert;


      
			
			if( temp.next == null ) {
					
				InsertAtTail(tail, d);
				return tail;
			}	
			return temp;
		}

	public static void main(String[] args) {
		
		
		Node node1 = new Node(1);
	
		System.out.print("Linked list: ");

    
		Node nodeToInsert = node1;
		




    
		nodeToInsert = InsertInMiddle(head, tail, 4, 2);

    
		printList(head);
	
	}
}
