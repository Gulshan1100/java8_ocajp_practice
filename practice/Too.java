class Too{
	String msg;
	public Too(String msg){
		this.msg = msg;
	}
	public static void main(String[] args){
			System.out.println( new StringBuilder("Java SE 8"));
			System.out.println( new Too("Java SE 8").msg); 
	
	}
}