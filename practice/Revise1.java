class Revise1{
	static int x=10;
	int y=20;
	
	public static void main(String args[]){
		System.out.println(x);
		System.out.println(Revise1.x);
		Revise1 r=new Revise1();
		System.out.println(r.x);
		System.out.println(r);
		x=50;
		System.out.println(x);
		
		
	}
}