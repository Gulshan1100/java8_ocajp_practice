import java.util.Scanner;
class Trace{
	public static void main(String args[]){
		Scanner s=new Scanner(System.in);
		int i,j,n;
		System.out.println("Enter the number of lines for pattern: ");
		n=s.nextInt();
		for(i=0;i<=(n-1);i++){
			for(j=0;j<=i;j++){
				System.out.print("*");
			}
			System.out.println();
		}
	}
}