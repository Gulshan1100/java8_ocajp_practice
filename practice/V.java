import java.util.Scanner;
class V{
	public static void main(String args[]){
		Scanner s=new Scanner(System.in);
		int[] a=new int[10];
		int b=0,c=0;
		for(int i=0;i<a.length;i++){
			a[i]=s.nextInt();
		}
		for(int i=0;c<6;i++){
			if(i==5){
				i=0;
				c=0;
				
			}
			if(a[i]>a[i+1]){
				a[i]=a[i]+a[i+1];
				a[i+1]=a[i]-a[i+1];
				a[i]=a[i]-a[i+1];
				
			}
			else{
				c++;
				continue;
			}
		}
		for(int i=0;i<a.length;i++){
			System.out.println("print: "+a[i]);
		}
	}
}