import java.util.Scanner;
class Mission{
	int low=0,inc=0,h=0;
	public int health(char[][] cave,int a,int b){
		if(h==0){
			return 0;
		}
		else if(cave[a][b]=='o'){
			h=h-low;
		} 
		else if(cave[a][b]=='+'){
			h=h+inc;
		}
		else{
			return 1;
		}
		return 1;
	}
	public static void main(String args[]){
		int n=0,a=0,stp=0;
		Scanner s=new Scanner(System.in);
		n=s.nextInt();
		Mission m=new Mission();
		stp=n/2;
		char cave[][]=new char[n][n];
		m.low=s.nextInt();
		m.inc=s.nextInt();
		m.h=s.nextInt();
		for(int i=0;i<n;i++){
			for(int j=0;j<n;j++){
				cave[i][j]=s.next().charAt(0);
			}
		}
		abc:
		for(int i=a;(i<n)&&(a!=stp&&n!=stp);i++){
			for(int j=a;j<n;j++){
				while(j==n-1){
					while(i==n-1){
						if(m.health(cave,i,j)==0){
							System.out.println("NO");
							return;
						}
						j--;
						while(j==a){
							if(i==a && j==a){
								a=a+1;
								n=n-1;
								continue abc;
							}
							if(m.health(cave,i,j)==0){
								System.out.print("NO");
								return;
							}
							i--;
						}
					}
					if(m.health(cave,i,j)==0){
						System.out.print("NO");
						return;
					}
					i++;
					
				}
				if(m.health(cave,i,j)==0){
					System.out.print("NO");
					return;
				}
				
			}
		}
		if(m.h>0){
			System.out.print("YES");
		}
		else{
			System.out.print("NO");
		}
		
	}
}