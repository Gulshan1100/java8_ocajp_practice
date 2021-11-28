/*package whatever //do not write package name here */

import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main (String[] args) {
		//code
		Scanner s =  new Scanner(System.in);
		int t=Integer.parseInt(s.nextLine());
		String res = "";
		
		while(t>0){
		    int n = Integer.parseInt(s.nextLine());
		    String[] str = s.nextLine().split(" ");
		    int k=n-1;
		    String str1 ="";
		    String str2 ="";
		    int j = 0;
		    for(String st : str){
		        if(st.equals("0")){
		            str1=str1+ "0" + " ";
		        }
		        else{
		            str2 = str2 + st + " ";
		        }
		    }
		    
		    res = str2 + str1 +"\n";
		    t--;
		}
		System.out.print(res);
	}
}