import java.util.Scanner;
class Circle2{
	protected float radius;
	public static final float pi=3.14f;
	public Circle2(){
			
	}
	public Circle2(float radius){
		this.radius=radius;
	
	}
	public float getRadius(){
		return radius;
	}
	public void setRadius(float radius){
		this.radius=radius;
	}
	public void getData(){
		Scanner s=new Scanner(System.in);
		System.out.println("enter The radius: ");
		radius=s.nextFloat();
	}
	public  void showData(){
		System.out.println("Radius: "+radius);
	}
	public float getArea(){
		return radius*radius*pi;
	}
	public float getCir(){
		return pi*2f*radius;
	}
	public static void main(String args[]){
		Circle2 a=new Circle2();
		a.getData();
		a.showData();
		System.out.println("area: "+a.getArea());
	}
}

final class Circle3 extends Circle2{
	public static void main(String args[]){
		
		
	}
	
}