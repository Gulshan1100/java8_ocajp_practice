import java.util.Scanner;
class Q{
	private int x;
	private int y;
	public Q(){
		x=0;
		y=0;
	}
	public Q(int x,int y){
		this.x=x;
		this.y=y;
	}
	public Q(Q p){
		x=p.getX();
		y=p.getY();
	}
	public Q(int x){
		this.x=x;
		y=0;
	}

	public int getX(){
		return x;
	}
	public void setX(int a){
		x=a;
	}
	public int getY(){
		return y;
	}
	public void setY(int a){
		y=a;
	}
	
	public void acceptData(){
		Scanner s=new Scanner(System.in);
		System.out.println("enter the values of x and y: ");
		x=s.nextInt();
		y=s.nextInt();
	}
	public void showData(){
		System.out.println("X : "+x);
		System.out.println("Y: "+y);
	}

	public static void main(String args[]){
		Q p=new Q();
		p.acceptData();
		p.showData();
		Q p1;
		p1= new Q();
		p1.setX(10);
		p1.setY(20);
		p1.showData();
	}
}

class Rectangle{
	private int width;
	private int height;
	public int getWidth(){
		return width;
	}
	public void setWidth(int a){
		width=a;
	}
	public int getHeight(){
		return height;
	}
	public void setHeight(int a){
		height=a;
	}
	public void acceptData(){
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the width and height: ");
		width=s.nextInt();
		height=s.nextInt();
	}
	public void showData(){
		System.out.println("Width: "+width);
		System.out.println("Height: "+height);
	}
	public int getArea(){
		return height*width;
	}
	public int getPerimeter(){
		return 2*(width+height);
	}
	public static void main(String args[]){
		Rectangle r=new Rectangle();
		r.acceptData();
		r.showData();
		System.out.println("area: "+r.getArea());
		
	}
}
class Class{
	private int a;
	public int b;
	public int getA(){
		return a;
	}
	public void setA(int a){
		this.a=a>100?100:a<0?0:a;
	}
	public static void main(String args[]){
		Class obj=new Class();
		obj.setA(10);
		obj.b=1000;
		System.out.println(obj.getA());
		System.out.println(obj.b);
	}
}
