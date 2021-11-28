import java.util.Scanner;
class Prime{
	public static void main(String args[]){
		int n,i;
		boolean b=false;
		Scanner s=new Scanner(System.in);
		System.out.println("enter the NO. : ");
		n=s.nextInt();
		if(n==2){
			System.out.println("the given no. 2 is a prime no. ");
			return;
		}
		if(n==1){
			System.out.println("the no. 1 is not a prime no. ");
			return;
		}
		for(i=2;i<n;i++){
			if(n%i==0){
				b=true;
				break;
			}
			
		}
		if(b==true){
			System.out.println("the no. "+n+" is a not a prime no.");
		}
		else{
			System.out.println("the no. "+n+" is a prime no.");
		}
	}
	
}