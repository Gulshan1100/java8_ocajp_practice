import java.util.*;
class KotaFactory {
		 public static int gcd(int m,int n){
			if(m == 0){
				return n;
			}
			return gcd(n%m,m);
		}

	public static void main(String args[]){
		Scanner s = new Scanner(System.in);
		int t = Integer.parseInt(s.nextLine());
		String res = "";
		while(t>0){
			int N = Integer.parseInt(s.nextLine());
			String[] str = s.nextLine().split(" ");
			int cnt = 0;
			int[] arr = new int[N];
			int  i = 0;
			for(String st : str){
				arr[i] = Integer.parseInt(st);
				i++;
			}
			int[] multi = new int[N];
			multi[0] = arr[0];
			for(i =1;i<N;i++){
				int temp = multi[i-1]* arr[i];
				multi[i] = temp;
			}
			int k = multi[N-1];
			for(i=0;i<arr.length;i++){
				int m = arr[i];
				int n = k/arr[i];
				if(gcd(m,n)==1){
					cnt++;
					
				}
				if(gcd(n,m%n)==1){
					cnt++;
					
				}
			}
			for(i = 1;i<N-2;i++){
				
				int m = multi[i];
				int n = k/m;
				if(gcd(m,n)==1){
					cnt++;
				}
				if(gcd(n,m%n)==1){
					cnt++;
				}
			}
			
			res = res +cnt +"\n";
			t--;
		}
		System.out.println(res);
	}
}