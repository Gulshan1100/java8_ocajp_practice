import java.util.*;
public class Marth{
	public static void main(String[] args){
    	Scanner s=new Scanner(System.in);
      	int n=Integer.parseInt(s.nextLine());
      	int t=Integer.parseInt(s.nextLine());
      	String[] str=new String[n];
      	for(int i=0;i<n;i++){
        	str[i]=s.nextLine();
        }
      	int[][] res=new int[n][];
      	for(int i=0;i<n;i++){
        	String[] s1=str[i].split(" ");
            int[] arr=new int[s1.length];
           for(int j=0;j<s1.length;j++){
           		arr[j]=Integer.parseInt(s1[j]);
           }
           for(int j=2,k=0;j<arr.length-1;k++){
           		res[i][k]=(arr[j-1]*arr[arr.length-1])+(arr[j]*arr[arr.length-1]);
             	if(k>=1){
                	res[i][k]=res[i][k]+res[i][k-1];
                }
				j=j+2;
           }
        }
      int fin=0;
      for(int i=0;i<res[0].length;i++){
        	for(int j=0;j<n-1;j++){
            	if(res[j][i]<res[j+1][i]){
                	fin=j+2;
                }
              else{
              	fin=j+1;
              }
            }
      } 
      
      System.out.print(fin);
    }
}