import java.util.*;
class InsertionBinarySort{
	public static void BinarySort(int[] arr,int n,int current,int i){
		if(current>arr[i-1]){
			i++;
			current=arr[i];
			BinarySort(arr,n,current,i);
		}
		
		else{
			if(current<arr[n/2] && current>arr[(n/2)-1]){
				current=arr[n/2];
				arr[n/2]=arr[i];
				arr[i]=current;
				BinarySort(arr,n,current,i);
			}
			else if(current<arr[(n/2)-1]){
				BinarySort(arr,n/2,current,i);
			}
			else if(current<arr[(n/2)+1]){
				BinarySort(arr,((n/2)+i)/2,current,i);
			}
			else{
				return;
			}
		}
		
	}
	public static void main(String[] args){
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int[] arr=new int[n];
		for(int i=0;i<n;i++){
			arr[i]=s.nextInt();
		}
		System.out.println(Arrays.toString(arr));
		BinarySort(arr,arr.length-1,arr[1],1);
		System.out.println(Arrays.toString(arr));
	}
}
//Gulshan@1100