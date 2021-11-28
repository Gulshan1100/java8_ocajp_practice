import java.util.*;
class Chutiyap{
	public static boolean IsPrime(int n){
		if(n%6==1 || n%6==5){
			return true;
		}
		else 
			return false;
	}
	public static void main(String args[]){
		Scanner s=new Scanner(System.in);
		String[] str=s.nextLine().split(" ");
		int m=Integer.parseInt(str[0]);
		int n=Integer.parseInt(str[1]);
		int count=0;
		for(int i=m;i<=n-6;){
			if(IsPrime(i) && IsPrime(i+6)){
				count++;
			}
			i=i+2;
		}
		System.out.print(count);
	}

}