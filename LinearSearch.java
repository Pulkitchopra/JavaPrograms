	static int linear(int arr[], int n, int key) {
		
		for(int i=0;i<n;i++) {
			
			if(arr[i]==key) {
				return 1;
			}
		}
		return 0;
	}

public static void main(String[] args) {


	int arr [] = {10, 4, 20, 22, 24, 1, 8, 42, 44, 5};
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the key ");
		int key = sc.nextInt();
	
		int search = linear(arr,10,key);
		
		if(search==1) {
			
			System.out.println("The element is present");
		}
		else {
			System.out.println("The element is absent");
		}
		
  	}
	}
