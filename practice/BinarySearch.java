import java.util.Scanner;
import java.util.Arrays;
class BinarySearch{
	public static void main(String[] args){
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int[] arr=new int[n];
		for(int i=0;i<n;i++){
			arr[i]=s.nextInt();
		}
		for(int i=0;i<n;i++){
			int current=arr[i];
			int j=i-1;
			while(j>=0 && arr[j]>current){
				arr[j+1]=arr[j];
				j--;
			}
			arr[j+1]=current;
		}
		System.out.println(Arrays.toString(arr));
		int x=s.nextInt();
		int i=(n-1)/2;
		while(arr[i]!=x){
			if(arr[i]>x){
				i=i/2;
			}
			else if(arr[i]<x){
				i=(i+n)/2;
			}
		}
		if(i<0){
			System.out.println("Not found");
		}
		else{
			System.out.println("Index: "+i);
		}
	}
}