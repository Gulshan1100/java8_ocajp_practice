import java.util.Scanner;
class J{
	public static void main(String args[]){
		Scanner s=new Scanner(System.in);
		float radius,area,cir;
		System.out.println("Radius: ");
		radius=s.nextFloat();
		area=3.14f*radius*radius;
		cir=2*3.14f*radius;
		System.out.println("Area: "+ area);
		System.out.println("Circumference: "+cir);
		
	}
}