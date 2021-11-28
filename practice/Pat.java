class Pat{
	public static void main(String args[]){
		int ctr=1,n=3;
		for(int i=1;ctr<=7;i++){
			int spc=0;
			while(spc<n){
					System.out.print(" ");
					spc++;
				}
			for(int j=1;j<=i;j++){
				
				System.out.print(j);
				ctr=j;
			}
			System.out.println();
			n--;
			
		}
	}
}