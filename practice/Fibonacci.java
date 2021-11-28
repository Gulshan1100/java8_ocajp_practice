import java.util.*;
class Fibonacci{
	public static int naiveRecursion(int n){
		int f = n<=2 ? 1 : (naiveRecursion(n-1) + naiveRecursion(n-2));
		return f;
	}
	public static void main(String[] args){
		Scanner s=new Scanner(System.in);
		int n=11;
		System.out.println(naiveRecursion(n));	
	}
}