static int factorial(int n) {
		
		 int fact=1;
		 
		 for(int i=1;i<=n;i++) {
			 fact = fact * i;
		 }
		 return fact;
		
	}
	
	 static int ncr (int n,int r) {
		 
		
		 int num = factorial(n);
		 int denominator = factorial (n-r)* factorial(r); 
		 
		 int ans = (num/denominator);
		 
		 return ans;
		 
	 }
	
	public static void main(String[] args) {

		
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Enter the value of the n ");
		int num1 = sc.nextInt(); 
		
		System.out.println("Enter the value of the r ");
		int num2 = sc.nextInt(); 
		
		int func = ncr(num1,num2);
		System.out.println(func);
		
		
	}
	}
