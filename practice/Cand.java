/* 
 * Enter your code here. Read input from STDIN. Print your output to STDOUT. 
 * Your class should be named CandidateCode.
*/

import java.io.*;
import java.util.*;
public class Cand {
    public static int gcd(int m,int n){
        if(m == 0){
            return n;
        }
        return gcd(n%m,m);
    }
    public static void main(String args[] ) throws Exception {

    	//Write code here
        Scanner s=new Scanner(System.in);
        int t = Integer.parseInt(s.nextLine());
        String res = "";
        while(t>0){
            int n = Integer.parseInt(s.nextLine());
            String[] str = s.nextLine().split(" ");
            int count = 0;
            int[] arr=new int[str.length];
            int k = 0;
            for(String st : str){
                arr[k] = Integer.parseInt(st);
                k++;
            } 
           int[] forward = new int[str.length];
           int[] backward = new int[str.length];
           forward[0] = Integer.parseInt(str[0]);
           backward[n-1] = Integer.parseInt(str[n-1]);
           for(int i=1;i<str.length;i++){
               int temp = forward[i-1]*arr[i];
               forward[i] = temp;           
            }
            for(int i = n-2 ; i>=0 ;i--){
                int temp = backward[i+1]* arr[i];
                backward[i] = temp;
            }
            int[] midleft = new int[n/2];
            int[] midright = new int[n/2];
            midleft[(n/2) -1 ] = arr[(n/2) - 1];
            midright[0] = arr[(n/2)-1];
            for(int i = (n/2)-2 ; i>=0;i--){
                int temp = midleft[i+1]*arr[i];
                midleft[i] = temp;
            }
            
            for(int i=0;i<n-1;i++){
                if(gcd(forward[i],backward[i]) == 1 ){
                    count++;
                }
                int f = forward[i];
                int b = backward[i+1]; 
                if(gcd(b,f%b)==1){
                    count++;
                }
            }
            for(int i = (n/2)-1 ; i>0;i--){
               int m = midleft[i];
               int x = forward[i-1] * backward[(n/2)];
               if(gcd(m,x) == 1){
                   count++;
               }
               if(gcd(x,m%x)==1){
                   count++;
               }
            }
           
           
            res = res +count+"\n";
            t--;
        }
        System.out.println(gcd(8,3));
		
   }
}
