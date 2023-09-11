public class ArrayQuestions {
	
	
	static void swap (int arr[], int n) {
		
		int t;
		
		for ( int j=0; j<n; j+=2) {
			
			
			
			if(j+1 < n) {
				t = arr[j];
				arr[j] = arr[j+1];
				
				arr[j+1] = t;
				
			}

		}
		
		for(int m=0; m<n; m++) {	
			System.out.print(arr[m] + " ");
			
		}		
	}
	
	
	
	
	

	public static void main(String[] args) {
		
		int arr[] = {1,2,3,4,5,6,7,8,9,10};
		
		swap(arr, arr.length);
		

	}

}
