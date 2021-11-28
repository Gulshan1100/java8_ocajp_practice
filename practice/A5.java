import java.util.*;
import java.io.*;
import java.lang.String;
class Solution{
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        int T=0;
        T=s.nextInt();
        String[][] ts=new String[T][];
        for(int i=0;i<T;i++){
            int n=s.nextInt();
  //          n=s.nextInt();
            String ns=s.nextLine();
            for(int j=0;j<ns.length();j++){
                String[] ss=ns.split("");
                if(ss[j]=="E"){
                    ss[j]="S";
                }
                else if(ss[j]=="S"){
                    ss[j]="E";
					
                }
				else{
					continue;
				}
            ts[i]=ss;
            }
        }
        for(int i=0;i<T;i++){
            System.out.println("Case #"+T+1+": ");
            for(int j=0;j<ts[i].length;j++){
                System.out.println(ts[i]);
            }
        }
    }
}