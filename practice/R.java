import java.util.Scanner;
class R{
	protected int a;
	protected int b;
	protected static int ctr;
	public R(){
		ctr++;
	}
	public R(int a,int b){
		this.a=a;
		this.b=b;
		ctr++;
	}
	public static int getCtr(){
		return ctr;
	}
	public void getData(){
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the values of a and b : ");
		a=s.nextInt();
		b=s.nextInt();
	}
	public void showData(){
		System.out.println("A: "+a);
		System.out.println("B: "+b);
	}
	public static void main(String args[]){
		R x=new R();
		R y=new R(1,2);
		R z=new R(5,6);
		System.out.println("NO. of obj: "+R.getCtr());
	}
}