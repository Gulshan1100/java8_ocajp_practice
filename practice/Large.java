import java.util.Scanner;
class Large{
	public static void main(String args[]){
		int[] num;
		int max=0;
		int n=0;
		Scanner s=new Scanner(System.in);
		n=s.nextInt();
		num=new int[n];
		for(int i=0;i<n;i++){
			num[i]=s.nextInt();
		}
		for(int i=0;i<n;i++){
			if(max<num[i]){
				max=num[i];
			}
			else{
				continue;
			}
		}
		System.out.println(max);
	}
}