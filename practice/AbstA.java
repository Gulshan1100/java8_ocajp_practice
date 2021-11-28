import java.util.Scanner;
abstract class AbstA{
	private int b;
	public int getB(){
		return b;
		
	}
	//public abstract void acceptData();
	public abstract void showData();
	public static void main(String args[]){
		System.out.println("abstractclass");
		//AbstA a=new AbstA();
		//System.out.println(getB());
		
	}
}
class Derived extends AbstA{
	private int a;
	public Derived(){}
	public Derived(int a){
		this.a=a;
	}
	public void getData(){
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the int: ");
		a=s.nextInt();
	}
	public void showData(){
		System.out.println("Int : "+a);
	}
	public static void main(String args[]){
		AbstA a=new Derived();
		Derived b=new Derived(10);
		AbstA c=new Derived(20);
	//	super.getB();
		//AbstA d=new AbstA();
		a.showData();
		b.showData();
		c.showData();
	//	d.showData();
	}
}