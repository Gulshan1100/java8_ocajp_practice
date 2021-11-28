import java.util.*;
class Patterns{
	public static void hollowSquare(int n){
		for(int i = 0;i<n;i++){
			for(int j = 0;j<n;j++){
				if(i==0 || i==n-1 || j==0 || j==n-1){
					System.out.print("*");
				}else System.out.print(" ");
			}
			System.out.println();
		}
	}
	public static void rhombus(int n){
		for(int i = 0;i<n;i++){
			
			for(int k=0;k<i;k++){
				System.out.print(" ");
			}
			for(int j = 0;j<n;j++){
				System.out.print("*");
			}
			System.out.println();
		}
		
	}
	
	public static void pyramidStar(int n){
		for(int i = 0;i<n;i++){
			for(int k = n; k>i+1 ;k--){
				System.out.print(" ");
			}
			for(int j = 0;j<=i*2;j++){
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
	public static void hollowPyramidStar(int n){
		for(int i = 0;i<n;i++){
			for(int k = n ; k>i+1; k--){
				System.out.print(" ");
			}
			for(int j = 0;j<=i*2;j++){
				if(i == n-1){
					System.out.print("*");
				}else {
					if(j == 0 || j==(i*2)){
						System.out.print("*");
					} else System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
	
	public static void invertedPyramid(int n){
		for(int i = n;i>=0 ;i--){
			for(int k=n ; k> i ; k--){
				System.out.print(" ");
			}
			for(int j = 0; j<=i*2 ;j++){
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
	public static void halfDiamond(int n){
		for(int i = 0; i<n; i++){
			if(i <= n/2){
				for(int j = 0;j<i ;j++){
					System.out.print("*");
				}
			}else {
				for(int j = i; j<n; j++){
					System.out.print("*");
				}
			}
			System.out.println();
		}
	}
	public static void invertedHalfDiamond(int n){
		for(int i = 0;i<n ;i++){
			if(i <= n/2){
				for(int k=n/2 ;k>i; k--){
					System.out.print(" ");
				}
				for(int j = 0; j<=i ;j++){
					System.out.print("*");
				}
			}else {
				for(int  k = n/2 ; k<i ;k++){
					System.out.print(" ");
				}
				for(int j =i ; j<n ;j++){
					System.out.print("*");
				}
			}
			System.out.println();
		}
	}
	public static void diamondStar(int n){
		for(int i = 0; i<n ;i++){
			if(i<=n/2){
				for(int k=n/2 ; k>i ; k--){
					System.out.print(" ");
				}
				for(int j = 0 ; j<= i*2 ; j++){
					System.out.print("*");
				}
			} else {
				for(int k = n/2 ; k<i ;k++){
					System.out.print(" ");
				}
				for(int j =0 ; j< (n-i)*2 -1 ; j++){
					System.out.print("*");
				}
			}
			System.out.println();
		}
	}
	public static void internalVarsity(int n){
		for(int i=0; i<n; i++){
				if(i==0 || i==n-1){
					for(int j = 0; j<3 ;j++){
						System.out.print("3");
					}
				}else {
					for(int j = 0; j<3 ;j++){
						if(j == 0 || j == 2){
							System.out.print("3");
						}else {
							System.out.print(i);
						}
					}
				
			}
			System.out.println();
		}
	}
	
	public static void main(String args[]){
		Scanner s = new Scanner(System.in);
		
		hollowSquare(5);
		System.out.println();
		rhombus(5);
		System.out.println();
		pyramidStar(5);
		System.out.println();
		hollowPyramidStar(5);
		System.out.println();
		invertedPyramid(5);
		System.out.println();
		halfDiamond(7);
		System.out.println();
		invertedHalfDiamond(7);
		System.out.println();
		diamondStar(7);
		System.out.println();
		internalVarsity(4);
	}
}