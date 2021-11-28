import java.util.Scanner;
class Sum{
	public static void main(String args[]){
		int n=0,sum=0;
		Scanner s=new Scanner(System.in);
		n=s.nextInt();
	
		sum=sum+(n/100);
		n=n%100;
		sum=sum+(n/10);
		n=n%10;
		sum=sum+n;
		System.out.println(sum);
	}
}