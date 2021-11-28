import java.util.*;
class MergeSort{
	public static void sort(int[] arr,int start,int end){
		if(start<end){
			int middle=(int)Math.floor((start+end)/2);
			sort(arr,start,middle);
			sort(arr,middle+1,end);
			merge(arr,start,middle,end);
		}
	}
	public static void merge(int[] arr,int start,int middle,int end){
		int n1=middle-start+1;
		int n2=end-middle;
		int[] left=new int[n1];
		int[] right=new int[n2];
		
		for(int i=0;i<n1;i++){
			left[i]=arr[start+i];
		}
		for(int j=0;j<n2;j++){
			right[j]=arr[middle+1+j];
		}
		int i=0,j=0;
		for(int k=start;k<=end;k++){
			if((j >=n2) ||(i<n1 && left[i]<=right[j])){
				arr[k]=left[i];
				i++;
			}
			else{
				arr[k]=right[j];
				j++;
			}
		}
		
	}
	
	public static void main(String[] args){
		int[] arr={10,9,8,7,6,5,4,3,2,1};
		sort(arr,0,arr.length-1);
		System.out.println(Arrays.toString(arr));
		
	}
}