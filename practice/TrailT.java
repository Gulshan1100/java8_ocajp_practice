import java.util.*;
class TrailT{
	public static void main(String []args){
		Scanner s = new Scanner(System.in);
		String[] str = s.nextLine().split(",");
		int small = 1000;
		int smind = 0;
		String res = "";
		for(int i = 0;i<str.length ; i++){
			if(small > Integer.parseInt(str[i])){
				small = Integer.parseInt(str[i]);
				smind = i;
			}
		}
		res = res + small + "," ;
		int large = 0;
		for(int i = smind; i<str.length ; i++){
			if(large < Integer.parseInt(str[i])){
				large = Integer.parseInt(str[i]);
			}
		}
		res = res + large;
		System.out.println(res);
	}
}