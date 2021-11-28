import java.util.*;
class ShellSorter{
	public static void shellSort(int arr[], int h){
		if(h<arr.length){
			shellSort(arr , (3*h + 1));
		}
		else {
			return;
		}
		for(int i=0;i<h;i++){
			
			int k = i;
			while (k < arr.length) {
			int current = arr[k];
			int j = k-h;
			while (j >=0 && arr[j] >= current) {
				arr[j+h] = arr[j];
				j = j - h;
			}
			arr[j+h] = current;
			k = k + h;
			}
		}
	}
	
	
	public static void main(String args[]){
		int[] arr = {20,19,18,17,16,15,14,13,12,11,10,9,8,7,6,5,4,3,2,1};
		System.out.println(Arrays.toString(arr));
		shellSort(arr , 1);
		System.out.println(Arrays.toString(arr));
	}
}