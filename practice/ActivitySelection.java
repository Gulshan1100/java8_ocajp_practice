import java.util.*;
class ActivitySelection{
	public static void activitySelection(int s[], int e[], int n){
		int i=0,j;
		System.out.println(i);
		for(j = 1;j<n;j++){
			if(s[j] >= e[i]){
				System.out.println(j);
				i = j;
			}
		}
	}
	public static void main(String args[]){
		int []s = {1,3,0,5,8,5};
		int []e = {2,4,6,7,9,9};
		int n = s.length;
		activitySelection(s,e,n);
	}
}