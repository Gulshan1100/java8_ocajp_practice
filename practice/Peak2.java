import java.util.*;
class Solution{
	
	public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        int t = Integer.parseInt(s.nextLine());
        String res = "";
		int tn = 1;
        while(t-->0){
            int n = Integer.parseInt(s.nextLine());
            String[] arr = s.nextLine().split(" ");
            int cnt = 0;
			int[] str = new int[arr.length];
			for(int i = 0; i<arr.length ; i++){
				str[i] = Integer.parseInt(arr[i]);
			}
            for(int i=1;i<str.length-1;i++){
		    
		    	if(str[i]>str[i+1] && str[i]>str[i-1]){
		    	    cnt++;
		    		
		    	}
            }
			
			res = res + "Case #"+tn+": "+cnt+"\n";
			tn++;
		
        }
        System.out.print(res);
		
	}
}