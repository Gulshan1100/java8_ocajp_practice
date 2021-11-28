import java.util.*;
class DoublePeak{
	public static void main(String args[]){
		Scanner s=new Scanner(System.in);
		int n=Integer.parseInt(s.nextLine());
		int m=Integer.parseInt(s.nextLine());
		int[][] arr=new int[n][m];
		for(int i=0;i<n;i++){
			String[] str=s.nextLine().split(" ");
			for(int j=0;j<m;j++){
				arr[i][j]=Integer.parseInt(str[j]);
			}
		}
		for(int i=0;i<n;i++){
			System.out.println(Arrays.toString(arr[i]));
		}	
	}
}