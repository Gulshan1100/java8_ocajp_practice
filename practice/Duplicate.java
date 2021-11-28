import java.util.*;
class Duplicate{
	public static void duplicate(int[] arr){
		for(int i=0;i<arr.length;i++){
			if(arr[Math.abs(arr[i])] >= 0){
				arr[Math.abs(arr[i])] = -arr[Math.abs(arr[i])];
			}
			else System.out.println(Math.abs(arr[i]));
		}
	}
	public static void main(String []args){
		int[] arr = {1,2,3,3,4,5,4,8,6};
		duplicate(arr);
	}
}