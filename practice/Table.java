import java.util.*;
class Table {
	public static void main(String []agrs){
		Scanner s =  new Scanner(System.in);
		int n = s.nextInt();
		for(int i = 1; i<=10;i++){
			System.out.println(n + " * " + i + " = " + i*n);
		}
	}
}