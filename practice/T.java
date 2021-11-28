import java.util.Scanner;
class T{
	public static void main(String args[]){
		Scanner s=new Scanner(System.in);
		int[] num=new int[10];
		int sum=0,avg=0;
		for(int i=0;i<num.length;i++){
			num[i]=s.nextInt();
			sum+=num[i];
		}
		avg=(sum/num.length);
		System.out.println(sum);
		System.out.println(avg);
	}
}