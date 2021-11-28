import java.util.*;
class CountingSort{
	public static void countingSort(int []arr){
		int cnt[] = new int[11];
		for(int i=0; i<arr.length; i++){
			cnt[arr[i]]++;		
		}
		int k=0;
		for(int i=0;i<cnt.length;i++){
			for(int j=0;j<cnt[i];j++){
				arr[k] = i;
				k++;
			}
		}
	}
	
	public static void countingSort2(int[] arr){
		int n = arr.length;
		int[] cnt = new int[11];
		Arrays.fill(cnt,0);
		for(int i = 0; i<n ;i++){
			cnt[arr[i]]++;
		}
		for(int i = 1; i<11; i++){
			cnt[i]+=cnt[i-1];
		}
		int[] out = new int[arr.length];
		for(int i = n-1; i>=0; i--){
			out[cnt[arr[i]]-1] = arr[i];
			cnt[arr[i]]--;
		}
		for(int i = 0; i< arr.length ; i++){
			arr[i] = out[i];
		}
	}
	
	public static void main(String args[]){
		int []arr = {10,10,9,8,7,6,5,5,6,7,5,6,5,4,3,2,1,2,3,1};
		System.out.println(Arrays.toString(arr));
		//countingSort(arr);
		countingSort2(arr);
		System.out.println(Arrays.toString(arr));
		
	}
}