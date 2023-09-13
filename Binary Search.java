public class ArrayQuestions {
	
	
	static int binarySearch(int arr[], int key) {
		
		int low = 0;
		
		int high = arr.length - 1;
		int mid = (low + high)/2;
		
		
		while(low <= high) {
			
			if(arr[mid] == key) {
				
				return mid;
			}
			if(arr[mid] < key) {
				
				low = mid + 1;
			}
			else {
				high = mid - 1;
			}
			
			mid = (low + high)/2;
			
		}
		return -1;
			
	}
	
	
	public static void main(String[] args) {
		
		int arr[] = {1,2,3,4,5,6,7,8};
		
		System.out.println(binarySearch(arr, 5));

	}
}
