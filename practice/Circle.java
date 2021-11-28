import java.util.Scanner;
class Circle extends Q{
	protected float radius;
	public Circle(){
		super(10,10);
		radius =10f;
	}
	public Circle(int x,int y){
		super(x,y);
		radius=10f; 
	}
	public Circle(float radius){
		super(10,10);
		this.radius=radius;
	}
	public Circle(int x,int y,float radius){
		super(x,y);
		this.radius=radius;
	}
	public Circle(Q p){
		super(p.getX(),p.getY());
		radius=10f;
	}
	public Circle(Q p,float radius){
		super(p.getX(),p.getY());
		this.radius=radius;
	}
	public float getRadius(){
		return radius;
	}
	public void setRadius(float radius){
		this.radius=radius;
	}
	public void acceptData(){
		super.acceptData();
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the radius : ");
		radius=s.nextFloat();
	}
	public void showData(){
		super.showData();
		System.out.println("Radius: "+radius);
	}
	public float getArea(){
		return (float)(3.14*radius*radius);
	}
	public float getCircumference(){
		return (float)(2*3.14*radius);
	}
	public Q getCenter(){
		int x=getX();
		int y=getY();
		Q p=new Q(x,y);
		return p;
		// return new Q(getX(),getY());
	}

	public static void main(String args[]){
		Circle c1=new Circle(10,20,30f);
		Q p=new Q(1,2);
		Circle c2=new Circle(p,3f);
		c1.showData();
		c2.showData();
		Q p2=c2.getCenter();
		p2.showData();
		c2.getCenter().showData();
	}
}