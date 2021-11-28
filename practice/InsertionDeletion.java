import java.util.Scanner;
import java.util.Arrays;
class InsertionDeletion{
	public static void main(String[] args){
		Scanner s=new Scanner(System.in);
		int[] a=new int[10];
		for(int i=0;i<10;i++){
			a[i]=s.nextInt();
		}
		Arrays.sort(a);
		System.out.println(Arrays.toString(a));
	}
}