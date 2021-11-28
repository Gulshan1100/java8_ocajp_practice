class N{
	public static void main(String args[]){
		int i;
		i=1;
		while(i<10){
			System.out.println(i);
			i++;
		}
		System.out.println(i);

		do{
			System.out.println(i);
			i++;
		}
		while(i<100);
		for(;i<300;i++){
			System.out.println(i);
		}
	}
}