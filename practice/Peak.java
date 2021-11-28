import java.util.*;
class Peak{
	public static void FindPeak(int[] arr,int start,int end){
		if(arr[start]>arr[start+1] && end==arr.length-1){
			System.out.println("dndc"+arr[start]);
			return;
		}
		if(arr[end]>arr[end-1] && end==arr.length-1){
			System.out.println("dndc"+arr[end]);
			return;
		}
		if(start<end){
			int middle=Math.abs((start+end)/2);
			if(arr[middle]<arr[middle+1]){
				FindPeak(arr,start,middle);
			}
			else if(arr[middle]<arr[middle-1]){
				FindPeak(arr,middle+1,end);
			}
			else{
				System.out.println("dandc"+arr[middle]);
			}
		}
	}
	
	public static void main(String args[]){
		Scanner s=new Scanner(System.in);
		String[] str=s.nextLine().split(" ");
		int[] arr=new int[str.length];
		for(int i=0;i<str.length;i++){
			arr[i]=Integer.parseInt(str[i]);
			arr[i]=Integer.parseInt(str[i]);
		}
		System.out.println(Arrays.toString(arr));
		for(int i=0;i<arr.length-1;i++){
			if(i==0 && arr[i]>arr[i+1]){
				System.out.println(arr[i]);
			}
			else if(i==arr.length-2 && arr[arr.length-1]>arr[i]){
				System.out.println(arr[arr.length-1]);
			}
			else if(arr[i]>=arr[i+1] && arr[i]>=arr[i-1]){
				System.out.println(arr[i]);
				
			}
		}
		FindPeak(arr,0,arr.length-1);
		
	}
}