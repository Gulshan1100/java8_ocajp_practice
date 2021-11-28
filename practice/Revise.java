import java.util.Arrays;
class Revise{
	public static void main(String args[]){
	//	int[] a=new int[-3];
		int b[]={6,5,4,3,2,1};
		int [][]c={{7,4,6,5},{5,4,3},{8,6,7}};
	//	int d       []=new int[2147483647];
		int []     e;
		//int        []i;
	//	int[][] j;
	//	int k[][]=new int[][3];
	//	int []l[][]=new int[3][][1];
		int []m  [];
		int []n1,n2[];
	//	int[] []n2,[]n3;
		int[] []n4,n5[];
		System.out.println(args.length);
	//	System.out.println(a.length);
		System.out.println(b.getClass().getName());
		Arrays.parallelSort(c[0]);
		for(int i=0;i<c.length;i++){
			for(int j=0;j<c[i].length;j++){
				System.out.println(c[i][j]);
			}
		}
		System.out.println(b);
		System.out.println(c.length);
		for(int z:new int[] {1,2,3}){
			System.out.println(z);
		}
		
		

	}
}