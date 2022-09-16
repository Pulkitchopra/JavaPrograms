public class PracticeSet {
	
	static void reverse(int arr[],int n) {
		
		int i,j,t;
		
		 for (i = 0; i < n / 2; i++) {
	         t = arr[i];
	         arr[i] = arr[n - i - 1];
	         arr[n - i - 1] = t;
	     }
		
		 for(int m=0;m<n;m++) {
			 
			 System.out.print(arr[m]+" ");
		 }
		 
	}


	public static void main(String[] args) {
		
		
	int arr[] = {1,2,3,4,5,6,7,8};
	
	reverse(arr,arr.length);
	 
	
		}
	}
