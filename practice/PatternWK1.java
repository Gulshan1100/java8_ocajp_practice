import java.util.*;
class PatternWK1{
	public static void main(String args[]){
		Scanner s = new Scanner(System.in);
		int n = Integer.parseInt(s.nextLine());
		int sp = 0;
		
		for(int i =0; i< n*2 ; i++){
			if(i<=n){
				System.out.print("@");
			}
			if(i < n){
				for(int j = 0 ; j<i ; j++){
					System.out.print(" ");
					sp++;
				}
			
			}
			else{
				for(int j = 1; j <= sp ; j++){
					System.out.print(" ");
					
				}
				
			}
			if(i < n){
				for(int k = 0; k< n ;k++){
					System.out.print("*");
					sp++;
				}
			}
			if(i>=n-1){
				System.out.print("@");
			}
			System.out.println();
		}
	}
}