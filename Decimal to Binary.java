int n=6;
		
		int i=0,ans=0;
		
		while(n!=0) {
			int bit =n&1;
					
				ans = (int)(bit * Math.pow(10, i))+ans;
		
			
			n =n>>1;
			i++;
		}
		System.out.println(ans);
		
		
