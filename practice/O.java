class O{
	public static void main(String args[]){
		int j=0;
		while(true){
			j=j+2;
			if(j==10){
				break;
			}
			System.out.println(j);
		}
		System.out.println("Break");

		int k;
		abc:
		for(j=0;j<=5;j++){
			//abc:
			System.out.println("J: "+j);
			
			for(k=2;k<=5;k++){
				System.out.println("K: "+k);
				if(j==k)
					break abc;
			}
		}

		

		
	}
}