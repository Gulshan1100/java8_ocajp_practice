import java.util.*;
public class Work{
	public static void main(String[] args){
		Scanner s=new Scanner(System.in);
		int t=Integer.parseInt(s.nextLine());
		int[] res=new int[t];
		for(int i=0;i<t;i++){
			String dt=s.nextLine();
			String[] dst=dt.split(" ");
			int days=Integer.parseInt(dst[0]);
			int mxt=Integer.parseInt(dst[1]);
			String kt=s.nextLine();
			String[] kst=kt.split(" ");
			int[] k=new int[kst.length];
			for(int j=0;j<kst.length;j++){
				k[j]=Integer.parseInt(kst[j]);
			}
			int cur=0;
			for(int a=0;a<k.length-1;a++){
				if(k[a]>k[a+1]){
					if(cur==0){
						if((k[a]/2)>mxt){
							continue;
						}
						cur=k[a+1];
						k[a+1]=k[a+1]+k[a]/2;
						k[a]=k[a]-k[a]/2;
					}
					else if(cur!=0){
						if(cur>mxt){
							continue;
						}
						k[a+1]=cur+k[a+1];
						cur=k[a+1]-cur;
					}
				  
				}
				
			}
			if(cur==0){
				res[i]=k[k.length-1];
			}
			else {
				Arrays.sort(k);
				res[i]=k[k.length-1];
			}
		}
		for(int i=0;i<t;i++){
			System.out.print(res[i]);
			if((i+1)<t){
				System.out.println();
			}
		}
	}
}