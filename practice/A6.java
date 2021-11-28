import java.util.*;
import java.io.*;
import java.lang.String;
class Solution{
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        int T=0;
        T=s.nextInt();
        String[] ts=new String[T];
        for(int i=0;i<T;i++){
            int n=s.nextInt();
  //          n=s.nextInt();
            String fs=s.next();
            fs=fs.replace('E','A');
			fs=fs.replace('S','E');
			fs=fs.replace('A','S');
			ts[i]=fs;
        }
        for(int i=0;i<T;i++){
            System.out.println("Case #"+T+1+": "+ts[i]);
            
                
         
        }
    }
}