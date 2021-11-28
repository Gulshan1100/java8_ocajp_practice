import java.util.Scanner;
class SelectionSort{
	public static void main(String[] args){
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int[] arr=new int[n];
		for(int i=0;i<n;i++){
			arr[i]=s.nextInt();
		}
		for(int i=0;i<n;i++){
			System.out.print(arr[i]);
		}
		System.out.println();
		for(int i=0;i<n;i++){
			for(int j=i;j<n;j++){
				if(arr[i]>arr[j]){
					int temp=0;
					temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		for(int i=0;i<n;i++){
			System.out.print(arr[i]);
		}
	}
}