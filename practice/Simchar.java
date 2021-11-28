import java.util.*;
public class Simchar2{
	public static void main(String[] args){
		Scanner s=new Scanner(System.in);
		int n=Integer.parseInt(s.nextLine());
		String str=new String();
		str=s.nextLine();
		str=str.toLowerCase();
		int q=s.nextInt();
		int[] ar=new int[q];
		for(int i=1;i<=n;i++){
				for(int j=p-2;j>=0;j--){
				if(str.charAt(p-1)==str.charAt(j)){
					ar[i-1]++;
				}
			}
		}
		for(int i=0;i<q;i++){
			System.out.print(ar[i]);
			if((i+1)<q){
				System.out.println();
			}
		}
	}
}

		