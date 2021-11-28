import java.util.*;
class KadaneAlgo { //maXimum subarray problem
	public static void main(String[] args){
		Scanner s=new Scanner(System.in);
		int[] arr={4,-2,-3,5,6};
		int max_current = arr[0];
		int max_global = arr[0];
		for(int i=1;i<arr.length;i++){
			max_current = arr[i] > (max_current + arr[i]) ? arr[i] : max_current + arr[i];
			if(max_current > max_global)
				max_global = max_current;
		}
		System.out.println(max_global);
	}
}