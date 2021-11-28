import java.util.*;
class RadixSort{
	public static void radixSort(int[] arr){
		int max = maximum(arr);
		for(int exp=1; max/exp >0 ; exp*=10){
			countSort(arr,exp);
		}
	}
	public static int maximum(int[] arr){
		int m = arr[0];
		for(int i = 1; i<arr.length; i++){
			if(m<arr[i]){
				m = arr[i];
			}
		}
		return m;
	}
	public static void countSort(int[] arr, int exp){
		int n = arr.length;
		int[] cnt = new int[10];
		Arrays.fill(cnt,0);
		for(int i = 0; i<n ;i++){
			cnt[(arr[i]/exp)%10]++;
		}
		for(int i = 1; i<10; i++){
			cnt[i]+=cnt[i-1];
		}
		int[] out = new int[arr.length];
		for(int i = n-1; i>=0; i--){
			out[cnt[(arr[i]/exp)%10]-1] = arr[i];
			cnt[(arr[i]/exp)%10]--;
		}
		for(int i = 0; i< arr.length ; i++){
			arr[i] = out[i];
		}
	}
	public static void main(String[] args){
		int arr[] = {170, 45, 75, 90, 802, 24, 2, 66};
		System.out.println(Arrays.toString(arr));
		radixSort(arr);
		System.out.println(Arrays.toString(arr));
	}
}