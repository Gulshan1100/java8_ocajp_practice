import java.util.*;
class Sol{
	public static void main(String args[]){
		int arr[][] = {{10,15,2,5},{20,4,14,12},{10,11,10,2},{2,3,4,5}};
		int m = arr[0].length;
		int res = 0;
		int j = 0;
		int chck = 0;
		for(int i=0;i<arr.length;i++){
			int crr = arr[i][j];
				while(j<m){
					if(crr < arr[i][j]){
						crr = arr[i][j];
						chck = j;
					}
					j++;
				}
				
				res = res+crr;
				if(chck > (m/2) - 1){
					j = 0;
				}else j = m/2 -1;
				
		}
		System.out.println(res);
	}
}
