import java.util.*;
class InsertionSort{
	public static void main(String[] args){
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int[] arr=new int[n];
		for(int i=0;i<n;i++){
			arr[i]=s.nextInt();
		}
		System.out.println(Arrays.toString(arr));
		
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
	}
}