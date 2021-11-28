import java.util.*;
class Demo{
	public static void main(String[] args){
		Scanner s=new Scanner(System.in);
		String str=s.nextLine();
		String[] st=str.split(" ");
		int[] arr=new int[st.length];
		for(int i=0;i<st.length;i++){
			arr[i]=Integer.parseInt(st[i]);
		}
		System.out.println(Arrays.toString(arr));
		
	}
}