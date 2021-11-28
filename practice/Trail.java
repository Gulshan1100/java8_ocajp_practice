/* 
 * Enter your code here. Read input from STDIN. Print your output to STDOUT. 
 * Your class should be named CandidateCode.
*/

import java.io.*;
import java.util.*;
public class CandidateCode {
    public static void main(String args[] ) throws Exception {

    	//Write code here
        Scanner s=new Scanner(System.in);
        int t = Integer.parseInt(s.nextLine());
        String res = "";
        while(t>0){
            int lasterm = 1;
            int newterm = 1;
            int sum = 0;
            int n = Integer.parseInt(s.nextLine());
            int x= 0;
            for(int i = 0;i<n-1;i++){
                if(i == 0){
                    x = 1;
                }
                x = newterm* lasterm;
                lasterm = newterm;
                newterm = (lasterm*2) +sum;
                sum = sum + lasterm;
            }
            res = res  + x +"\n";
            t--;
        }
        System.out.print(res);
   }
}
