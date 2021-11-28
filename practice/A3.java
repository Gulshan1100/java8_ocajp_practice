interface L{
	void m1(int i);
	//int m2();
	int x=1;
	default void d(){
		System.out.println("Default bitchesss");
	}
	public static void main(String args[]){
		System.out.println("Interface betchesss");
	}
	static void m(){
		System.out.println("Static method ");
	}
	
}
interface R{
	void m1();
	void m2();
	int x=2;
	default void d(){
		System.out.println("Default R bitchesss");
	}
}
class A3 implements R,L{
	public void m1(){}
	public void m1(int a){}
	//public int m2(){}
	public void m2(){}
	static void m(){
		System.out.println("Static here method ");
	}
	public void d(){
		L.super.d();
		R.super.d();
		System.out.println(" bitchesss");
		
	}
	public static void main(String args[]){
		int x=3;
		System.out.println(x);
		System.out.println(R.x);
		System.out.println(L.x);
		A3 a=new A3();
		L.super.d();
		a.d();
		L.m();
		m();
	//	String []a=new String[0];
	//	L.main(a);
		
	}
}
class A5 extends A3{
	public static void main(String args[]){
		m();
		A5 a=new A5();
	//	a.d();
	}
}