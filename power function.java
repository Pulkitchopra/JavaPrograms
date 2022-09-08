static int square(int a, int b) {
		
		int sq=1;
		for(int i=1;i<=b;i++) {
			
			sq=sq*a;
		}
		return sq;
		
	}

	public static void main(String[] args) {

		
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Enter the value of the first number");
		int num1 = sc.nextInt(); 
		
		System.out.println("Enter the value of the second number");
		int num2 = sc.nextInt();
		
		sc.close();
		
		int power= square(num1,num2);
		
		System.out.println("The square of numbers is "+ power);		
		
	}
	}
