import java.util.*;
class AdhaDiamond{
	public static void main(String[] args){
		Scanner s = new Scanner(System.in);
		int n = Integer.parseInt(s.nextLine());
		int j = 0;
		int trck = 1;
		for(int i = 0;trck<n*2;){
			if(trck<=n){
				for(int k = 1;k<=j; k++){
					System.out.print(" ");
				}
				for(int k = 0;k<=i; k++){
					System.out.print("*");
				}
				j++;
				i++;
				trck++;
				System.out.println();
				
			}
			else{
				if(trck==n+1){
					i--;
					
					j--;
				}
				j--;
				for(int k =1; k<=j; k++){
					System.out.print(" ");
				}
				i--;
				for(int k = 0; k<=i;k++){
					System.out.print("*");
				}
				trck++;
				System.out.println();
			
			}
		}
	
	}
}