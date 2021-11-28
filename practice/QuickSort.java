import java.util.*;
class QuickSort {
	public static void Quick(int[] arr, int start, int end){
		if(start < end){
			int pivot = partition(arr,start,end);
			Quick(arr,start,pivot-1);
			Quick(arr,pivot+1,end);
		}
	}
	public static int partition(int[] arr,int start, int end){
		int i=start;
		int pivot = arr[end];
		for(int j=start; j<end;j++){
			if(arr[j] <= pivot){
				int temp = arr[j];
				arr[j] = arr[i];
				arr[i] = temp;
				i++;
			}
		}
		int temp = arr[end];
		arr[end] = arr[i];
		arr[i] = temp;
		return i;
	}
	
	public static void main(String[] args){
		int[] arr = {5,4,3,2,1};
		System.out.println(Arrays.toString(arr));
		Quick(arr,0,arr.length-1);
		System.out.println(Arrays.toString(arr));
	}
}